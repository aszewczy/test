package pl.firstdata.app.response.builder;

/**
 * @author <a href="mailto:anna.szewczyk@firstdata.pl">Anna Szewczyk</a>
 *
 */

public class MessageParams {

	private String node;
	private String result;

	public MessageParams() {
	}

	public MessageParams(MessageParams messageParams) {
		this.node = messageParams.getNode();
		this.result = messageParams.getResult();
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}
}
