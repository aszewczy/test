
package pl.firstdata.app.agent.ws.monitoring;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}MoneyTypeTX">
 *       &lt;attribute name="merchFeeAmt" type="{http://www.hp.com/mobicore/xfmf/common}AmountType" />
 *       &lt;attribute name="cashbackAmt" type="{http://www.hp.com/mobicore/xfmf/common}AmountType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinDataType")
public class FinDataType
    extends MoneyTypeTX
{

    @XmlAttribute(name = "merchFeeAmt")
    protected BigDecimal merchFeeAmt;
    @XmlAttribute(name = "cashbackAmt")
    protected BigDecimal cashbackAmt;

    /**
     * Gets the value of the merchFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMerchFeeAmt() {
        return merchFeeAmt;
    }

    /**
     * Sets the value of the merchFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMerchFeeAmt(BigDecimal value) {
        this.merchFeeAmt = value;
    }

    /**
     * Gets the value of the cashbackAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashbackAmt() {
        return cashbackAmt;
    }

    /**
     * Sets the value of the cashbackAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashbackAmt(BigDecimal value) {
        this.cashbackAmt = value;
    }

}
