
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * common status block of response from MobiCore
 * 
 * <p>Java class for StatusBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusBlockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}ErrorStatusType">
 *       &lt;attribute name="status" use="required" type="{http://www.hp.com/mobicore/xfmf/common}XfmfStatusBaseType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusBlockType")
public class StatusBlockType
    extends ErrorStatusType
{

    @XmlAttribute(name = "status", required = true)
    protected XfmfStatusBaseType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link XfmfStatusBaseType }
     *     
     */
    public XfmfStatusBaseType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link XfmfStatusBaseType }
     *     
     */
    public void setStatus(XfmfStatusBaseType value) {
        this.status = value;
    }

}
