
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssTransferType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}SimpleTransferType">
 *       &lt;sequence>
 *         &lt;element name="transferData" type="{http://www.hp.com/mobicore/xfmf/common}IssTransferDataType"/>
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
@XmlType(name = "IssTransferType", propOrder = {
    "transferData",
    "txRef"
})
public class IssTransferType
    extends SimpleTransferType
{

    @XmlElement(required = true)
    protected IssTransferDataType transferData;
    protected long txRef;

    /**
     * Gets the value of the transferData property.
     * 
     * @return
     *     possible object is
     *     {@link IssTransferDataType }
     *     
     */
    public IssTransferDataType getTransferData() {
        return transferData;
    }

    /**
     * Sets the value of the transferData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssTransferDataType }
     *     
     */
    public void setTransferData(IssTransferDataType value) {
        this.transferData = value;
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
