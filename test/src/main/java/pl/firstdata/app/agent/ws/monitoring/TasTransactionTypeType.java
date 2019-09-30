
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TasTransactionTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TasTransactionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POS_PURCHASE"/>
 *     &lt;enumeration value="POS_CASHBACK"/>
 *     &lt;enumeration value="CASH_WITHDRAWAL"/>
 *     &lt;enumeration value="CASH_ADVANCE"/>
 *     &lt;enumeration value="WEB_PURCHASE"/>
 *     &lt;enumeration value="C2C_TRANSFER"/>
 *     &lt;enumeration value="POS_RETURN"/>
 *     &lt;enumeration value="WEB_RETURN"/>
 *     &lt;enumeration value="AUTO_PAYMENT"/>
 *     &lt;enumeration value="AP_RETURN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TasTransactionTypeType")
@XmlEnum
public enum TasTransactionTypeType {

    POS_PURCHASE("POS_PURCHASE"),
    POS_CASHBACK("POS_CASHBACK"),
    CASH_WITHDRAWAL("CASH_WITHDRAWAL"),
    CASH_ADVANCE("CASH_ADVANCE"),
    WEB_PURCHASE("WEB_PURCHASE"),
    @XmlEnumValue("C2C_TRANSFER")
    C_2_C_TRANSFER("C2C_TRANSFER"),
    POS_RETURN("POS_RETURN"),
    WEB_RETURN("WEB_RETURN"),
    AUTO_PAYMENT("AUTO_PAYMENT"),
    AP_RETURN("AP_RETURN");
    private final String value;

    TasTransactionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TasTransactionTypeType fromValue(String v) {
        for (TasTransactionTypeType c: TasTransactionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
