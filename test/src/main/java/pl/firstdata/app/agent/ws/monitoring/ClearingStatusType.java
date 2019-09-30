
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_SETTLEMENT"/>
 *     &lt;enumeration value="SETTLED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClearingStatusType")
@XmlEnum
public enum ClearingStatusType {

    IN_SETTLEMENT,
    SETTLED,
    REJECTED;

    public String value() {
        return name();
    }

    public static ClearingStatusType fromValue(String v) {
        return valueOf(v);
    }

}
