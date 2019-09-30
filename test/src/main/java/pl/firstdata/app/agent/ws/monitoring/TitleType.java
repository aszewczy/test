
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TitleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="title1" use="required" type="{http://www.hp.com/mobicore/xfmf/common}StringSingleLineType" />
 *       &lt;attribute name="title2" use="required" type="{http://www.hp.com/mobicore/xfmf/common}StringSingleLineType" />
 *       &lt;attribute name="title3" type="{http://www.hp.com/mobicore/xfmf/common}StringSingleLineType" />
 *       &lt;attribute name="title4" type="{http://www.hp.com/mobicore/xfmf/common}StringSingleLineType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitleType")
public class TitleType {

    @XmlAttribute(name = "title1", required = true)
    protected String title1;
    @XmlAttribute(name = "title2", required = true)
    protected String title2;
    @XmlAttribute(name = "title3")
    protected String title3;
    @XmlAttribute(name = "title4")
    protected String title4;

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle1(String value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the title2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle2() {
        return title2;
    }

    /**
     * Sets the value of the title2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle2(String value) {
        this.title2 = value;
    }

    /**
     * Gets the value of the title3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle3() {
        return title3;
    }

    /**
     * Sets the value of the title3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle3(String value) {
        this.title3 = value;
    }

    /**
     * Gets the value of the title4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle4() {
        return title4;
    }

    /**
     * Sets the value of the title4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle4(String value) {
        this.title4 = value;
    }

}
