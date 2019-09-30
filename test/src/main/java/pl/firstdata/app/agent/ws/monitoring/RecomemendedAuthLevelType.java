
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecomemendedAuthLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecomemendedAuthLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOCONFREQ"/>
 *     &lt;enumeration value="CONF"/>
 *     &lt;enumeration value="FULLAUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecomemendedAuthLevelType")
@XmlEnum
public enum RecomemendedAuthLevelType {

    NOCONFREQ,
    CONF,
    FULLAUTH;

    public String value() {
        return name();
    }

    public static RecomemendedAuthLevelType fromValue(String v) {
        return valueOf(v);
    }

}
