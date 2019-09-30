
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QRIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MSISDN"/>
 *     &lt;enumeration value="TIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QRIdType")
@XmlEnum
public enum QRIdType {

    MSISDN,
    TIC;

    public String value() {
        return name();
    }

    public static QRIdType fromValue(String v) {
        return valueOf(v);
    }

}
