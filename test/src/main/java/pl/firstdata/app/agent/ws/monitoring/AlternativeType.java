
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternativeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="appLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeType")
public class AlternativeType {

    @XmlAttribute(name = "key", required = true)
    protected long key;
    @XmlAttribute(name = "appLabel", required = true)
    protected String appLabel;

    /**
     * Gets the value of the key property.
     * 
     */
    public long getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(long value) {
        this.key = value;
    }

    /**
     * Gets the value of the appLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppLabel() {
        return appLabel;
    }

    /**
     * Sets the value of the appLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppLabel(String value) {
        this.appLabel = value;
    }

}
