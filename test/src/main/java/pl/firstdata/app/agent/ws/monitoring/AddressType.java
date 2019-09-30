
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="line-1" use="required" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *       &lt;attribute name="line-2" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *       &lt;attribute name="city" use="required" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *       &lt;attribute name="cntry" use="required" type="{http://www.hp.com/mobicore/xfmf/common}CountryCodeType" />
 *       &lt;attribute name="zip">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType")
public class AddressType {

    @XmlAttribute(name = "line-1", required = true)
    protected String line1;
    @XmlAttribute(name = "line-2")
    protected String line2;
    @XmlAttribute(name = "city", required = true)
    protected String city;
    @XmlAttribute(name = "cntry", required = true)
    protected String cntry;
    @XmlAttribute(name = "zip")
    protected String zip;

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntry() {
        return cntry;
    }

    /**
     * Sets the value of the cntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntry(String value) {
        this.cntry = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

}
