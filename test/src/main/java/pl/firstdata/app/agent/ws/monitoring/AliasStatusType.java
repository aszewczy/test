
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AliasStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_ALIAS"/>
 *     &lt;enumeration value="OWN_ALIAS"/>
 *     &lt;enumeration value="OTHER_ISS_ALIAS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AliasStatusType")
@XmlEnum
public enum AliasStatusType {

    NO_ALIAS,
    OWN_ALIAS,
    OTHER_ISS_ALIAS;

    public String value() {
        return name();
    }

    public static AliasStatusType fromValue(String v) {
        return valueOf(v);
    }

}
