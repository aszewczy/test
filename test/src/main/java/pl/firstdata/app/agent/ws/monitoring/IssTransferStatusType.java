
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssTransferStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssTransferStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHORIZED"/>
 *     &lt;enumeration value="DECLINED"/>
 *     &lt;enumeration value="NOTFOUND"/>
 *     &lt;enumeration value="PROCESSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssTransferStatusType")
@XmlEnum
public enum IssTransferStatusType {

    AUTHORIZED,
    DECLINED,
    NOTFOUND,
    PROCESSING;

    public String value() {
        return name();
    }

    public static IssTransferStatusType fromValue(String v) {
        return valueOf(v);
    }

}
