
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statisticsRetrieveRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statisticsRetrieveRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}RequestType">
 *       &lt;sequence>
 *         &lt;element name="withClear" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statisticsRetrieveRequestType", namespace = "http://www.hp.com/mobicore/xfmf/mon", propOrder = {
    "withClear"
})
public class StatisticsRetrieveRequestType
    extends RequestType
{

    protected boolean withClear;

    /**
     * Gets the value of the withClear property.
     * 
     */
    public boolean isWithClear() {
        return withClear;
    }

    /**
     * Sets the value of the withClear property.
     * 
     */
    public void setWithClear(boolean value) {
        this.withClear = value;
    }

}
