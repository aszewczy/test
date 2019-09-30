
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobDeviceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobDeviceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ibanEncr" type="{http://www.hp.com/mobicore/xfmf/common}ibanEncrType" minOccurs="0"/>
 *         &lt;element name="appLabel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobDeviceInfoType", propOrder = {
    "ibanEncr",
    "appLabel"
})
public class MobDeviceInfoType {

    protected IbanEncrType ibanEncr;
    protected String appLabel;

    /**
     * Gets the value of the ibanEncr property.
     * 
     * @return
     *     possible object is
     *     {@link IbanEncrType }
     *     
     */
    public IbanEncrType getIbanEncr() {
        return ibanEncr;
    }

    /**
     * Sets the value of the ibanEncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbanEncrType }
     *     
     */
    public void setIbanEncr(IbanEncrType value) {
        this.ibanEncr = value;
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
