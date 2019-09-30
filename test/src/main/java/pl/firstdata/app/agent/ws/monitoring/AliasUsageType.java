
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AliasUsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P2P"/>
 *     &lt;enumeration value="MOBPAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AliasUsageType")
@XmlEnum
public enum AliasUsageType {

    @XmlEnumValue("P2P")
    P_2_P("P2P"),
    MOBPAY("MOBPAY");
    private final String value;

    AliasUsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AliasUsageType fromValue(String v) {
        for (AliasUsageType c: AliasUsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
