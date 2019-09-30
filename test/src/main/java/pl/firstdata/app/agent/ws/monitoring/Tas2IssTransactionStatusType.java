
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tas2IssTransactionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tas2IssTransactionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHORIZED"/>
 *     &lt;enumeration value="REVERSED"/>
 *     &lt;enumeration value="DECLINED"/>
 *     &lt;enumeration value="PROCESSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tas2IssTransactionStatusType")
@XmlEnum
public enum Tas2IssTransactionStatusType {

    AUTHORIZED,
    REVERSED,
    DECLINED,
    PROCESSED;

    public String value() {
        return name();
    }

    public static Tas2IssTransactionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
