
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcqReversalReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcqReversalReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIMEOUT"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="ACQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcqReversalReasonCodeType")
@XmlEnum
public enum AcqReversalReasonCodeType {

    TIMEOUT,
    USER,
    ACQ;

    public String value() {
        return name();
    }

    public static AcqReversalReasonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
