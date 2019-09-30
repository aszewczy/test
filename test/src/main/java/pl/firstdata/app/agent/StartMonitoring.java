package pl.firstdata.app.agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import pl.firstdata.app.agent.service.MonitoringServiceImpl;
import pl.firstdata.app.agent.service.ResponseMessage;
import pl.firstdata.app.response.message.ResponseLogger;

@Component
public class StartMonitoring {

	@Autowired
	private MonitoringServiceImpl mon;
	

	@Autowired
	private ResponseLogger responseMessage;

	@Scheduled(fixedRateString = "${app.monitoring-interval}")
	public void start() {
		ResponseMessage response;
		response = mon.isPing();
		responseMessage.log(response.getNode(), response.getResult());
	}
}
