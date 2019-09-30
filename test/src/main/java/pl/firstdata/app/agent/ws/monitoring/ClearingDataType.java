
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClearingDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="clsMethod" use="required" type="{http://www.hp.com/mobicore/xfmf/common}ClsMethodType" />
 *       &lt;attribute name="clsStatus" use="required" type="{http://www.hp.com/mobicore/xfmf/common}ClearingStatusType" />
 *       &lt;attribute name="clsId" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="clsDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingDataType")
public class ClearingDataType {

    @XmlAttribute(name = "clsMethod", required = true)
    protected ClsMethodType clsMethod;
    @XmlAttribute(name = "clsStatus", required = true)
    protected ClearingStatusType clsStatus;
    @XmlAttribute(name = "clsId", required = true)
    protected String clsId;
    @XmlAttribute(name = "clsDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsDate;

    /**
     * Gets the value of the clsMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ClsMethodType }
     *     
     */
    public ClsMethodType getClsMethod() {
        return clsMethod;
    }

    /**
     * Sets the value of the clsMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsMethodType }
     *     
     */
    public void setClsMethod(ClsMethodType value) {
        this.clsMethod = value;
    }

    /**
     * Gets the value of the clsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingStatusType }
     *     
     */
    public ClearingStatusType getClsStatus() {
        return clsStatus;
    }

    /**
     * Sets the value of the clsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingStatusType }
     *     
     */
    public void setClsStatus(ClearingStatusType value) {
        this.clsStatus = value;
    }

    /**
     * Gets the value of the clsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsId() {
        return clsId;
    }

    /**
     * Sets the value of the clsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsId(String value) {
        this.clsId = value;
    }

    /**
     * Gets the value of the clsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsDate() {
        return clsDate;
    }

    /**
     * Sets the value of the clsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClsDate(XMLGregorianCalendar value) {
        this.clsDate = value;
    }

}
