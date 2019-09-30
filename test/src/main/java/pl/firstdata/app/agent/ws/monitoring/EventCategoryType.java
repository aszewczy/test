
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEC"/>
 *     &lt;enumeration value="ADM"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="GEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventCategoryType")
@XmlEnum
public enum EventCategoryType {

    SEC,
    ADM,
    TX,
    GEN;

    public String value() {
        return name();
    }

    public static EventCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
