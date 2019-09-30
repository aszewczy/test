
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSISDNStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MSISDNStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXISTING"/>
 *     &lt;enumeration value="NONEXISTING"/>
 *     &lt;enumeration value="NONVALID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSISDNStatusType")
@XmlEnum
public enum MSISDNStatusType {


    /**
     *  MSISDN is active
     * 
     */
    EXISTING,

    /**
     * MSISDN non exist
     * 
     */
    NONEXISTING,
    NONVALID;

    public String value() {
        return name();
    }

    public static MSISDNStatusType fromValue(String v) {
        return valueOf(v);
    }

}
