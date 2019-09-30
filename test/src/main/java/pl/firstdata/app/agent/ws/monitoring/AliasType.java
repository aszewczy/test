
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AliasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scope" type="{http://www.hp.com/mobicore/xfmf/common}AliasScopeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="64"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="valueType" use="required" type="{http://www.hp.com/mobicore/xfmf/common}AliasValueType" />
 *       &lt;attribute name="usage" use="required" type="{http://www.hp.com/mobicore/xfmf/common}AliasUsageType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasType", propOrder = {
    "scope"
})
public class AliasType {

    protected AliasScopeType scope;
    @XmlAttribute(name = "value", required = true)
    protected String value;
    @XmlAttribute(name = "valueType", required = true)
    protected AliasValueType valueType;
    @XmlAttribute(name = "usage", required = true)
    protected AliasUsageType usage;

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link AliasScopeType }
     *     
     */
    public AliasScopeType getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasScopeType }
     *     
     */
    public void setScope(AliasScopeType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link AliasValueType }
     *     
     */
    public AliasValueType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasValueType }
     *     
     */
    public void setValueType(AliasValueType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link AliasUsageType }
     *     
     */
    public AliasUsageType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasUsageType }
     *     
     */
    public void setUsage(AliasUsageType value) {
        this.usage = value;
    }

}
