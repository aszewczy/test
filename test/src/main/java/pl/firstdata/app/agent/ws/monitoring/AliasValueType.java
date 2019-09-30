
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AliasValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MSISDN"/>
 *     &lt;enumeration value="PAYID"/>
 *     &lt;enumeration value="UID"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MDM"/>
 *     &lt;enumeration value="COOKIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AliasValueType")
@XmlEnum
public enum AliasValueType {

    MSISDN,
    PAYID,
    UID,
    EMAIL,
    MD,
    MDM,
    COOKIE;

    public String value() {
        return name();
    }

    public static AliasValueType fromValue(String v) {
        return valueOf(v);
    }

}
