
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XfmfStatusBaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XfmfStatusBaseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XfmfStatusBaseType")
@XmlEnum
public enum XfmfStatusBaseType {

    SUCCESS,
    ERROR;

    public String value() {
        return name();
    }

    public static XfmfStatusBaseType fromValue(String v) {
        return valueOf(v);
    }

}
