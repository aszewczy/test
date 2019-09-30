
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcqTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcqTransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}SimpleTransactionType">
 *       &lt;sequence>
 *         &lt;element name="txData" type="{http://www.hp.com/mobicore/xfmf/common}TXDataType"/>
 *         &lt;element name="extTxRef" type="{http://www.hp.com/mobicore/xfmf/common}ExtTxRefType"/>
 *         &lt;element name="refuseOffUs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcqTransactionType", propOrder = {
    "txData",
    "extTxRef",
    "refuseOffUs"
})
@XmlSeeAlso({
    AcqTransactionDetailsType.class
})
public class AcqTransactionType
    extends SimpleTransactionType
{

    @XmlElement(required = true)
    protected TXDataType txData;
    @XmlElement(required = true)
    protected String extTxRef;
    protected Boolean refuseOffUs;

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link TXDataType }
     *     
     */
    public TXDataType getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TXDataType }
     *     
     */
    public void setTxData(TXDataType value) {
        this.txData = value;
    }

    /**
     * Gets the value of the extTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTxRef() {
        return extTxRef;
    }

    /**
     * Sets the value of the extTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTxRef(String value) {
        this.extTxRef = value;
    }

    /**
     * Gets the value of the refuseOffUs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefuseOffUs() {
        return refuseOffUs;
    }

    /**
     * Sets the value of the refuseOffUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefuseOffUs(Boolean value) {
        this.refuseOffUs = value;
    }

}
