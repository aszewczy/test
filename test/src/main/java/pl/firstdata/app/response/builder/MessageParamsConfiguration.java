package pl.firstdata.app.response.builder;

/**
 * @author <a href="mailto:anna.szewczyk@firstdata.pl">Anna Szewczyk</a>
 *
 */

public class MessageParamsConfiguration {
	private MessageParams messageParams;

	public MessageParamsConfiguration() {
	}

	public synchronized void setMessageParams(MessageParams messageParams) {
		this.messageParams = messageParams;
	}

	public synchronized MessageParams getMessageParams() {
		return new MessageParams(messageParams);
	}
}
