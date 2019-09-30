
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}TicketType">
 *       &lt;sequence>
 *         &lt;element name="pinData" type="{http://www.hp.com/mobicore/xfmf/common}PinDataType" minOccurs="0"/>
 *         &lt;element name="ticketEntryMode" type="{http://www.hp.com/mobicore/xfmf/common}TicketEntryModeType" minOccurs="0"/>
 *         &lt;element name="recomendedAuthLevel" type="{http://www.hp.com/mobicore/xfmf/common}RecomemendedAuthLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDetailsType", propOrder = {
    "pinData",
    "ticketEntryMode",
    "recomendedAuthLevel"
})
public class TicketDetailsType
    extends TicketType
{

    protected PinDataType pinData;
    protected TicketEntryModeType ticketEntryMode;
    protected RecomemendedAuthLevelType recomendedAuthLevel;

    /**
     * Gets the value of the pinData property.
     * 
     * @return
     *     possible object is
     *     {@link PinDataType }
     *     
     */
    public PinDataType getPinData() {
        return pinData;
    }

    /**
     * Sets the value of the pinData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDataType }
     *     
     */
    public void setPinData(PinDataType value) {
        this.pinData = value;
    }

    /**
     * Gets the value of the ticketEntryMode property.
     * 
     * @return
     *     possible object is
     *     {@link TicketEntryModeType }
     *     
     */
    public TicketEntryModeType getTicketEntryMode() {
        return ticketEntryMode;
    }

    /**
     * Sets the value of the ticketEntryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketEntryModeType }
     *     
     */
    public void setTicketEntryMode(TicketEntryModeType value) {
        this.ticketEntryMode = value;
    }

    /**
     * Gets the value of the recomendedAuthLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RecomemendedAuthLevelType }
     *     
     */
    public RecomemendedAuthLevelType getRecomendedAuthLevel() {
        return recomendedAuthLevel;
    }

    /**
     * Sets the value of the recomendedAuthLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecomemendedAuthLevelType }
     *     
     */
    public void setRecomendedAuthLevel(RecomemendedAuthLevelType value) {
        this.recomendedAuthLevel = value;
    }

}
