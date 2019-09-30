
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}BodyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://www.hp.com/mobicore/xfmf/common}HeaderType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "header"
})
@XmlSeeAlso({
    PingRequestType.class,
    StatisticsTurnOffRequestType.class,
    StatisticsClearRequestType.class,
    StatisticsRetrieveRequestType.class,
    GetInfoRequestType.class,
    StatisticsTurnOnRequestType.class,
    ListRequestType.class
})
public class RequestType
    extends BodyType
{

    @XmlElement(required = true)
    protected HeaderType header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

}
