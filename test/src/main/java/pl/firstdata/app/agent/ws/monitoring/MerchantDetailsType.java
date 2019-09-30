
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="short" use="required" type="{http://www.hp.com/mobicore/xfmf/common}ShortTextType" />
 *                 &lt;attribute name="line-1" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *                 &lt;attribute name="line-2" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="address" type="{http://www.hp.com/mobicore/xfmf/common}AddressType"/>
 *         &lt;element name="aiic" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="device" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" use="required" type="{http://www.hp.com/mobicore/xfmf/common}DeviceIdType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="svcmode" type="{http://www.hp.com/mobicore/xfmf/common}SvcModeType" minOccurs="0"/>
 *         &lt;element name="merchAppUrl" type="{http://www.hp.com/mobicore/xfmf/common}UrlType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.hp.com/mobicore/xfmf/common}MerchantIdType" />
 *       &lt;attribute name="category" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.hp.com/mobicore/xfmf/common}MerchantCategoryIdType">
 *             &lt;maxLength value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantDetailsType", propOrder = {
    "name",
    "address",
    "aiic",
    "device",
    "svcmode",
    "merchAppUrl"
})
public class MerchantDetailsType {

    @XmlElement(required = true)
    protected MerchantDetailsType.Name name;
    @XmlElement(required = true)
    protected AddressType address;
    protected String aiic;
    protected MerchantDetailsType.Device device;
    protected SvcModeType svcmode;
    protected String merchAppUrl;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "category", required = true)
    protected String category;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDetailsType.Name }
     *     
     */
    public MerchantDetailsType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDetailsType.Name }
     *     
     */
    public void setName(MerchantDetailsType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the aiic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAiic() {
        return aiic;
    }

    /**
     * Sets the value of the aiic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAiic(String value) {
        this.aiic = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDetailsType.Device }
     *     
     */
    public MerchantDetailsType.Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDetailsType.Device }
     *     
     */
    public void setDevice(MerchantDetailsType.Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the svcmode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcModeType }
     *     
     */
    public SvcModeType getSvcmode() {
        return svcmode;
    }

    /**
     * Sets the value of the svcmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcModeType }
     *     
     */
    public void setSvcmode(SvcModeType value) {
        this.svcmode = value;
    }

    /**
     * Gets the value of the merchAppUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchAppUrl() {
        return merchAppUrl;
    }

    /**
     * Sets the value of the merchAppUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchAppUrl(String value) {
        this.merchAppUrl = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     *       &lt;attribute name="id" use="required" type="{http://www.hp.com/mobicore/xfmf/common}DeviceIdType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Device {

        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

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
     *       &lt;attribute name="short" use="required" type="{http://www.hp.com/mobicore/xfmf/common}ShortTextType" />
     *       &lt;attribute name="line-1" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
     *       &lt;attribute name="line-2" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Name {

        @XmlAttribute(name = "short", required = true)
        protected String _short;
        @XmlAttribute(name = "line-1")
        protected String line1;
        @XmlAttribute(name = "line-2")
        protected String line2;

        /**
         * Gets the value of the short property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShort() {
            return _short;
        }

        /**
         * Sets the value of the short property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShort(String value) {
            this._short = value;
        }

        /**
         * Gets the value of the line1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine1() {
            return line1;
        }

        /**
         * Sets the value of the line1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine1(String value) {
            this.line1 = value;
        }

        /**
         * Gets the value of the line2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine2() {
            return line2;
        }

        /**
         * Sets the value of the line2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine2(String value) {
            this.line2 = value;
        }

    }

}
