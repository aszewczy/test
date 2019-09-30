
package pl.firstdata.app.agent.ws.monitoring;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinTransferDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinTransferDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}MoneyTypeTX">
 *       &lt;attribute name="commissionAmt" type="{http://www.hp.com/mobicore/xfmf/common}AmountType" />
 *       &lt;attribute name="commissionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinTransferDataType")
public class FinTransferDataType
    extends MoneyTypeTX
{

    @XmlAttribute(name = "commissionAmt")
    protected BigDecimal commissionAmt;
    @XmlAttribute(name = "commissionType")
    protected String commissionType;

    /**
     * Gets the value of the commissionAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    /**
     * Sets the value of the commissionAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionAmt(BigDecimal value) {
        this.commissionAmt = value;
    }

    /**
     * Gets the value of the commissionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionType() {
        return commissionType;
    }

    /**
     * Sets the value of the commissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionType(String value) {
        this.commissionType = value;
    }

}
