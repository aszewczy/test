
package pl.firstdata.app.agent.ws.monitoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}ResponseType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="component" type="{http://www.hp.com/mobicore/xfmf/mon}ComponentInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoResponseType", namespace = "http://www.hp.com/mobicore/xfmf/mon", propOrder = {
    "component"
})
public class GetInfoResponseType
    extends ResponseType
{

    protected List<ComponentInfoType> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentInfoType }
     * 
     * 
     */
    public List<ComponentInfoType> getComponent() {
        if (component == null) {
            component = new ArrayList<ComponentInfoType>();
        }
        return this.component;
    }

}
