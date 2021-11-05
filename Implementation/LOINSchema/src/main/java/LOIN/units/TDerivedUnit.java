
package LOIN.units;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDerivedUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDerivedUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/Units.xsd}TUnit">
 *       &lt;sequence>
 *         &lt;element name="Component" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Unit" type="{http://tempuri.org/Units.xsd}TSIUnit"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Exponent" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDerivedUnit", namespace = "http://tempuri.org/Units.xsd", propOrder = {
    "component"
})
public class TDerivedUnit
    extends TUnit
{

    @XmlElement(name = "Component", namespace = "http://tempuri.org/Units.xsd", required = true)
    protected List<Component> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Component }
     * 
     * 
     */
    public List<Component> getComponent() {
        if (component == null) {
            component = new ArrayList<Component>();
        }
        return this.component;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Unit" type="{http://tempuri.org/Units.xsd}TSIUnit"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Exponent" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unit"
    })
    public static class Component {

        @XmlElement(name = "Unit", namespace = "http://tempuri.org/Units.xsd", required = true)
        protected TSIUnit unit;
        @XmlAttribute(name = "Exponent", required = true)
        protected BigInteger exponent;

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link TSIUnit }
         *     
         */
        public TSIUnit getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TSIUnit }
         *     
         */
        public void setUnit(TSIUnit value) {
            this.unit = value;
        }

        /**
         * Gets the value of the exponent property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExponent() {
            return exponent;
        }

        /**
         * Sets the value of the exponent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExponent(BigInteger value) {
            this.exponent = value;
        }

    }

}
