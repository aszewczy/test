
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcqTransactionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcqTransactionDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}AcqTransactionType">
 *       &lt;sequence>
 *         &lt;element name="revData" type="{http://www.hp.com/mobicore/xfmf/common}revDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcqTransactionDetailsType", propOrder = {
    "revData"
})
public class AcqTransactionDetailsType
    extends AcqTransactionType
{

    @XmlElement(required = true)
    protected RevDataType revData;

    /**
     * Gets the value of the revData property.
     * 
     * @return
     *     possible object is
     *     {@link RevDataType }
     *     
     */
    public RevDataType getRevData() {
        return revData;
    }

    /**
     * Sets the value of the revData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevDataType }
     *     
     */
    public void setRevData(RevDataType value) {
        this.revData = value;
    }

}
