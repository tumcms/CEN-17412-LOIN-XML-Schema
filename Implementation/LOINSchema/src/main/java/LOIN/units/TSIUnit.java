
package LOIN.units;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSIUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSIUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/Units.xsd}TUnit">
 *       &lt;attribute name="Name" use="required" type="{http://tempuri.org/Units.xsd}SIUnitName" />
 *       &lt;attribute name="Prefix" type="{http://tempuri.org/Units.xsd}SIUnitPrefix" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSIUnit", namespace = "http://tempuri.org/Units.xsd")
public class TSIUnit
    extends TUnit
{

    @XmlAttribute(name = "Name", required = true)
    protected SIUnitName name;
    @XmlAttribute(name = "Prefix")
    protected SIUnitPrefix prefix;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SIUnitName }
     *     
     */
    public SIUnitName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIUnitName }
     *     
     */
    public void setName(SIUnitName value) {
        this.name = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link SIUnitPrefix }
     *     
     */
    public SIUnitPrefix getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIUnitPrefix }
     *     
     */
    public void setPrefix(SIUnitPrefix value) {
        this.prefix = value;
    }

}
