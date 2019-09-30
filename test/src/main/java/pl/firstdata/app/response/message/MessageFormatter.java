package pl.firstdata.app.response.message;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageFormatter {

	private static final String COMMA_SEPARATOR = ", ";

	private static SimpleDateFormat RESPONSE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	public static String formatLogEntry(Date timestamp, String node, String result) {

		StringBuilder stringBuilder;
		stringBuilder = new StringBuilder();
		String stringTimestamp;
		Date d = timestamp == null ? new Date() : timestamp;
		stringTimestamp = RESPONSE_DATE_FORMAT.format(d);
		stringBuilder.append(stringTimestamp);
		stringBuilder.append(COMMA_SEPARATOR);
		stringBuilder.append(node);
		stringBuilder.append(COMMA_SEPARATOR);
		stringBuilder.append(result);
		String finalString = stringBuilder.toString();

		return finalString;
	}

}
