
package pl.firstdata.app.agent.ws.monitoring;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for STLDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STLDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}MoneyTypeSTL">
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
@XmlType(name = "STLDataType")
public class STLDataType
    extends MoneyTypeSTL
{

    @XmlAttribute(name = "exchRate")
    protected BigDecimal exchRate;
    @XmlAttribute(name = "exchDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchDate;

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
