
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BenC2CTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenC2CTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordName" type="{http://www.hp.com/mobicore/xfmf/common}MSISDNType" minOccurs="0"/>
 *         &lt;element name="ordMsisdn" type="{http://www.hp.com/mobicore/xfmf/common}MSISDNType" minOccurs="0"/>
 *         &lt;element name="ordMsisdnDigest" type="{http://www.hp.com/mobicore/xfmf/common}DigestType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="benMsisdn" type="{http://www.hp.com/mobicore/xfmf/common}MSISDNType"/>
 *           &lt;element name="benMsisdnDigest" type="{http://www.hp.com/mobicore/xfmf/common}DigestType"/>
 *         &lt;/choice>
 *         &lt;element name="txAmount" type="{http://www.hp.com/mobicore/xfmf/common}MoneyType"/>
 *         &lt;element name="title1" type="{http://www.hp.com/mobicore/xfmf/common}StringSingleLineType" minOccurs="0"/>
 *         &lt;element name="title2" type="{http://www.hp.com/mobicore/xfmf/common}StringSingleLineType" minOccurs="0"/>
 *         &lt;element name="txDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenC2CTransactionType", propOrder = {
    "ordName",
    "ordMsisdn",
    "ordMsisdnDigest",
    "benMsisdn",
    "benMsisdnDigest",
    "txAmount",
    "title1",
    "title2",
    "txDate"
})
public class BenC2CTransactionType {

    protected String ordName;
    protected String ordMsisdn;
    protected String ordMsisdnDigest;
    protected String benMsisdn;
    protected String benMsisdnDigest;
    @XmlElement(required = true)
    protected MoneyType txAmount;
    protected String title1;
    protected String title2;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDate;

    /**
     * Gets the value of the ordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdName() {
        return ordName;
    }

    /**
     * Sets the value of the ordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdName(String value) {
        this.ordName = value;
    }

    /**
     * Gets the value of the ordMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdMsisdn() {
        return ordMsisdn;
    }

    /**
     * Sets the value of the ordMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdMsisdn(String value) {
        this.ordMsisdn = value;
    }

    /**
     * Gets the value of the ordMsisdnDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdMsisdnDigest() {
        return ordMsisdnDigest;
    }

    /**
     * Sets the value of the ordMsisdnDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdMsisdnDigest(String value) {
        this.ordMsisdnDigest = value;
    }

    /**
     * Gets the value of the benMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenMsisdn() {
        return benMsisdn;
    }

    /**
     * Sets the value of the benMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenMsisdn(String value) {
        this.benMsisdn = value;
    }

    /**
     * Gets the value of the benMsisdnDigest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenMsisdnDigest() {
        return benMsisdnDigest;
    }

    /**
     * Sets the value of the benMsisdnDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenMsisdnDigest(String value) {
        this.benMsisdnDigest = value;
    }

    /**
     * Gets the value of the txAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getTxAmount() {
        return txAmount;
    }

    /**
     * Sets the value of the txAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setTxAmount(MoneyType value) {
        this.txAmount = value;
    }

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
     * Gets the value of the txDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDate() {
        return txDate;
    }

    /**
     * Sets the value of the txDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDate(XMLGregorianCalendar value) {
        this.txDate = value;
    }

}
