
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLabelsMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetLabelsMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="LIST_OF_KEYS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetLabelsMode")
@XmlEnum
public enum GetLabelsMode {


    /**
     * Get all label data
     * 
     */
    ALL,

    /**
     * Get keys only
     * 
     */
    LIST_OF_KEYS;

    public String value() {
        return name();
    }

    public static GetLabelsMode fromValue(String v) {
        return valueOf(v);
    }

}
