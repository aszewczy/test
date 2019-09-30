
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DONE"/>
 *     &lt;enumeration value="DECLINED"/>
 *     &lt;enumeration value="SENDING"/>
 *     &lt;enumeration value="SENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferStatusType")
@XmlEnum
public enum TransferStatusType {

    DONE,
    DECLINED,
    SENDING,
    SENT;

    public String value() {
        return name();
    }

    public static TransferStatusType fromValue(String v) {
        return valueOf(v);
    }

}
