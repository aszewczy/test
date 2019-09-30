
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketEntryModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketEntryModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HCE"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="QR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketEntryModeType")
@XmlEnum
public enum TicketEntryModeType {

    HCE,
    MANUAL,
    QR;

    public String value() {
        return name();
    }

    public static TicketEntryModeType fromValue(String v) {
        return valueOf(v);
    }

}
