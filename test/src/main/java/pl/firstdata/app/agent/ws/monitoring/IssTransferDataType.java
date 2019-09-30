
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IssTransferDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssTransferDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.hp.com/mobicore/xfmf/common}TasTransferTypeType" />
 *       &lt;attribute name="subType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="senderDataVisibility" use="required" type="{http://www.hp.com/mobicore/xfmf/common}UserVisibilityType" />
 *       &lt;attribute name="deliveryOption" use="required" type="{http://www.hp.com/mobicore/xfmf/common}DeliveryOptionType" />
 *       &lt;attribute name="transferDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="locDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="validDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssTransferDataType")
public class IssTransferDataType {

    @XmlAttribute(name = "type", required = true)
    protected TasTransferTypeType type;
    @XmlAttribute(name = "subType")
    protected String subType;
    @XmlAttribute(name = "senderDataVisibility", required = true)
    protected UserVisibilityType senderDataVisibility;
    @XmlAttribute(name = "deliveryOption", required = true)
    protected DeliveryOptionType deliveryOption;
    @XmlAttribute(name = "transferDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transferDate;
    @XmlAttribute(name = "locDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar locDate;
    @XmlAttribute(name = "validDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validDate;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TasTransferTypeType }
     *     
     */
    public TasTransferTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasTransferTypeType }
     *     
     */
    public void setType(TasTransferTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the senderDataVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link UserVisibilityType }
     *     
     */
    public UserVisibilityType getSenderDataVisibility() {
        return senderDataVisibility;
    }

    /**
     * Sets the value of the senderDataVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVisibilityType }
     *     
     */
    public void setSenderDataVisibility(UserVisibilityType value) {
        this.senderDataVisibility = value;
    }

    /**
     * Gets the value of the deliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOptionType }
     *     
     */
    public DeliveryOptionType getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Sets the value of the deliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOptionType }
     *     
     */
    public void setDeliveryOption(DeliveryOptionType value) {
        this.deliveryOption = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDate(XMLGregorianCalendar value) {
        this.transferDate = value;
    }

    /**
     * Gets the value of the locDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocDate() {
        return locDate;
    }

    /**
     * Sets the value of the locDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocDate(XMLGregorianCalendar value) {
        this.locDate = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDate(XMLGregorianCalendar value) {
        this.validDate = value;
    }

}
