
package pl.firstdata.app.agent.ws.monitoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statisticsRetrieveResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statisticsRetrieveResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}ResponseType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="info" type="{http://www.hp.com/mobicore/xfmf/mon}InfoStructureType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statisticsRetrieveResponseType", namespace = "http://www.hp.com/mobicore/xfmf/mon", propOrder = {
    "info"
})
public class StatisticsRetrieveResponseType
    extends ResponseType
{

    protected List<InfoStructureType> info;

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoStructureType }
     * 
     * 
     */
    public List<InfoStructureType> getInfo() {
        if (info == null) {
            info = new ArrayList<InfoStructureType>();
        }
        return this.info;
    }

}
