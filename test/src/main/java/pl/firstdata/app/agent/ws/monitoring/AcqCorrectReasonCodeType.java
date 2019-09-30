
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcqCorrectReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcqCorrectReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="ACQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcqCorrectReasonCodeType")
@XmlEnum
public enum AcqCorrectReasonCodeType {

    USER,
    ACQ;

    public String value() {
        return name();
    }

    public static AcqCorrectReasonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
