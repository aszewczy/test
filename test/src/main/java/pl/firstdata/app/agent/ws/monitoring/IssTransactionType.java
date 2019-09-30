
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssTransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}SimpleTransactionType">
 *       &lt;sequence>
 *         &lt;element name="txData" type="{http://www.hp.com/mobicore/xfmf/common}IssTXDataType"/>
 *         &lt;element name="txRef" type="{http://www.hp.com/mobicore/xfmf/common}TxRefType"/>
 *         &lt;element name="onUs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "IssTransactionType", propOrder = {
    "txData",
    "txRef",
    "onUs",
    "refuseOffUs"
})
public class IssTransactionType
    extends SimpleTransactionType
{

    @XmlElement(required = true)
    protected IssTXDataType txData;
    protected long txRef;
    protected boolean onUs;
    protected Boolean refuseOffUs;

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link IssTXDataType }
     *     
     */
    public IssTXDataType getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssTXDataType }
     *     
     */
    public void setTxData(IssTXDataType value) {
        this.txData = value;
    }

    /**
     * Gets the value of the txRef property.
     * 
     */
    public long getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     */
    public void setTxRef(long value) {
        this.txRef = value;
    }

    /**
     * Gets the value of the onUs property.
     * 
     */
    public boolean isOnUs() {
        return onUs;
    }

    /**
     * Sets the value of the onUs property.
     * 
     */
    public void setOnUs(boolean value) {
        this.onUs = value;
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
