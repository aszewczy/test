
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TAS"/>
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="CLAIM"/>
 *     &lt;enumeration value="JVADM"/>
 *     &lt;enumeration value="PWADM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelType")
@XmlEnum
public enum ChannelType {

    TAS,
    MEMBER,
    BO,
    CLAIM,
    JVADM,
    PWADM;

    public String value() {
        return name();
    }

    public static ChannelType fromValue(String v) {
        return valueOf(v);
    }

}
