
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * abstrakcyjny typ, kt�rego implementacje definiuj� biznesow� zawarto�� transakcji w TAS
 * 
 * <p>Java class for TransactionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finData" type="{http://www.hp.com/mobicore/xfmf/common}FinDataType"/>
 *         &lt;element name="stlData" type="{http://www.hp.com/mobicore/xfmf/common}STLDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionBaseType", propOrder = {
    "finData",
    "stlData"
})
@XmlSeeAlso({
    C2CTransactionBaseType.class,
    SimpleTransactionType.class,
    CorrectTransactionType.class
})
public abstract class TransactionBaseType {

    @XmlElement(required = true)
    protected FinDataType finData;
    @XmlElement(required = true)
    protected STLDataType stlData;

    /**
     * Gets the value of the finData property.
     * 
     * @return
     *     possible object is
     *     {@link FinDataType }
     *     
     */
    public FinDataType getFinData() {
        return finData;
    }

    /**
     * Sets the value of the finData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinDataType }
     *     
     */
    public void setFinData(FinDataType value) {
        this.finData = value;
    }

    /**
     * Gets the value of the stlData property.
     * 
     * @return
     *     possible object is
     *     {@link STLDataType }
     *     
     */
    public STLDataType getStlData() {
        return stlData;
    }

    /**
     * Sets the value of the stlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLDataType }
     *     
     */
    public void setStlData(STLDataType value) {
        this.stlData = value;
    }

}
