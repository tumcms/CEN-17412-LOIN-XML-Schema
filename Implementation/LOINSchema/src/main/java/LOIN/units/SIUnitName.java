
package LOIN.units;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIUnitName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SIUnitName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="metre"/>
 *     &lt;enumeration value="kilogram"/>
 *     &lt;enumeration value="second"/>
 *     &lt;enumeration value="ampere"/>
 *     &lt;enumeration value="kelvin"/>
 *     &lt;enumeration value="mole"/>
 *     &lt;enumeration value="candela"/>
 *     &lt;enumeration value="radian"/>
 *     &lt;enumeration value="steradian"/>
 *     &lt;enumeration value="hertz"/>
 *     &lt;enumeration value="newton"/>
 *     &lt;enumeration value="pascal"/>
 *     &lt;enumeration value="joule"/>
 *     &lt;enumeration value="watt"/>
 *     &lt;enumeration value="coulomb"/>
 *     &lt;enumeration value="volt"/>
 *     &lt;enumeration value="farad"/>
 *     &lt;enumeration value="ohm"/>
 *     &lt;enumeration value="siemens"/>
 *     &lt;enumeration value="weber"/>
 *     &lt;enumeration value="tesla"/>
 *     &lt;enumeration value="henry"/>
 *     &lt;enumeration value="degree_Celsius"/>
 *     &lt;enumeration value="lumen"/>
 *     &lt;enumeration value="lux"/>
 *     &lt;enumeration value="becquerel"/>
 *     &lt;enumeration value="gray"/>
 *     &lt;enumeration value="sievert"/>
 *     &lt;enumeration value="katal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SIUnitName", namespace = "http://tempuri.org/Units.xsd")
@XmlEnum
public enum SIUnitName {


    /**
     * 
     *             Quantity: length
     *             Symbol: m
     *           
     * 
     */
    @XmlEnumValue("metre")
    METRE("metre"),

    /**
     * 
     *             Quantity: mass
     *             Symbol: kg
     *           
     * 
     */
    @XmlEnumValue("kilogram")
    KILOGRAM("kilogram"),

    /**
     * 
     *             Quantity: time
     *             Symbol: s
     *           
     * 
     */
    @XmlEnumValue("second")
    SECOND("second"),

    /**
     * 
     *             Quantity: electric current
     *             Symbol: A
     *           
     * 
     */
    @XmlEnumValue("ampere")
    AMPERE("ampere"),

    /**
     * 
     *             Quantity: thermodynamic temperature
     *             Symbol: K
     *           
     * 
     */
    @XmlEnumValue("kelvin")
    KELVIN("kelvin"),

    /**
     * 
     *             Quantity: amount of substance
     *             Symbol: mol
     *           
     * 
     */
    @XmlEnumValue("mole")
    MOLE("mole"),

    /**
     * 
     *             Quantity: luminous intensity
     *             Symbol: cd
     *           
     * 
     */
    @XmlEnumValue("candela")
    CANDELA("candela"),

    /**
     * 
     *             Quantity: plane angle
     *             Symbol: rad
     *             Expression: rad = m/m = 1
     *           
     * 
     */
    @XmlEnumValue("radian")
    RADIAN("radian"),

    /**
     * 
     *             Quantity: solid angle
     *             Symbol: sr
     *             Expression: sr = m2/m2 = 1
     *           
     * 
     */
    @XmlEnumValue("steradian")
    STERADIAN("steradian"),

    /**
     * 
     *             Quantity: frequency
     *             Symbol: Hz
     *             Expression: Hz = s\u22121
     *           
     * 
     */
    @XmlEnumValue("hertz")
    HERTZ("hertz"),

    /**
     * 
     *             Quantity: force
     *             Symbol: N
     *             Expression: N = kg · m/s2
     *           
     * 
     */
    @XmlEnumValue("newton")
    NEWTON("newton"),

    /**
     * 
     *             Quantity: pressure
     *             Symbol: stress
     *             Expression: Pa	Pa = N/m2
     *           
     * 
     */
    @XmlEnumValue("pascal")
    PASCAL("pascal"),

    /**
     * 
     *             Quantity: energy
     *             Symbol: J
     *             Expression: J = N · m
     *           
     * 
     */
    @XmlEnumValue("joule")
    JOULE("joule"),

    /**
     * 
     *             Quantity: power
     *             Symbol: W
     *             Expression: W = J/s
     *           
     * 
     */
    @XmlEnumValue("watt")
    WATT("watt"),

    /**
     * 
     *             Quantity: electric charge
     *             Symbol: C
     *             Expression: C = A · s
     *           
     * 
     */
    @XmlEnumValue("coulomb")
    COULOMB("coulomb"),

    /**
     * 
     *             Quantity: electric potential difference
     *             Symbol: V
     *             Expression: V = W/A
     *           
     * 
     */
    @XmlEnumValue("volt")
    VOLT("volt"),

    /**
     * 
     *             Quantity: capacitance
     *             Symbol: F
     *             Expression: F = C/V
     *           
     * 
     */
    @XmlEnumValue("farad")
    FARAD("farad"),

    /**
     * 
     *             Quantity: electric resistance
     *             Symbol: \u03a9
     *             Expression: \u03a9 = V/A
     *           
     * 
     */
    @XmlEnumValue("ohm")
    OHM("ohm"),

    /**
     * 
     *             Quantity: electric conductance
     *             Symbol: S
     *             Expression: S = \u03a9\u22121
     *           
     * 
     */
    @XmlEnumValue("siemens")
    SIEMENS("siemens"),

    /**
     * 
     *             Quantity: magnetic flux
     *             Symbol: Wb
     *             Expression: Wb = V · s
     *           
     * 
     */
    @XmlEnumValue("weber")
    WEBER("weber"),

    /**
     * 
     *             Quantity: magnetic flux density
     *             Symbol: T
     *             Expression: T = Wb/m2
     *           
     * 
     */
    @XmlEnumValue("tesla")
    TESLA("tesla"),

    /**
     * 
     *             Quantity: inductance
     *             Symbol: H
     *             Expression: H = Wb/A
     *           
     * 
     */
    @XmlEnumValue("henry")
    HENRY("henry"),

    /**
     * 
     *             Quantity: Celsius temperature
     *             Symbol: ºC
     *             Expression: ºC = K
     *           
     * 
     */
    @XmlEnumValue("degree_Celsius")
    DEGREE_CELSIUS("degree_Celsius"),

    /**
     * 
     *             Quantity: luminous flux
     *             Symbol: lm
     *             Expression: lm = cd · sr
     *           
     * 
     */
    @XmlEnumValue("lumen")
    LUMEN("lumen"),

    /**
     * 
     *             Quantity: illuminance
     *             Symbol: lx
     *             Expression: lx = lm/m2
     *           
     * 
     */
    @XmlEnumValue("lux")
    LUX("lux"),

    /**
     * 
     *             Quantity: activity (of a radionuclide)
     *             Symbol: Bq
     *             Expression: Bq = s\u22121
     *           
     * 
     */
    @XmlEnumValue("becquerel")
    BECQUEREL("becquerel"),

    /**
     * 
     *             Quantity: absorbed dose
     *             Symbol: Gy
     *             Expression: Gy = J/kg
     *           
     * 
     */
    @XmlEnumValue("gray")
    GRAY("gray"),

    /**
     * 
     *             Quantity: dose equivalent
     *             Symbol: Sv
     *             Expression: Sv = J/kg
     *           
     * 
     */
    @XmlEnumValue("sievert")
    SIEVERT("sievert"),

    /**
     * 
     *             Quantity: catalytic activity
     *             Symbol: kat
     *             Expression: kat = mol/s
     *           
     * 
     */
    @XmlEnumValue("katal")
    KATAL("katal");
    private final String value;

    SIUnitName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SIUnitName fromValue(String v) {
        for (SIUnitName c: SIUnitName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
