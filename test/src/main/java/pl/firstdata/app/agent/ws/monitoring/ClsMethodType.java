
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClsMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="EXE"/>
 *     &lt;enumeration value="ELX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClsMethodType")
@XmlEnum
public enum ClsMethodType {

    INT,
    EXE,
    ELX;

    public String value() {
        return name();
    }

    public static ClsMethodType fromValue(String v) {
        return valueOf(v);
    }

}
