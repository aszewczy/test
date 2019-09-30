
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRMapType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QRMapType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INV_FMT01"/>
 *     &lt;enumeration value="INV_ELX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QRMapType")
@XmlEnum
public enum QRMapType {

    @XmlEnumValue("INV_FMT01")
    INV_FMT_01("INV_FMT01"),
    INV_ELX("INV_ELX");
    private final String value;

    QRMapType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QRMapType fromValue(String v) {
        for (QRMapType c: QRMapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
