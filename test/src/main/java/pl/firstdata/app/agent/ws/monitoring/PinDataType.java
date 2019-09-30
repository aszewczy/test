
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.hp.com/mobicore/xfmf/common}PinBlockTypeType" />
 *       &lt;attribute name="pinBlock" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinDataType")
public class PinDataType {

    @XmlAttribute(name = "type", required = true)
    protected PinBlockTypeType type;
    @XmlAttribute(name = "pinBlock", required = true)
    protected byte[] pinBlock;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PinBlockTypeType }
     *     
     */
    public PinBlockTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinBlockTypeType }
     *     
     */
    public void setType(PinBlockTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPinBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPinBlock(byte[] value) {
        this.pinBlock = ((byte[]) value);
    }

}
