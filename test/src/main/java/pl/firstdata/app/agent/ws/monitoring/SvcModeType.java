
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SvcModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IKO"/>
 *     &lt;enumeration value="BLIK"/>
 *     &lt;enumeration value="TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SvcModeType")
@XmlEnum
public enum SvcModeType {

    IKO,
    BLIK,
    TRANSFER;

    public String value() {
        return name();
    }

    public static SvcModeType fromValue(String v) {
        return valueOf(v);
    }

}
