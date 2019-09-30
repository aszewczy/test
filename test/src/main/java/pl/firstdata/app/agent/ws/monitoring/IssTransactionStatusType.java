
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssTransactionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssTransactionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHORIZED"/>
 *     &lt;enumeration value="DECLINED"/>
 *     &lt;enumeration value="REVERSED"/>
 *     &lt;enumeration value="CORRECTED"/>
 *     &lt;enumeration value="PROCESSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssTransactionStatusType")
@XmlEnum
public enum IssTransactionStatusType {

    AUTHORIZED,
    DECLINED,
    REVERSED,
    CORRECTED,
    PROCESSING;

    public String value() {
        return name();
    }

    public static IssTransactionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
