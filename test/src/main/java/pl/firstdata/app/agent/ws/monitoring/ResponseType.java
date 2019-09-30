
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * abstrakcyjny typ, kt�rego implementacje definiuj� biznesow� zawarto�� odpowiedzi komunikat�w xfmf
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}BodyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.hp.com/mobicore/xfmf/common}StatusBlockType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "status"
})
@XmlSeeAlso({
    StatisticsRetrieveResponseType.class,
    PingResponseType.class,
    GetInfoResponseType.class,
    StatisticsTurnOffResponseType.class,
    StatisticsClearResponseType.class,
    StatisticsTurnOnResponseType.class,
    ListResponseType.class
})
public abstract class ResponseType
    extends BodyType
{

    @XmlElement(required = true)
    protected StatusBlockType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusBlockType }
     *     
     */
    public StatusBlockType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusBlockType }
     *     
     */
    public void setStatus(StatusBlockType value) {
        this.status = value;
    }

}
