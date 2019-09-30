
package pl.firstdata.app.agent.ws.monitoring;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="amt" use="required" type="{http://www.hp.com/mobicore/xfmf/common}AmountType" />
 *       &lt;attribute name="crcd" use="required" type="{http://www.hp.com/mobicore/xfmf/common}CurrencyCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyType")
public class MoneyType {

    @XmlAttribute(name = "amt", required = true)
    protected BigDecimal amt;
    @XmlAttribute(name = "crcd", required = true)
    protected String crcd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
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

}
