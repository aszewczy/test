
package pl.firstdata.app.agent.ws.monitoring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSISDNCheckTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MSISDNCheckTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C2C_CHECK"/>
 *     &lt;enumeration value="REG_CHECK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSISDNCheckTypeType")
@XmlEnum
public enum MSISDNCheckTypeType {


    /**
     * used in C2C flow
     * 
     */
    @XmlEnumValue("C2C_CHECK")
    C_2_C_CHECK("C2C_CHECK"),

    /**
     * used in registration flows. In this case, appType is required
     * 
     */
    REG_CHECK("REG_CHECK");
    private final String value;

    MSISDNCheckTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MSISDNCheckTypeType fromValue(String v) {
        for (MSISDNCheckTypeType c: MSISDNCheckTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
