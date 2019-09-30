
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getInfoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInfoRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}RequestType">
 *       &lt;sequence>
 *         &lt;element name="baseOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="env" type="{http://www.hp.com/mobicore/xfmf/mon}ApplicationContextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoRequestType", namespace = "http://www.hp.com/mobicore/xfmf/mon", propOrder = {
    "baseOnly",
    "env"
})
public class GetInfoRequestType
    extends RequestType
{

    protected boolean baseOnly;
    protected ApplicationContextType env;

    /**
     * Gets the value of the baseOnly property.
     * 
     */
    public boolean isBaseOnly() {
        return baseOnly;
    }

    /**
     * Sets the value of the baseOnly property.
     * 
     */
    public void setBaseOnly(boolean value) {
        this.baseOnly = value;
    }

    /**
     * Gets the value of the env property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationContextType }
     *     
     */
    public ApplicationContextType getEnv() {
        return env;
    }

    /**
     * Sets the value of the env property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationContextType }
     *     
     */
    public void setEnv(ApplicationContextType value) {
        this.env = value;
    }

}
