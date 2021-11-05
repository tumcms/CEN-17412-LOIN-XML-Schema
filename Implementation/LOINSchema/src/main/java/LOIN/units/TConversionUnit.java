
package LOIN.units;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TConversionUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TConversionUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/Units.xsd}TUnit">
 *       &lt;sequence>
 *         &lt;element name="BaseUnit" type="{http://tempuri.org/Units.xsd}TUnit"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Scale" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *       &lt;attribute name="Offset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConversionUnit", namespace = "http://tempuri.org/Units.xsd", propOrder = {
    "baseUnit"
})
public class TConversionUnit
    extends TUnit
{

    @XmlElement(name = "BaseUnit", namespace = "http://tempuri.org/Units.xsd", required = true)
    protected TUnit baseUnit;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Symbol", required = true)
    protected String symbol;
    @XmlAttribute(name = "Scale")
    protected Double scale;
    @XmlAttribute(name = "Offset")
    protected Double offset;

    /**
     * Gets the value of the baseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TUnit }
     *     
     */
    public TUnit getBaseUnit() {
        return baseUnit;
    }

    /**
     * Sets the value of the baseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUnit }
     *     
     */
    public void setBaseUnit(TUnit value) {
        this.baseUnit = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getScale() {
        if (scale == null) {
            return  1.0D;
        } else {
            return scale;
        }
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScale(Double value) {
        this.scale = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getOffset() {
        if (offset == null) {
            return  0.0D;
        } else {
            return offset;
        }
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffset(Double value) {
        this.offset = value;
    }

}
