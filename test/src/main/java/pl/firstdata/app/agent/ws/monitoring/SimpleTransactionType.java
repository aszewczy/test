
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleTransactionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/common}TransactionBaseType">
 *       &lt;sequence>
 *         &lt;element name="merchData" type="{http://www.hp.com/mobicore/xfmf/common}MerchantDetailsType"/>
 *         &lt;element name="goods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="line-1" use="required" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *                 &lt;attribute name="line-2" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *                 &lt;attribute name="line-3" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *                 &lt;attribute name="line-4" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *                 &lt;attribute name="goodsUrl" type="{http://www.hp.com/mobicore/xfmf/common}UrlType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="line-1" use="required" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *                 &lt;attribute name="line-2" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="couponCode" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" minOccurs="0"/>
 *         &lt;element name="additionalData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ip">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="25"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="userAgent">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="25"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleTransactionType", propOrder = {
    "merchData",
    "goods",
    "comment",
    "couponCode",
    "additionalData"
})
@XmlSeeAlso({
    AcqTransactionType.class,
    IssTransactionType.class
})
public class SimpleTransactionType
    extends TransactionBaseType
{

    @XmlElement(required = true)
    protected MerchantDetailsType merchData;
    protected SimpleTransactionType.Goods goods;
    protected SimpleTransactionType.Comment comment;
    protected String couponCode;
    protected SimpleTransactionType.AdditionalData additionalData;

    /**
     * Gets the value of the merchData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantDetailsType }
     *     
     */
    public MerchantDetailsType getMerchData() {
        return merchData;
    }

    /**
     * Sets the value of the merchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantDetailsType }
     *     
     */
    public void setMerchData(MerchantDetailsType value) {
        this.merchData = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTransactionType.Goods }
     *     
     */
    public SimpleTransactionType.Goods getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTransactionType.Goods }
     *     
     */
    public void setGoods(SimpleTransactionType.Goods value) {
        this.goods = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTransactionType.Comment }
     *     
     */
    public SimpleTransactionType.Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTransactionType.Comment }
     *     
     */
    public void setComment(SimpleTransactionType.Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the couponCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Sets the value of the couponCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTransactionType.AdditionalData }
     *     
     */
    public SimpleTransactionType.AdditionalData getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTransactionType.AdditionalData }
     *     
     */
    public void setAdditionalData(SimpleTransactionType.AdditionalData value) {
        this.additionalData = value;
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
     *       &lt;attribute name="ip">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="25"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="userAgent">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="25"/>
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
    @XmlType(name = "")
    public static class AdditionalData {

        @XmlAttribute(name = "ip")
        protected String ip;
        @XmlAttribute(name = "userAgent")
        protected String userAgent;

        /**
         * Gets the value of the ip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIp() {
            return ip;
        }

        /**
         * Sets the value of the ip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIp(String value) {
            this.ip = value;
        }

        /**
         * Gets the value of the userAgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserAgent() {
            return userAgent;
        }

        /**
         * Sets the value of the userAgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserAgent(String value) {
            this.userAgent = value;
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
     *       &lt;attribute name="line-1" use="required" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
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
    public static class Comment {

        @XmlAttribute(name = "line-1", required = true)
        protected String line1;
        @XmlAttribute(name = "line-2")
        protected String line2;

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="line-1" use="required" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
     *       &lt;attribute name="line-2" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
     *       &lt;attribute name="line-3" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
     *       &lt;attribute name="line-4" type="{http://www.hp.com/mobicore/xfmf/common}Text35Type" />
     *       &lt;attribute name="goodsUrl" type="{http://www.hp.com/mobicore/xfmf/common}UrlType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Goods {

        @XmlAttribute(name = "line-1", required = true)
        protected String line1;
        @XmlAttribute(name = "line-2")
        protected String line2;
        @XmlAttribute(name = "line-3")
        protected String line3;
        @XmlAttribute(name = "line-4")
        protected String line4;
        @XmlAttribute(name = "goodsUrl")
        protected String goodsUrl;

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

        /**
         * Gets the value of the line3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine3() {
            return line3;
        }

        /**
         * Sets the value of the line3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine3(String value) {
            this.line3 = value;
        }

        /**
         * Gets the value of the line4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine4() {
            return line4;
        }

        /**
         * Sets the value of the line4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine4(String value) {
            this.line4 = value;
        }

        /**
         * Gets the value of the goodsUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGoodsUrl() {
            return goodsUrl;
        }

        /**
         * Sets the value of the goodsUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGoodsUrl(String value) {
            this.goodsUrl = value;
        }

    }

}
