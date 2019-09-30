package pl.firstdata.app.response.builder;

import java.text.SimpleDateFormat;

public class Constants {

    /**
     * Default log filename pattern, namely "log_%d_%u"
     */
    public static String DEFAULT_FILE_NAME = "monitoring_service";
    /**
     * The default value for log size bound, namely 10MiB = 10485760 bytes
     */
    public static final long MAX_LOG_SIZE_BOUND = 10 * 1024 * 1026;
    /**
     * The minimum value of log size bound, namely 1MB= 1 * 1024 * 1026 bytes
     */
    public static final long MINIMUM_LOG_SIZE_BOUND = 1024 * 1026;

    public static SimpleDateFormat patternDateFormat = new SimpleDateFormat("yyyy-MM-dd");

}
