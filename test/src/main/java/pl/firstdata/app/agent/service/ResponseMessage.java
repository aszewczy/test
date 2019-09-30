package pl.firstdata.app.agent.service;

import java.util.Date;

/**
 * @author <a href="mailto:anna.szewczyk@firstdata.pl">Anna Szewczyk</a>
 *
 */

public class ResponseMessage {

	private Date time;
	private String node;
	private String result;
	
	
	public ResponseMessage(Date time, String node, String result) {
		this.time = time;
		this.node = node;
		this.result = result;	
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

}
