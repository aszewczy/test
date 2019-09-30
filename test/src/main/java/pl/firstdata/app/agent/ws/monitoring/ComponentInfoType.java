
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
 * <p>Java class for ComponentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hp.com/mobicore/xfmf/mon}ComponentBaseInfoType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="paramList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="param" type="{http://www.hp.com/mobicore/xfmf/mon}ParameterOutType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="startedAt" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentInfoType", namespace = "http://www.hp.com/mobicore/xfmf/mon", propOrder = {
    "paramList"
})
public class ComponentInfoType
    extends ComponentBaseInfoType
{

    protected ComponentInfoType.ParamList paramList;
    @XmlAttribute(name = "startedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startedAt;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the paramList property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentInfoType.ParamList }
     *     
     */
    public ComponentInfoType.ParamList getParamList() {
        return paramList;
    }

    /**
     * Sets the value of the paramList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentInfoType.ParamList }
     *     
     */
    public void setParamList(ComponentInfoType.ParamList value) {
        this.paramList = value;
    }

    /**
     * Gets the value of the startedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartedAt() {
        return startedAt;
    }

    /**
     * Sets the value of the startedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartedAt(XMLGregorianCalendar value) {
        this.startedAt = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="param" type="{http://www.hp.com/mobicore/xfmf/mon}ParameterOutType"/>
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
        "param"
    })
    public static class ParamList {

        @XmlElement(required = true)
        protected List<ParameterOutType> param;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParameterOutType }
         * 
         * 
         */
        public List<ParameterOutType> getParam() {
            if (param == null) {
                param = new ArrayList<ParameterOutType>();
            }
            return this.param;
        }

    }

}
