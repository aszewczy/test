
package pl.firstdata.app.agent.ws.monitoring;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * parametry autop�atno�ci
 * 
 * <p>Java class for AutopaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutopaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="frequency">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="4"/>
 *             &lt;maxLength value="5"/>
 *             &lt;pattern value="[1-9][DWMQY][ANP]([0-9]{1,2}|E)"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="totLimitAmt" type="{http://www.hp.com/mobicore/xfmf/common}AmountType" />
 *       &lt;attribute name="limitAmt" type="{http://www.hp.com/mobicore/xfmf/common}AmountType" />
 *       &lt;attribute name="crcd" type="{http://www.hp.com/mobicore/xfmf/common}CurrencyCodeType" />
 *       &lt;attribute name="totLimitCnt" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutopaymentType")
public class AutopaymentType {

    @XmlAttribute(name = "expirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "frequency")
    protected String frequency;
    @XmlAttribute(name = "totLimitAmt")
    protected BigDecimal totLimitAmt;
    @XmlAttribute(name = "limitAmt")
    protected BigDecimal limitAmt;
    @XmlAttribute(name = "crcd")
    protected String crcd;
    @XmlAttribute(name = "totLimitCnt")
    protected Integer totLimitCnt;
    @XmlAttribute(name = "mandatory")
    protected Boolean mandatory;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the totLimitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotLimitAmt() {
        return totLimitAmt;
    }

    /**
     * Sets the value of the totLimitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotLimitAmt(BigDecimal value) {
        this.totLimitAmt = value;
    }

    /**
     * Gets the value of the limitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitAmt() {
        return limitAmt;
    }

    /**
     * Sets the value of the limitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimitAmt(BigDecimal value) {
        this.limitAmt = value;
    }

    /**
     * Gets the value of the crcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrcd() {
        return crcd;
    }

    /**
     * Sets the value of the crcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrcd(String value) {
        this.crcd = value;
    }

    /**
     * Gets the value of the totLimitCnt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotLimitCnt() {
        return totLimitCnt;
    }

    /**
     * Sets the value of the totLimitCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotLimitCnt(Integer value) {
        this.totLimitCnt = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatory(Boolean value) {
        this.mandatory = value;
    }

}
