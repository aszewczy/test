package pl.firstdata.app.agent.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:anna.szewczyk@firstdata.pl">Anna Szewczyk</a>
 *
 */

@Configuration
@ConfigurationProperties("app")
public class AppConfig {

	
	private String monitoringServiceUrl;
	private String nodeId;
	private String outputFileName;
	private String maxSize;
	
	public String getMonitoringServiceUrl() {
		return monitoringServiceUrl;
	}

	public void setMonitoringServiceUrl(String monitoringServiceUrl) {
		this.monitoringServiceUrl = monitoringServiceUrl;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getOutputFileName() {
		return outputFileName;
	}

	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	public String getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(String maxSize) {
		this.maxSize = maxSize;
	}
	
	
	

	
	

	
	
}
