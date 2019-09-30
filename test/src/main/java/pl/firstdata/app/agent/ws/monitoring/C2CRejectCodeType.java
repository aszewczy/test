
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C2CRejectCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="C2CRejectCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAD_MSISDN"/>
 *     &lt;enumeration value="BAD_APP_STATUS"/>
 *     &lt;enumeration value="SEC_REJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "C2CRejectCodeType")
@XmlEnum
public enum C2CRejectCodeType {

    BAD_MSISDN,
    BAD_APP_STATUS,
    SEC_REJECT;

    public String value() {
        return name();
    }

    public static C2CRejectCodeType fromValue(String v) {
        return valueOf(v);
    }

}
