
package pl.firstdata.app.agent.ws.monitoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cat" type="{http://www.hp.com/mobicore/xfmf/common}EventCategoryType"/>
 *         &lt;element name="type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="evtDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="key" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="appId" type="{http://www.hp.com/mobicore/xfmf/common}AppIdType"/>
 *                             &lt;element name="msisdnDigest" type="{http://www.hp.com/mobicore/xfmf/common}DigestType"/>
 *                             &lt;element name="txRef" type="{http://www.hp.com/mobicore/xfmf/common}TxRefType"/>
 *                             &lt;element name="extTxRef" type="{http://www.hp.com/mobicore/xfmf/common}ExtTxRefType"/>
 *                             &lt;element name="alias">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="aliasType" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="aliasValue" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="64"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ctx" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="ctxParam">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="msg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "EventType", propOrder = {
    "id",
    "cat",
    "type",
    "evtDt",
    "data"
})
public class EventType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected EventCategoryType cat;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(required = true)
    protected EventType.Data data;

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
     * Gets the value of the cat property.
     * 
     * @return
     *     possible object is
     *     {@link EventCategoryType }
     *     
     */
    public EventCategoryType getCat() {
        return cat;
    }

    /**
     * Sets the value of the cat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCategoryType }
     *     
     */
    public void setCat(EventCategoryType value) {
        this.cat = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link EventType.Data }
     *     
     */
    public EventType.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType.Data }
     *     
     */
    public void setData(EventType.Data value) {
        this.data = value;
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
     *         &lt;element name="key" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="appId" type="{http://www.hp.com/mobicore/xfmf/common}AppIdType"/>
     *                   &lt;element name="msisdnDigest" type="{http://www.hp.com/mobicore/xfmf/common}DigestType"/>
     *                   &lt;element name="txRef" type="{http://www.hp.com/mobicore/xfmf/common}TxRefType"/>
     *                   &lt;element name="extTxRef" type="{http://www.hp.com/mobicore/xfmf/common}ExtTxRefType"/>
     *                   &lt;element name="alias">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="aliasType" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="aliasValue" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="64"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ctx" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="ctxParam">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="msg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="70"/>
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
    @XmlType(name = "", propOrder = {
        "key",
        "ctx",
        "msg"
    })
    public static class Data {

        protected EventType.Data.Key key;
        protected EventType.Data.Ctx ctx;
        @XmlElement(required = true)
        protected String msg;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link EventType.Data.Key }
         *     
         */
        public EventType.Data.Key getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link EventType.Data.Key }
         *     
         */
        public void setKey(EventType.Data.Key value) {
            this.key = value;
        }

        /**
         * Gets the value of the ctx property.
         * 
         * @return
         *     possible object is
         *     {@link EventType.Data.Ctx }
         *     
         */
        public EventType.Data.Ctx getCtx() {
            return ctx;
        }

        /**
         * Sets the value of the ctx property.
         * 
         * @param value
         *     allowed object is
         *     {@link EventType.Data.Ctx }
         *     
         */
        public void setCtx(EventType.Data.Ctx value) {
            this.ctx = value;
        }

        /**
         * Gets the value of the msg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsg() {
            return msg;
        }

        /**
         * Sets the value of the msg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsg(String value) {
            this.msg = value;
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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="ctxParam">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
        @XmlType(name = "", propOrder = {
            "ctxParam"
        })
        public static class Ctx {

            @XmlElement(required = true)
            protected List<EventType.Data.Ctx.CtxParam> ctxParam;

            /**
             * Gets the value of the ctxParam property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ctxParam property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCtxParam().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EventType.Data.Ctx.CtxParam }
             * 
             * 
             */
            public List<EventType.Data.Ctx.CtxParam> getCtxParam() {
                if (ctxParam == null) {
                    ctxParam = new ArrayList<EventType.Data.Ctx.CtxParam>();
                }
                return this.ctxParam;
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
             *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CtxParam {

                @XmlAttribute(name = "key", required = true)
                protected String key;
                @XmlAttribute(name = "value")
                protected String value;

                /**
                 * Gets the value of the key property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKey() {
                    return key;
                }

                /**
                 * Sets the value of the key property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKey(String value) {
                    this.key = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

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
         *       &lt;choice>
         *         &lt;element name="appId" type="{http://www.hp.com/mobicore/xfmf/common}AppIdType"/>
         *         &lt;element name="msisdnDigest" type="{http://www.hp.com/mobicore/xfmf/common}DigestType"/>
         *         &lt;element name="txRef" type="{http://www.hp.com/mobicore/xfmf/common}TxRefType"/>
         *         &lt;element name="extTxRef" type="{http://www.hp.com/mobicore/xfmf/common}ExtTxRefType"/>
         *         &lt;element name="alias">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="aliasType" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="aliasValue" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="64"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "appId",
            "msisdnDigest",
            "txRef",
            "extTxRef",
            "alias"
        })
        public static class Key {

            protected String appId;
            protected String msisdnDigest;
            protected Long txRef;
            protected String extTxRef;
            protected EventType.Data.Key.Alias alias;

            /**
             * Gets the value of the appId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAppId() {
                return appId;
            }

            /**
             * Sets the value of the appId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAppId(String value) {
                this.appId = value;
            }

            /**
             * Gets the value of the msisdnDigest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMsisdnDigest() {
                return msisdnDigest;
            }

            /**
             * Sets the value of the msisdnDigest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMsisdnDigest(String value) {
                this.msisdnDigest = value;
            }

            /**
             * Gets the value of the txRef property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTxRef() {
                return txRef;
            }

            /**
             * Sets the value of the txRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTxRef(Long value) {
                this.txRef = value;
            }

            /**
             * Gets the value of the extTxRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtTxRef() {
                return extTxRef;
            }

            /**
             * Sets the value of the extTxRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtTxRef(String value) {
                this.extTxRef = value;
            }

            /**
             * Gets the value of the alias property.
             * 
             * @return
             *     possible object is
             *     {@link EventType.Data.Key.Alias }
             *     
             */
            public EventType.Data.Key.Alias getAlias() {
                return alias;
            }

            /**
             * Sets the value of the alias property.
             * 
             * @param value
             *     allowed object is
             *     {@link EventType.Data.Key.Alias }
             *     
             */
            public void setAlias(EventType.Data.Key.Alias value) {
                this.alias = value;
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
             *       &lt;attribute name="aliasType" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="aliasValue" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="64"/>
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
            public static class Alias {

                @XmlAttribute(name = "aliasType", required = true)
                protected String aliasType;
                @XmlAttribute(name = "aliasValue", required = true)
                protected String aliasValue;

                /**
                 * Gets the value of the aliasType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAliasType() {
                    return aliasType;
                }

                /**
                 * Sets the value of the aliasType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAliasType(String value) {
                    this.aliasType = value;
                }

                /**
                 * Gets the value of the aliasValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAliasValue() {
                    return aliasValue;
                }

                /**
                 * Sets the value of the aliasValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAliasValue(String value) {
                    this.aliasValue = value;
                }

            }

        }

    }

}
