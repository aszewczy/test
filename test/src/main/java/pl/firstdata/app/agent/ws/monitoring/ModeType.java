
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="EXTEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModeType")
@XmlEnum
public enum ModeType {

    NORMAL,
    EXTEND;

    public String value() {
        return name();
    }

    public static ModeType fromValue(String v) {
        return valueOf(v);
    }

}
