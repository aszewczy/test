
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssCorrectTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssCorrectTransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}CorrectTransactionType">
 *       &lt;sequence>
 *         &lt;element name="txData" type="{http://www.hp.com/mobicore/xfmf/common}IssTXDataType"/>
 *         &lt;element name="txRef" type="{http://www.hp.com/mobicore/xfmf/common}TxRefType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssCorrectTransactionType", propOrder = {
    "txData",
    "txRef"
})
public class IssCorrectTransactionType
    extends CorrectTransactionType
{

    @XmlElement(required = true)
    protected IssTXDataType txData;
    protected long txRef;

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

}
