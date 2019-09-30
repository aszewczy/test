package pl.firstdata.app.response.message;
import static pl.firstdata.app.response.builder.Constants.DEFAULT_FILE_NAME;
import static pl.firstdata.app.response.builder.Constants.MAX_LOG_SIZE_BOUND;
import static pl.firstdata.app.response.builder.Constants.MINIMUM_LOG_SIZE_BOUND;
import static pl.firstdata.app.response.builder.Constants.patternDateFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.ErrorManager;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

import static java.util.Objects.requireNonNull;
import pl.firstdata.app.response.builder.MessageParamsConfiguration;
import pl.firstdata.app.response.builder.ResponseLoggerConfiguration;

class SizeRollingFileHandler extends StreamHandler {
    private File currentLogFile;
    private FileOutputStream fos;
    private long logSizeBound;
    private long unique = 0;
    private final MessageParamsConfiguration messageParametersConfiguration;
    private final ResponseLoggerConfiguration loggerConfiguration;

    SizeRollingFileHandler(final ResponseLoggerConfiguration loggerConfiguration, final MessageParamsConfiguration messageParametersConfiguration) {
        super();
        requireNonNull(messageParametersConfiguration, "Message Configuration parameters can't be null");
        this.loggerConfiguration = loggerConfiguration;
        this.messageParametersConfiguration = messageParametersConfiguration;
        setLogSizeBound(loggerConfiguration.getMaxSize());
        createNewLogFile();
    }

    @Override
    public synchronized void publish(LogRecord record) {
        if (!isLoggable(record)) {
            return;
        }
        String recordMsg = getFormatter().format(record);
        long msgLength = recordMsg.length();
        long currentLogFileLength = currentLogFile.length();
        long size = currentLogFileLength + msgLength;

        if (hasToRenameFile(currentLogFile, size)) {
            boolean isNewDay = newDay(currentLogFile);
            unique = isNewDay ? 0L : (++unique);
            rotateLogFile(record);
        }

        super.publish(record);
        super.flush();
    }

    /**
     * Return the <tt>Formatter</tt> for this <tt>Handler</tt>. If the
     * superclass's getFormatter () method returns null, creates a new
     * <tt>DefaultFormatter</tt> instance and sets it as the formatter.
     *
     * @return the <tt>Formatter</tt> (may <b>not</b> be null).
     * @see Formatter
     * @see ResponseFormatter
     */
    @Override
    public Formatter getFormatter() {
        Formatter formatter = new ResponseFormatter(messageParametersConfiguration);
        setFormatter(formatter);
        return formatter;
    }

    @Override
    public void flush() {
        try {
            if (fos != null) {
                fos.flush();
            }
        } catch (IOException ex) {
            reportError(null, ex, ErrorManager.FLUSH_FAILURE);
        }
    }

    @Override
    public void close() throws SecurityException {
        try {
            if (fos != null)
                fos.close();
        } catch (IOException ex) {
            reportError(null, ex, ErrorManager.CLOSE_FAILURE);
        }
    }

    @Override
    protected void reportError(final String msg, final Exception ex, final int code) {
        super.reportError(msg, ex, code);
        throw new RuntimeException(msg, ex);
    }

    private void createNewLogFile() {
        try {
            currentLogFile = new File(escapeLogFileName(now()));
            long size = currentLogFile.length();
            boolean hasToRename = hasToRenameFile(currentLogFile, size);

            if (currentLogFile.exists() && hasToRename) {
                renameCurrentLogFile(now().getTime());
            }

            if (!currentLogFile.exists()) {
                boolean createSuccess = currentLogFile.createNewFile();
                if (!createSuccess) {
                    reportError("Could not create log currentLogFile (no exception thrown): " + currentLogFile.getAbsolutePath(), null, ErrorManager.OPEN_FAILURE);
                }
            }

            fos = new FileOutputStream(currentLogFile, true);
            super.setOutputStream(fos);
        } catch (FileNotFoundException ex) {
            reportError("FileNotFoundException when creating FileOutputStream for log currentLogFile: " + currentLogFile.getAbsolutePath(), ex, ErrorManager.OPEN_FAILURE);
        } catch (IOException ex) {
            reportError("Could not create log currentLogFile (with exception): " + currentLogFile.getAbsolutePath(), ex, ErrorManager.OPEN_FAILURE);
        }

        Formatter formatter = getFormatter();
        if (formatter != null) {
            String head = formatter.getHead(this);
            try {
                fos.write(head.getBytes());
            } catch (IOException ex) {
                reportError("IOException when writing head for log currentLogFile: " + currentLogFile.getAbsolutePath(), ex, ErrorManager.GENERIC_FAILURE);
            }
        }
    }

    private void rotateLogFile(LogRecord record) {
        try {
            renameCurrentLogFile(record.getMillis());
            this.currentLogFile = new File(escapeLogFileName(now()));
            fos = new FileOutputStream(currentLogFile);
        } catch (IOException ex) {
            reportError(ex.getMessage(), ex, ErrorManager.GENERIC_FAILURE);
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            reportError(ex.getMessage(), ex, ErrorManager.GENERIC_FAILURE);
        }

        super.setOutputStream(fos);
    }

    private void renameCurrentLogFile(final Long milliSeconds) {
        String renamedFileName = renameLogFileName(now(milliSeconds));
        flush();
        super.flush();
        close();
        File renamedFile = new File(renamedFileName);
        currentLogFile.renameTo(renamedFile);
    }

    private void setLogSizeBound(long logSizeBound) {
        if (logSizeBound < MINIMUM_LOG_SIZE_BOUND) {
            logSizeBound = MINIMUM_LOG_SIZE_BOUND;
        }

        this.logSizeBound = logSizeBound;
    }

    private synchronized String renameLogFileName(Date date) {
        String dateStr = patternDateFormat.format(date);

        String renameFilePattern = renamedFilePattern(loggerConfiguration.getOutputFileName());
        String prePattern = renameFilePattern.replaceAll("%d", dateStr);


        String filename = prePattern.replaceAll("%u", String.valueOf(unique));
        // Moving to a new date. Maybe we should find a new unique number
        File logFile = new File(filename);
        while (logFile.exists()) {
            unique++;
            filename = prePattern.replaceAll("%u", String.valueOf(unique));
            logFile = new File(filename);
        }
        return filename;
    }

    private String escape(String fileName) {
        if (fileName == null) {
            fileName = DEFAULT_FILE_NAME;
        }

        if (fileName.length() < 1) {
            throw new IllegalArgumentException("Pattern length is less than 1");
        }

        fileName = fileName.replaceAll("_%d", "").replaceAll("_%u", "");
        if (fileName.contains(".txt")) {
            fileName = fileName.replaceAll(".txt", "");
        }
        return fileName;
    }

    private String escapeLogFileName(Date now) {
        String logFileName = escape(loggerConfiguration.getOutputFileName());
        return String.format("%s_%s.txt", logFileName, patternDateFormat.format(now));
    }

    private String renamedFilePattern(String fileName) {
        fileName = escape(fileName);
        fileName += "_%d";
        fileName += "_%u";
        fileName += ".txt";
        return fileName;
    }

    private boolean newDay(final File file) {
        final String dateStr = patternDateFormat.format(now());
        return !file.getName().contains(dateStr);
    }

    private Date now() {
        return new Date();
    }

    private Date now(final Long milliSeconds) {
        return new Date(milliSeconds);
    }

    private boolean hasToRenameFile(final File currentLogFile, final long size) {
        boolean overSize = (size > logSizeBound) || size > MAX_LOG_SIZE_BOUND;
        boolean isNewDay = newDay(currentLogFile);
        return overSize || isNewDay;
    }
}
