
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasMobpayTxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AliasMobpayTxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}AliasMobpayType">
 *       &lt;sequence>
 *         &lt;element name="autopayment" type="{http://www.hp.com/mobicore/xfmf/common}AutopaymentType" minOccurs="0"/>
 *         &lt;element name="aliasLabel">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasMobpayTxType", propOrder = {
    "autopayment",
    "aliasLabel"
})
public class AliasMobpayTxType
    extends AliasMobpayType
{

    protected AutopaymentType autopayment;
    @XmlElement(required = true)
    protected String aliasLabel;

    /**
     * Gets the value of the autopayment property.
     * 
     * @return
     *     possible object is
     *     {@link AutopaymentType }
     *     
     */
    public AutopaymentType getAutopayment() {
        return autopayment;
    }

    /**
     * Sets the value of the autopayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutopaymentType }
     *     
     */
    public void setAutopayment(AutopaymentType value) {
        this.autopayment = value;
    }

    /**
     * Gets the value of the aliasLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasLabel() {
        return aliasLabel;
    }

    /**
     * Sets the value of the aliasLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasLabel(String value) {
        this.aliasLabel = value;
    }

}
