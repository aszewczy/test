
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * abstrakcyjny typ, kt�rego implementacje definiuj� biznesow� zawarto�� transakcji w TAS
 * 
 * <p>Java class for TransferBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finData" type="{http://www.hp.com/mobicore/xfmf/common}FinTransferDataType"/>
 *         &lt;element name="stlData" type="{http://www.hp.com/mobicore/xfmf/common}STLTransferDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferBaseType", propOrder = {
    "finData",
    "stlData"
})
@XmlSeeAlso({
    SimpleTransferType.class
})
public abstract class TransferBaseType {

    @XmlElement(required = true)
    protected FinTransferDataType finData;
    @XmlElement(required = true)
    protected STLTransferDataType stlData;

    /**
     * Gets the value of the finData property.
     * 
     * @return
     *     possible object is
     *     {@link FinTransferDataType }
     *     
     */
    public FinTransferDataType getFinData() {
        return finData;
    }

    /**
     * Sets the value of the finData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinTransferDataType }
     *     
     */
    public void setFinData(FinTransferDataType value) {
        this.finData = value;
    }

    /**
     * Gets the value of the stlData property.
     * 
     * @return
     *     possible object is
     *     {@link STLTransferDataType }
     *     
     */
    public STLTransferDataType getStlData() {
        return stlData;
    }

    /**
     * Sets the value of the stlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLTransferDataType }
     *     
     */
    public void setStlData(STLTransferDataType value) {
        this.stlData = value;
    }

}
