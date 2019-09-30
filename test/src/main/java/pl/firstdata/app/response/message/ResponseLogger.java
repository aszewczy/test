package pl.firstdata.app.response.message;

import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import pl.firstdata.app.response.builder.MessageParams;
import pl.firstdata.app.response.builder.MessageParamsConfiguration;
import pl.firstdata.app.response.builder.ResponseLoggerConfiguration;


public class ResponseLogger {
	
    private final ResponseLoggerConfiguration loggerConfiguration;
    private final MessageParamsConfiguration messageParametersConfiguration;
    private final Logger logger;


    public ResponseLogger(ResponseLoggerConfiguration responseLoggerConfiguration, MessageParamsConfiguration messageParamsConfiguration) {
        this.logger = Logger.getLogger(ResponseLogger.class.getName());
        this.loggerConfiguration = responseLoggerConfiguration;
        this.messageParametersConfiguration = messageParamsConfiguration;
        configure();
        LogManager.getLogManager().addLogger(logger);
    }

    public void log( final String node, final String result) {
    	MessageParams messageParams = new MessageParams();
    	messageParams.setNode(node);
    	messageParams.setResult(result);
        log(messageParams);
    }

    private void log(MessageParams messageParams) {
        messageParametersConfiguration.setMessageParams(messageParams);
        String msg = messageParams.getResult();
        logger.info(msg);
    }

    private void configure() {
        try {
            logger.setUseParentHandlers(false);
            for (Handler handler : logger.getHandlers()) {
                logger.removeHandler(handler);
            }
            logger.addHandler(new SizeRollingFileHandler(loggerConfiguration, messageParametersConfiguration));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
