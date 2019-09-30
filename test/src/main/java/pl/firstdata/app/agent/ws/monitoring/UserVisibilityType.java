
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserVisibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserVisibilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUBLIC"/>
 *     &lt;enumeration value="HIDDEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserVisibilityType")
@XmlEnum
public enum UserVisibilityType {

    PUBLIC,
    HIDDEN;

    public String value() {
        return name();
    }

    public static UserVisibilityType fromValue(String v) {
        return valueOf(v);
    }

}
