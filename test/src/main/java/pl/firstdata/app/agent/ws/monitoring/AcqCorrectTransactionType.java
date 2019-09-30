
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcqCorrectTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcqCorrectTransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}CorrectTransactionType">
 *       &lt;sequence>
 *         &lt;element name="txData" type="{http://www.hp.com/mobicore/xfmf/common}TXDataType"/>
 *         &lt;element name="extTxRef" type="{http://www.hp.com/mobicore/xfmf/common}ExtTxRefType"/>
 *         &lt;element name="orgTxRef" type="{http://www.hp.com/mobicore/xfmf/common}TxRefType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcqCorrectTransactionType", propOrder = {
    "txData",
    "extTxRef",
    "orgTxRef"
})
public class AcqCorrectTransactionType
    extends CorrectTransactionType
{

    @XmlElement(required = true)
    protected TXDataType txData;
    @XmlElement(required = true)
    protected String extTxRef;
    protected long orgTxRef;

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
     * Gets the value of the orgTxRef property.
     * 
     */
    public long getOrgTxRef() {
        return orgTxRef;
    }

    /**
     * Sets the value of the orgTxRef property.
     * 
     */
    public void setOrgTxRef(long value) {
        this.orgTxRef = value;
    }

}
