
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasRegisterModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AliasRegisterModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OVERWRITE"/>
 *     &lt;enumeration value="ADD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AliasRegisterModeType")
@XmlEnum
public enum AliasRegisterModeType {

    OVERWRITE,
    ADD;

    public String value() {
        return name();
    }

    public static AliasRegisterModeType fromValue(String v) {
        return valueOf(v);
    }

}
