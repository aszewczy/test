
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="envName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lineName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isMaintenance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationContextType", namespace = "http://www.hp.com/mobicore/xfmf/mon")
public class ApplicationContextType {

    @XmlAttribute(name = "envName")
    protected String envName;
    @XmlAttribute(name = "lineName")
    protected String lineName;
    @XmlAttribute(name = "isMaintenance", required = true)
    protected boolean isMaintenance;

    /**
     * Gets the value of the envName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvName() {
        return envName;
    }

    /**
     * Sets the value of the envName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvName(String value) {
        this.envName = value;
    }

    /**
     * Gets the value of the lineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * Sets the value of the lineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineName(String value) {
        this.lineName = value;
    }

    /**
     * Gets the value of the isMaintenance property.
     * 
     */
    public boolean isIsMaintenance() {
        return isMaintenance;
    }

    /**
     * Sets the value of the isMaintenance property.
     * 
     */
    public void setIsMaintenance(boolean value) {
        this.isMaintenance = value;
    }

}
