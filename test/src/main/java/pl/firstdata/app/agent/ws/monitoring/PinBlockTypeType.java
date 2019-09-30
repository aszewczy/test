
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinBlockTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PinBlockTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XMLENC"/>
 *     &lt;enumeration value="ISO-0"/>
 *     &lt;enumeration value="ISO-3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PinBlockTypeType")
@XmlEnum
public enum PinBlockTypeType {

    XMLENC("XMLENC"),
    @XmlEnumValue("ISO-0")
    ISO_0("ISO-0"),
    @XmlEnumValue("ISO-3")
    ISO_3("ISO-3");
    private final String value;

    PinBlockTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PinBlockTypeType fromValue(String v) {
        for (PinBlockTypeType c: PinBlockTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
