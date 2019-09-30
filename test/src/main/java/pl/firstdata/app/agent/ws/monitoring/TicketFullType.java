
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketFullType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketFullType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="zone" use="required" type="{http://www.hp.com/mobicore/xfmf/common}TicketZoneType" />
 *       &lt;attribute name="ticket" use="required" type="{http://www.hp.com/mobicore/xfmf/common}TicketBodyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketFullType")
public class TicketFullType {

    @XmlAttribute(name = "zone", required = true)
    protected int zone;
    @XmlAttribute(name = "ticket", required = true)
    protected String ticket;

    /**
     * Gets the value of the zone property.
     * 
     */
    public int getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     */
    public void setZone(int value) {
        this.zone = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

}
