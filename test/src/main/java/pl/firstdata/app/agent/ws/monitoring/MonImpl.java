
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package pl.firstdata.app.agent.ws.monitoring;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.2.9
 * Tue Aug 27 14:58:33 CEST 2019
 * Generated source version: 2.2.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "MonService",
                      portName = "Mon",
                      targetNamespace = "http://www.hp.com/mobicore/services/mon",
                      wsdlLocation = "file:Monitoring.wsdl",
                      endpointInterface = "pl.firstdata.app.agent.ws.monitoring1.Mon")
                      
public class MonImpl implements Mon {

    private static final Logger LOG = Logger.getLogger(MonImpl.class.getName());

    /* (non-Javadoc)
     * @see pl.firstdata.app.agent.ws.monitoring1.Mon#statisticsClear(pl.firstdata.app.agent.ws.monitoring1.StatisticsClearRequestType  request )*
     */
    public pl.firstdata.app.agent.ws.monitoring.StatisticsClearResponseType statisticsClear(pl.firstdata.app.agent.ws.monitoring.StatisticsClearRequestType request) { 
        LOG.info("Executing operation statisticsClear");
        System.out.println(request);
        try {
            pl.firstdata.app.agent.ws.monitoring.StatisticsClearResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see pl.firstdata.app.agent.ws.monitoring1.Mon#statisticsRetrieve(pl.firstdata.app.agent.ws.monitoring1.StatisticsRetrieveRequestType  request )*
     */
    public pl.firstdata.app.agent.ws.monitoring.StatisticsRetrieveResponseType statisticsRetrieve(pl.firstdata.app.agent.ws.monitoring.StatisticsRetrieveRequestType request) { 
        LOG.info("Executing operation statisticsRetrieve");
        System.out.println(request);
        try {
            pl.firstdata.app.agent.ws.monitoring.StatisticsRetrieveResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see pl.firstdata.app.agent.ws.monitoring1.Mon#statisticsTurnOn(pl.firstdata.app.agent.ws.monitoring1.StatisticsTurnOnRequestType  request )*
     */
    public pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOnResponseType statisticsTurnOn(pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOnRequestType request) { 
        LOG.info("Executing operation statisticsTurnOn");
        System.out.println(request);
        try {
            pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOnResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see pl.firstdata.app.agent.ws.monitoring1.Mon#getComponentInfo(pl.firstdata.app.agent.ws.monitoring1.GetInfoRequestType  request )*
     */
    public pl.firstdata.app.agent.ws.monitoring.GetInfoResponseType getComponentInfo(pl.firstdata.app.agent.ws.monitoring.GetInfoRequestType request) { 
        LOG.info("Executing operation getComponentInfo");
        System.out.println(request);
        try {
            pl.firstdata.app.agent.ws.monitoring.GetInfoResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see pl.firstdata.app.agent.ws.monitoring1.Mon#ping(pl.firstdata.app.agent.ws.monitoring1.PingRequestType  request )*
     */
    public pl.firstdata.app.agent.ws.monitoring.PingResponseType ping(pl.firstdata.app.agent.ws.monitoring.PingRequestType request) { 
        LOG.info("Executing operation ping");
        System.out.println(request);
        try {
            pl.firstdata.app.agent.ws.monitoring.PingResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see pl.firstdata.app.agent.ws.monitoring1.Mon#statisticsTurnOff(pl.firstdata.app.agent.ws.monitoring1.StatisticsTurnOffRequestType  request )*
     */
    public pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOffResponseType statisticsTurnOff(pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOffRequestType request) { 
        LOG.info("Executing operation statisticsTurnOff");
        System.out.println(request);
        try {
            pl.firstdata.app.agent.ws.monitoring.StatisticsTurnOffResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
