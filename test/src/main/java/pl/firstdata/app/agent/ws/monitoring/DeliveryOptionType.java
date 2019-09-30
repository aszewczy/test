
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="FAST"/>
 *     &lt;enumeration value="FAST_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryOptionType")
@XmlEnum
public enum DeliveryOptionType {

    NORMAL,
    FAST,
    FAST_ONLY;

    public String value() {
        return name();
    }

    public static DeliveryOptionType fromValue(String v) {
        return valueOf(v);
    }

}
