
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComponentStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STARTING"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PASSIVE"/>
 *     &lt;enumeration value="CLOSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComponentStatusType", namespace = "http://www.hp.com/mobicore/xfmf/mon")
@XmlEnum
public enum ComponentStatusType {

    STARTING,
    ACTIVE,
    PASSIVE,
    CLOSING;

    public String value() {
        return name();
    }

    public static ComponentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
