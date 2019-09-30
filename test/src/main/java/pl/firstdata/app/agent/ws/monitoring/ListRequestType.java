
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Request with paging
 * 
 * <p>Java class for ListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}RequestType">
 *       &lt;sequence>
 *         &lt;element name="pagingInfo" type="{http://www.hp.com/mobicore/xfmf/common}PagingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRequestType", propOrder = {
    "pagingInfo"
})
public class ListRequestType
    extends RequestType
{

    protected PagingType pagingInfo;

    /**
     * Gets the value of the pagingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PagingType }
     *     
     */
    public PagingType getPagingInfo() {
        return pagingInfo;
    }

    /**
     * Sets the value of the pagingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingType }
     *     
     */
    public void setPagingInfo(PagingType value) {
        this.pagingInfo = value;
    }

}
