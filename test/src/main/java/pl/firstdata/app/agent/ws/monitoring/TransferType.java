
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}SimpleTransferType">
 *       &lt;sequence>
 *         &lt;element name="transferData" type="{http://www.hp.com/mobicore/xfmf/common}TransferDataType"/>
 *         &lt;element name="extTxRef" type="{http://www.hp.com/mobicore/xfmf/common}ExtTxRefType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferType", propOrder = {
    "transferData",
    "extTxRef"
})
public class TransferType
    extends SimpleTransferType
{

    @XmlElement(required = true)
    protected TransferDataType transferData;
    @XmlElement(required = true)
    protected String extTxRef;

    /**
     * Gets the value of the transferData property.
     * 
     * @return
     *     possible object is
     *     {@link TransferDataType }
     *     
     */
    public TransferDataType getTransferData() {
        return transferData;
    }

    /**
     * Sets the value of the transferData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDataType }
     *     
     */
    public void setTransferData(TransferDataType value) {
        this.transferData = value;
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

}
