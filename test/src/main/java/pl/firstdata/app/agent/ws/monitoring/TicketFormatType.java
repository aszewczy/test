
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PLAIN"/>
 *     &lt;enumeration value="QR"/>
 *     &lt;enumeration value="BARCODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketFormatType")
@XmlEnum
public enum TicketFormatType {

    PLAIN,
    QR,
    BARCODE;

    public String value() {
        return name();
    }

    public static TicketFormatType fromValue(String v) {
        return valueOf(v);
    }

}
