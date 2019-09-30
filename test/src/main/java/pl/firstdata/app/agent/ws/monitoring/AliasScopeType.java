
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AliasScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="acqId" use="required" type="{http://www.hp.com/mobicore/xfmf/common}AcquirerIdType" />
 *       &lt;attribute name="merchId" use="required" type="{http://www.hp.com/mobicore/xfmf/common}MerchantIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasScopeType")
public class AliasScopeType {

    @XmlAttribute(name = "acqId", required = true)
    protected long acqId;
    @XmlAttribute(name = "merchId", required = true)
    protected String merchId;

    /**
     * Gets the value of the acqId property.
     * 
     */
    public long getAcqId() {
        return acqId;
    }

    /**
     * Sets the value of the acqId property.
     * 
     */
    public void setAcqId(long value) {
        this.acqId = value;
    }

    /**
     * Gets the value of the merchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchId() {
        return merchId;
    }

    /**
     * Sets the value of the merchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchId(String value) {
        this.merchId = value;
    }

}
