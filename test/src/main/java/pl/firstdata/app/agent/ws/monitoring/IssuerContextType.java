
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="issId" use="required" type="{http://www.hp.com/mobicore/xfmf/common}IssuerIdType" />
 *       &lt;attribute name="appId" use="required" type="{http://www.hp.com/mobicore/xfmf/common}AppIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerContextType")
public class IssuerContextType {

    @XmlAttribute(name = "issId", required = true)
    protected long issId;
    @XmlAttribute(name = "appId", required = true)
    protected String appId;

    /**
     * Gets the value of the issId property.
     * 
     */
    public long getIssId() {
        return issId;
    }

    /**
     * Sets the value of the issId property.
     * 
     */
    public void setIssId(long value) {
        this.issId = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

}
