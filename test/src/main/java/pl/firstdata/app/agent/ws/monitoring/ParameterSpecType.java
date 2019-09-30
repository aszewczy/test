
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterSpecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterSpecType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/mon}ParameterBaseType">
 *       &lt;choice>
 *         &lt;element name="valRestricions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="minVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="maxVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="regExp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="val">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="20"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="label" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="70"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="INTEGER"/>
 *             &lt;enumeration value="STRING"/>
 *             &lt;enumeration value="DECIMAL"/>
 *             &lt;enumeration value="DATE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="label">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="70"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterSpecType", namespace = "http://www.hp.com/mobicore/xfmf/mon", propOrder = {
    "valRestricions",
    "valList"
})
public class ParameterSpecType
    extends ParameterBaseType
{

    protected ParameterSpecType.ValRestricions valRestricions;
    protected ParameterSpecType.ValList valList;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "desc")
    protected String desc;

    /**
     * Gets the value of the valRestricions property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterSpecType.ValRestricions }
     *     
     */
    public ParameterSpecType.ValRestricions getValRestricions() {
        return valRestricions;
    }

    /**
     * Sets the value of the valRestricions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterSpecType.ValRestricions }
     *     
     */
    public void setValRestricions(ParameterSpecType.ValRestricions value) {
        this.valRestricions = value;
    }

    /**
     * Gets the value of the valList property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterSpecType.ValList }
     *     
     */
    public ParameterSpecType.ValList getValList() {
        return valList;
    }

    /**
     * Sets the value of the valList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterSpecType.ValList }
     *     
     */
    public void setValList(ParameterSpecType.ValList value) {
        this.valList = value;
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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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
     *         &lt;element name="val">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="20"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="label" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="70"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        "val"
    })
    public static class ValList {

        @XmlElement(required = true)
        protected ParameterSpecType.ValList.Val val;

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link ParameterSpecType.ValList.Val }
         *     
         */
        public ParameterSpecType.ValList.Val getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParameterSpecType.ValList.Val }
         *     
         */
        public void setVal(ParameterSpecType.ValList.Val value) {
            this.val = value;
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
         *       &lt;attribute name="id" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="20"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="label" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="70"/>
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
        public static class Val {

            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "label", required = true)
            protected String label;

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
             * Gets the value of the label property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLabel() {
                return label;
            }

            /**
             * Sets the value of the label property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLabel(String value) {
                this.label = value;
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
     *       &lt;attribute name="minVal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="maxVal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="regExp" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValRestricions {

        @XmlAttribute(name = "minVal")
        protected String minVal;
        @XmlAttribute(name = "maxVal")
        protected String maxVal;
        @XmlAttribute(name = "regExp")
        protected String regExp;

        /**
         * Gets the value of the minVal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinVal() {
            return minVal;
        }

        /**
         * Sets the value of the minVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinVal(String value) {
            this.minVal = value;
        }

        /**
         * Gets the value of the maxVal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxVal() {
            return maxVal;
        }

        /**
         * Sets the value of the maxVal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxVal(String value) {
            this.maxVal = value;
        }

        /**
         * Gets the value of the regExp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegExp() {
            return regExp;
        }

        /**
         * Sets the value of the regExp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegExp(String value) {
            this.regExp = value;
        }

    }

}
