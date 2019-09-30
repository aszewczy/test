
package pl.firstdata.app.agent.ws.monitoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Krystian - wnioskuj� o ujednolicenie ... (patrz poni�ej)
 * 
 * <p>Java class for PagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagingItem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="itemValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="hasMorePages" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingType", propOrder = {
    "pagingItem"
})
@XmlSeeAlso({
    pl.firstdata.app.agent.ws.monitoring.ListResponseType.PagingInfo.class
})
public class PagingType {

    protected List<PagingType.PagingItem> pagingItem;
    @XmlAttribute(name = "hasMorePages")
    protected Boolean hasMorePages;

    /**
     * Gets the value of the pagingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagingType.PagingItem }
     * 
     * 
     */
    public List<PagingType.PagingItem> getPagingItem() {
        if (pagingItem == null) {
            pagingItem = new ArrayList<PagingType.PagingItem>();
        }
        return this.pagingItem;
    }

    /**
     * Gets the value of the hasMorePages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMorePages() {
        return hasMorePages;
    }

    /**
     * Sets the value of the hasMorePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMorePages(Boolean value) {
        this.hasMorePages = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="itemValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemType",
        "itemValue"
    })
    public static class PagingItem {

        @XmlElement(required = true)
        protected String itemType;
        @XmlElement(required = true)
        protected String itemValue;

        /**
         * Gets the value of the itemType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemType() {
            return itemType;
        }

        /**
         * Sets the value of the itemType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemType(String value) {
            this.itemType = value;
        }

        /**
         * Gets the value of the itemValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemValue() {
            return itemValue;
        }

        /**
         * Sets the value of the itemValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemValue(String value) {
            this.itemValue = value;
        }

    }

}
