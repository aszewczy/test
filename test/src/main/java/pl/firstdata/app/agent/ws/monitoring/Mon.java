package pl.firstdata.app.agent.ws.monitoring;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.9
 * Tue Aug 27 14:58:33 CEST 2019
 * Generated source version: 2.2.9
 * 
 */
 
@WebService(targetNamespace = "http://www.hp.com/mobicore/services/mon", name = "Mon")
@XmlSeeAlso({ObjectFactory.class})
public interface Mon {

    @WebMethod
    @RequestWrapper(localName = "statisticsClear", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsClear")
    @ResponseWrapper(localName = "statisticsClearResponse", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsClearResponse")
    @WebResult(name = "response", targetNamespace = "")
    public pl.firstdata.app.agent.ws.monitoring.StatisticsClearResponseType statisticsClear(
        @WebParam(name = "request", targetNamespace = "")
        pl.firstdata.app.agent.ws.monitoring.StatisticsClearRequestType request
    );

    @WebMethod
    @RequestWrapper(localName = "statisticsRetrieve", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsRetrieve")
    @ResponseWrapper(localName = "statisticsRetrieveResponse", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsRetrieveResponse")
    @WebResult(name = "response", targetNamespace = "")
    public pl.firstdata.app.agent.ws.monitoring.StatisticsRetrieveResponseType statisticsRetrieve(
        @WebParam(name = "request", targetNamespace = "")
        pl.firstdata.app.agent.ws.monitoring.StatisticsRetrieveRequestType request
    );

    @WebMethod
    @RequestWrapper(localName = "statisticsTurnOn", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsTurnOn")
    @ResponseWrapper(localName = "statisticsTurnOnResponse", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsTurnOnResponse")
    @WebResult(name = "response", targetNamespace = "")
    public pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOnResponseType statisticsTurnOn(
        @WebParam(name = "request", targetNamespace = "")
        pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOnRequestType request
    );

    @WebMethod
    @RequestWrapper(localName = "getComponentInfo", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.GetComponentInfo")
    @ResponseWrapper(localName = "getComponentInfoResponse", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.GetComponentInfoResponse")
    @WebResult(name = "response", targetNamespace = "")
    public pl.firstdata.app.agent.ws.monitoring.GetInfoResponseType getComponentInfo(
        @WebParam(name = "request", targetNamespace = "")
        pl.firstdata.app.agent.ws.monitoring.GetInfoRequestType request
    );

    @WebMethod
    @RequestWrapper(localName = "ping", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.PingResponse")
    @WebResult(name = "response", targetNamespace = "")
    public pl.firstdata.app.agent.ws.monitoring.PingResponseType ping(
        @WebParam(name = "request", targetNamespace = "")
        pl.firstdata.app.agent.ws.monitoring.PingRequestType request
    );

    @WebMethod
    @RequestWrapper(localName = "statisticsTurnOff", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsTurnOff")
    @ResponseWrapper(localName = "statisticsTurnOffResponse", targetNamespace = "http://www.hp.com/mobicore/services/mon", className = "pl.firstdata.app.agent.ws.monitoring1.StatisticsTurnOffResponse")
    @WebResult(name = "response", targetNamespace = "")
    public pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOffResponseType statisticsTurnOff(
        @WebParam(name = "request", targetNamespace = "")
        pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOffRequestType request
    );
}