
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssAppStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssAppStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="BLOCKED"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssAppStatusType")
@XmlEnum
public enum IssAppStatusType {


    /**
     *  konto jest za�o�one ale nie aktywne
     * 
     */
    INACTIVE,

    /**
     * konto jest aktywne
     * 
     */
    ACTIVE,

    /**
     * konto zablokowane
     * 
     */
    BLOCKED,

    /**
     * konto usuni�te
     * 
     */
    DELETED;

    public String value() {
        return name();
    }

    public static IssAppStatusType fromValue(String v) {
        return valueOf(v);
    }

}
