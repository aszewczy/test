package pl.firstdata.app.agent.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.firstdata.app.agent.config.AppConfig;
import pl.firstdata.app.agent.ws.monitoring.ChannelType;
import pl.firstdata.app.agent.ws.monitoring.ErrorStatusType;
import pl.firstdata.app.agent.ws.monitoring.HeaderType;
import pl.firstdata.app.agent.ws.monitoring.Mon;
import pl.firstdata.app.agent.ws.monitoring.MonService;
import pl.firstdata.app.agent.ws.monitoring.PingRequestType;
import pl.firstdata.app.agent.ws.monitoring.PingResponseType;

/**
 * @author <a href="mailto:anna.szewczyk@firstdata.pl">Anna Szewczyk</a>
 *
 */

@Component
public class MonitoringServiceImpl implements MonitoringService {

	private final String URL_WS = "/PspProxy/mon/Monitoring";

	// private Logger log = Logger.getLogger(MonitoringServiceImpl.class);

	@Autowired
	private AppConfig appProp;

	@Override
	public ResponseMessage isPing() {

		PingResponseType res = null;
		try {
			MonService ws = new MonService(new URL(appProp.getMonitoringServiceUrl() + URL_WS));
			Mon port = ws.getMon();
			((BindingProvider) port).getRequestContext().put("javax.xml.ws.service.endpoint.address",
					appProp.getMonitoringServiceUrl() + URL_WS);
			
			HeaderType headerType = new HeaderType();
			headerType.setChannel(ChannelType.MEMBER);
			headerType.setLang("pl");

			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date());
			XMLGregorianCalendar xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

			headerType.setTimestamp(xCal);
			headerType.setMsgId("FDPMON");

			PingRequestType req = new PingRequestType();
			req.setHeader(headerType);
			res = port.ping(req);
		} catch (Exception ex) {
			//ErrorStatusType.Error error = res.getStatus().getError();
			
			return new ResponseMessage(new Date(), appProp.getNodeId(), "ERROR: Wystąpił bład podczas komunikacji z PSP"  );
		}

		if (res.getStatus().getStatus().value() == "SUCCESS") {
			return new ResponseMessage(new Date(), appProp.getNodeId(), "SUCCESS");
		} else {
			//ErrorStatusType.Error error = res.getStatus().getError();
			return new ResponseMessage(new Date(), appProp.getNodeId(), "ERROR" );
		}
	}


}
