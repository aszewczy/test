
package pl.firstdata.app.agent.ws.monitoring;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for STLTransferDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STLTransferDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}MoneyTypeSTL">
 *       &lt;attribute name="commissionAmt" type="{http://www.hp.com/mobicore/xfmf/common}AmountType" />
 *       &lt;attribute name="commissionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="exchRate" type="{http://www.hp.com/mobicore/xfmf/common}ExchangeRateType" />
 *       &lt;attribute name="exchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STLTransferDataType")
public class STLTransferDataType
    extends MoneyTypeSTL
{

    @XmlAttribute(name = "commissionAmt")
    protected BigDecimal commissionAmt;
    @XmlAttribute(name = "commissionType")
    protected String commissionType;
    @XmlAttribute(name = "exchRate")
    protected BigDecimal exchRate;
    @XmlAttribute(name = "exchDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchDate;

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

    /**
     * Gets the value of the exchRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchRate() {
        return exchRate;
    }

    /**
     * Sets the value of the exchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchRate(BigDecimal value) {
        this.exchRate = value;
    }

    /**
     * Gets the value of the exchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchDate() {
        return exchDate;
    }

    /**
     * Sets the value of the exchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchDate(XMLGregorianCalendar value) {
        this.exchDate = value;
    }

}
