
package LOIN.units;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIUnitPrefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SIUnitPrefix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="yotta"/>
 *     &lt;enumeration value="zetta"/>
 *     &lt;enumeration value="exa"/>
 *     &lt;enumeration value="peta"/>
 *     &lt;enumeration value="tera"/>
 *     &lt;enumeration value="giga"/>
 *     &lt;enumeration value="mega"/>
 *     &lt;enumeration value="kilo"/>
 *     &lt;enumeration value="hecto"/>
 *     &lt;enumeration value="deca"/>
 *     &lt;enumeration value="deci"/>
 *     &lt;enumeration value="centi"/>
 *     &lt;enumeration value="milli"/>
 *     &lt;enumeration value="micro"/>
 *     &lt;enumeration value="nano"/>
 *     &lt;enumeration value="pico"/>
 *     &lt;enumeration value="femto"/>
 *     &lt;enumeration value="atto"/>
 *     &lt;enumeration value="zepto"/>
 *     &lt;enumeration value="yocto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SIUnitPrefix", namespace = "http://tempuri.org/Units.xsd")
@XmlEnum
public enum SIUnitPrefix {


    /**
     * 
     *             Power: 10^24
     *             Symbol: Y
     *           
     * 
     */
    @XmlEnumValue("yotta")
    YOTTA("yotta"),

    /**
     * 
     *             Power: 10^21
     *             Symbol: Z
     *           
     * 
     */
    @XmlEnumValue("zetta")
    ZETTA("zetta"),

    /**
     * 
     *             Power: 10^18
     *             Symbol: E
     *           
     * 
     */
    @XmlEnumValue("exa")
    EXA("exa"),

    /**
     * 
     *             Power: 10^15
     *             Symbol: P
     *           
     * 
     */
    @XmlEnumValue("peta")
    PETA("peta"),

    /**
     * 
     *             Power: 10^12
     *             Symbol: T
     *           
     * 
     */
    @XmlEnumValue("tera")
    TERA("tera"),

    /**
     * 
     *             Power: 10^9
     *             Symbol: G
     *           
     * 
     */
    @XmlEnumValue("giga")
    GIGA("giga"),

    /**
     * 
     *             Power: 10^6
     *             Symbol: M
     *           
     * 
     */
    @XmlEnumValue("mega")
    MEGA("mega"),

    /**
     * 
     *             Power: 10^3
     *             Symbol: k
     *           
     * 
     */
    @XmlEnumValue("kilo")
    KILO("kilo"),

    /**
     * 
     *             Power: 10^2
     *             Symbol: h
     *           
     * 
     */
    @XmlEnumValue("hecto")
    HECTO("hecto"),

    /**
     * 
     *             Power: 10^1 d
     *             Symbol: a
     *           
     * 
     */
    @XmlEnumValue("deca")
    DECA("deca"),

    /**
     * 
     *             Power: 10^\u22121
     *             Symbol: d
     *           
     * 
     */
    @XmlEnumValue("deci")
    DECI("deci"),

    /**
     * 
     *             Power: 10^\u22122
     *             Symbol: c
     *           
     * 
     */
    @XmlEnumValue("centi")
    CENTI("centi"),

    /**
     * 
     *             Power: 10^\u22123
     *             Symbol: m
     *           
     * 
     */
    @XmlEnumValue("milli")
    MILLI("milli"),

    /**
     * 
     *             Power: 10^\u22126
     *             Symbol: \u03bc
     *           
     * 
     */
    @XmlEnumValue("micro")
    MICRO("micro"),

    /**
     * 
     *             Power: 10^\u22129
     *             Symbol: n
     *           
     * 
     */
    @XmlEnumValue("nano")
    NANO("nano"),

    /**
     * 
     *             Power: 10^\u221212
     *             Symbol: p
     *           
     * 
     */
    @XmlEnumValue("pico")
    PICO("pico"),

    /**
     * 
     *             Power: 10^\u221215
     *             Symbol: f
     *           
     * 
     */
    @XmlEnumValue("femto")
    FEMTO("femto"),

    /**
     * 
     *             Power: 10^\u221218
     *             Symbol: a
     *           
     * 
     */
    @XmlEnumValue("atto")
    ATTO("atto"),

    /**
     * 
     *             Power: 10^\u221221
     *             Symbol: z
     *           
     * 
     */
    @XmlEnumValue("zepto")
    ZEPTO("zepto"),

    /**
     * 
     *             Power: 10^\u221224
     *             Symbol: y
     *           
     * 
     */
    @XmlEnumValue("yocto")
    YOCTO("yocto");
    private final String value;

    SIUnitPrefix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SIUnitPrefix fromValue(String v) {
        for (SIUnitPrefix c: SIUnitPrefix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
