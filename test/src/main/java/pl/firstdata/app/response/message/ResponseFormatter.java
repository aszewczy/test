package pl.firstdata.app.response.message;

import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

import pl.firstdata.app.response.builder.MessageParams;
import pl.firstdata.app.response.builder.MessageParamsConfiguration;


class ResponseFormatter extends SimpleFormatter {

    private final MessageParamsConfiguration messageParametersConfiguration;

    ResponseFormatter(MessageParamsConfiguration messageParametersConfiguration) {
        this.messageParametersConfiguration = messageParametersConfiguration;
    }

    @Override
    public synchronized String format(final LogRecord logRecord) {
    	MessageParams messageParams = messageParametersConfiguration.getMessageParams();
  
        String logEntry;
        try {
            logEntry = MessageFormatter.formatLogEntry(
                    new Date(logRecord.getMillis()),
                    messageParams.getNode(),
                    messageParams.getResult()
            );
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }

        return logEntry + "\n";
    }
}
