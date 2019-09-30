
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TasReversalReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TasReversalReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIMEOUT"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="ACQ"/>
 *     &lt;enumeration value="TAS"/>
 *     &lt;enumeration value="C2C_BEN_ISS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TasReversalReasonCodeType")
@XmlEnum
public enum TasReversalReasonCodeType {

    TIMEOUT("TIMEOUT"),
    USER("USER"),
    ACQ("ACQ"),
    TAS("TAS"),
    @XmlEnumValue("C2C_BEN_ISS")
    C_2_C_BEN_ISS("C2C_BEN_ISS");
    private final String value;

    TasReversalReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TasReversalReasonCodeType fromValue(String v) {
        for (TasReversalReasonCodeType c: TasReversalReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
