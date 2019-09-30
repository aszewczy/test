
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthDeclineCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthDeclineCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/>
 *     &lt;enumeration value="USER_DECLINED"/>
 *     &lt;enumeration value="ISSUER_DECLINED"/>
 *     &lt;enumeration value="TAS_DECLINED"/>
 *     &lt;enumeration value="SEC_DECLINED"/>
 *     &lt;enumeration value="BAD_PIN"/>
 *     &lt;enumeration value="SYSTEM_ERROR"/>
 *     &lt;enumeration value="GENERAL_ERROR"/>
 *     &lt;enumeration value="TIMEOUT"/>
 *     &lt;enumeration value="USER_TIMEOUT"/>
 *     &lt;enumeration value="TX_NOTFOUND"/>
 *     &lt;enumeration value="RET_LATE"/>
 *     &lt;enumeration value="RET_AMT_EXCEEDED"/>
 *     &lt;enumeration value="ALIAS_DECLINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthDeclineCodeType")
@XmlEnum
public enum AuthDeclineCodeType {

    LIMIT_EXCEEDED,
    INSUFFICIENT_FUNDS,
    USER_DECLINED,
    ISSUER_DECLINED,
    TAS_DECLINED,
    SEC_DECLINED,
    BAD_PIN,
    SYSTEM_ERROR,
    GENERAL_ERROR,
    TIMEOUT,
    USER_TIMEOUT,
    TX_NOTFOUND,
    RET_LATE,
    RET_AMT_EXCEEDED,
    ALIAS_DECLINED;

    public String value() {
        return name();
    }

    public static AuthDeclineCodeType fromValue(String v) {
        return valueOf(v);
    }

}
