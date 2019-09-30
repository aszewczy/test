
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcquirerTicketControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcquirerTicketControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="expiry" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="usageCnt" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerTicketControlType")
public class AcquirerTicketControlType {

    @XmlAttribute(name = "expiry")
    protected Long expiry;
    @XmlAttribute(name = "usageCnt")
    protected Integer usageCnt;

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpiry(Long value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the usageCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsageCnt() {
        return usageCnt;
    }

    /**
     * Sets the value of the usageCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsageCnt(Integer value) {
        this.usageCnt = value;
    }

}
