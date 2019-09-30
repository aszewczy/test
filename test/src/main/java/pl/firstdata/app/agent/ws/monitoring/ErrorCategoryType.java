
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="TECHNICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCategoryType")
@XmlEnum
public enum ErrorCategoryType {

    BUSINESS,
    TECHNICAL;

    public String value() {
        return name();
    }

    public static ErrorCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
