
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="WEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketChannelType")
@XmlEnum
public enum TicketChannelType {

    ATM,
    POS,
    WEB;

    public String value() {
        return name();
    }

    public static TicketChannelType fromValue(String v) {
        return valueOf(v);
    }

}
