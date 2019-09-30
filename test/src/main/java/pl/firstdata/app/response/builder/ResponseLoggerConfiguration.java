package pl.firstdata.app.response.builder;

import static pl.firstdata.app.response.builder.Constants.DEFAULT_FILE_NAME;
import static pl.firstdata.app.response.builder.Constants.MAX_LOG_SIZE_BOUND;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ResponseLoggerConfiguration {
	private final Long maxSize;
	private final String outputFileName;

	private ResponseLoggerConfiguration(final Builder builder) {
		this.maxSize = builder.maxSize;
		this.outputFileName = builder.outputFileName;
	}

	public Long getMaxSize() {
		return maxSize;
	}

	public String getOutputFileName() {
		return outputFileName;
	}

	public static class Builder {
		private Long maxSize;
		private String outputFileName;

		public Builder withConfigurationFile(final String configurationFile) {
			loadParams(configurationFile);
			return this;
		}

		/**
		 * @param maxSize: the value could be set as a Number, or it could be used with
		 *        type of memory ( no sensitive case) 1T, 1t - One Terra byte 1G, 1g -
		 *        One Gigabyte 1M, 1m - One Megabyte 1K, 1k - one Kilobyte
		 */
		public Builder withMaxSize(final String maxSize) {
			this.maxSize = parseMaxLogSize(maxSize);
			return this;
		}

		public Builder withOutputFileName(final String outputFileName) {
			this.outputFileName = outputFileName;
			return this;
		}

		public ResponseLoggerConfiguration build() {
			return new ResponseLoggerConfiguration(this);
		}

		long parseMaxLogSize(String maxLogSizeStr) {
			long maxLogSize = MAX_LOG_SIZE_BOUND;
			if (maxLogSizeStr != null) {
				maxLogSizeStr = escape(maxLogSizeStr);
				maxLogSizeStr = maxLogSizeStr.trim().toUpperCase();
				if (maxLogSizeStr.endsWith("T") || maxLogSizeStr.endsWith("t")) {
					maxLogSizeStr = maxLogSizeStr.substring(0, maxLogSizeStr.length() - 1);
					try {
						maxLogSize = Long.parseLong(maxLogSizeStr) * 1024L * 1024L * 1024L * 1024L;
					} catch (NumberFormatException ex) {
						throw new RuntimeException("Could not parse a long in " + maxLogSizeStr, ex);
					}
				} else if (maxLogSizeStr.endsWith("G") || maxLogSizeStr.endsWith("g")) {
					maxLogSizeStr = maxLogSizeStr.substring(0, maxLogSizeStr.length() - 1);
					try {
						maxLogSize = Long.parseLong(maxLogSizeStr) * 1024L * 1024L * 1024L;
					} catch (NumberFormatException ex) {
						throw new RuntimeException("Could not parse a long in " + maxLogSizeStr, ex);
					}
				} else if (maxLogSizeStr.endsWith("M") || maxLogSizeStr.endsWith("m")) {
					maxLogSizeStr = maxLogSizeStr.substring(0, maxLogSizeStr.length() - 1);
					try {
						maxLogSize = Long.parseLong(maxLogSizeStr) * 1024L * 1024L;
					} catch (NumberFormatException ex) {
						throw new RuntimeException("Could not parse a long in " + maxLogSizeStr, ex);
					}
				} else if (maxLogSizeStr.endsWith("K") || maxLogSizeStr.endsWith("k")) {
					maxLogSizeStr = maxLogSizeStr.substring(0, maxLogSizeStr.length() - 1);
					try {
						maxLogSize = Long.parseLong(maxLogSizeStr) * 1024L;
					} catch (NumberFormatException ex) {
						throw new RuntimeException("Could not parse a long in " + maxLogSizeStr, ex);
					}
				} else {
					try {
						maxLogSize = Long.parseLong(maxLogSizeStr);
					} catch (NumberFormatException ex) {
						throw new RuntimeException("Could not parse a long in " + maxLogSizeStr, ex);
					}
				}
			}
			return maxLogSize;
		}

		void loadParams(String configurationFile) {
			InputStream fileStream;
			try {
				fileStream = ResponseLoggerConfiguration.class.getResourceAsStream(configurationFile);
				if (fileStream == null) {
					fileStream = new FileInputStream(new File(configurationFile));
				}
				Properties props = new Properties();
				props.load(fileStream);
				withMaxSize("" + MAX_LOG_SIZE_BOUND);
				withOutputFileName(""+ DEFAULT_FILE_NAME);
			} catch (Exception e) {
				throw new RuntimeException(e.getMessage(), e);
			}
		}

		private String escape(final String maxLogSize) {
			return maxLogSize.trim().replace("\\", "\\\\").replace("\b", "\\b").replace("\n", "\\n")
					.replace("\t", "\\t").replace("\r", "\\r").replace("\f", "\\f").replaceAll("\'", "")
					.replaceAll("\"", "");
		}
	}
}
