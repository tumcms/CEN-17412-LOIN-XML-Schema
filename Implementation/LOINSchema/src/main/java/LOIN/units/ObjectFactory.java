
package LOIN.units;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the LOIN.units package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: LOIN.units
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TDerivedUnit }
     * 
     */
    public TDerivedUnit createTDerivedUnit() {
        return new TDerivedUnit();
    }

    /**
     * Create an instance of {@link TSIUnit }
     * 
     */
    public TSIUnit createTSIUnit() {
        return new TSIUnit();
    }

    /**
     * Create an instance of {@link TMonetaryUnit }
     * 
     */
    public TMonetaryUnit createTMonetaryUnit() {
        return new TMonetaryUnit();
    }

    /**
     * Create an instance of {@link TConversionUnit }
     * 
     */
    public TConversionUnit createTConversionUnit() {
        return new TConversionUnit();
    }

    /**
     * Create an instance of {@link TContextDependentUnit }
     * 
     */
    public TContextDependentUnit createTContextDependentUnit() {
        return new TContextDependentUnit();
    }

    /**
     * Create an instance of {@link TDerivedUnit.Component }
     * 
     */
    public TDerivedUnit.Component createTDerivedUnitComponent() {
        return new TDerivedUnit.Component();
    }

}
