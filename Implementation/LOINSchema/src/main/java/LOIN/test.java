package LOIN;

import javax.xml.bind.JAXB;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) throws IOException {

		// main specification
		LOINSpecification idsSpecification = new LOINSpecification();
		idsSpecification.setGlobalId("04f9e8c2-1e63-4244-8e93-0dd8f3165107");
		idsSpecification.setName("LOIN01");
		idsSpecification.setDescription("LOIN Example");
		idsSpecification.setContext(new Context("Visualization",
				"Preliminary Design", "Architect", "Client"));

		// now lets set the specification per object
		List<SpecificationPerObjectType> specificationPerObjectTypes = new ArrayList<SpecificationPerObjectType>();

		// 01. door
		SpecificationPerObjectType specificationPerObjectType = new SpecificationPerObjectType();
		specificationPerObjectType.setGlobalId("99b37edd-e108-4601-91d4-abfbfd069963");

		// set object type
		ObjectType objectTypeElement = new ObjectType("BuildingElement", "https://standards.buildingsmart.org/IFC/RELEASE/IFC2x3/FINAL/HTML/ifcproductextension/lexical/ifcelement.htm",
				"IfcElement", null);

		ObjectType objectType = new ObjectType("Door", "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/ADD2_TC1/HTML/schema/ifcsharedbldgelements/lexical/ifcdoor.htm",
				"IfcDoor", objectTypeElement);

		specificationPerObjectType.setObjectType(objectType);
		// set alphanumeric information
		AlphanumericInformationSpecification alphanumericInformationSpecification = new AlphanumericInformationSpecification();
		alphanumericInformationSpecification.setDescription("Door object alphanumeric information");
		alphanumericInformationSpecification.setPropertySets(new ArrayList<PropertySet>());
		// create properties
		Property property1 = new Property("Width", "cm", "Real", "http://bsdd.buildingsmart.org/#concept/details/0C$q01fAv9ZOabWvo68xm6");
		PropertySet propertySet = new PropertySet("Door Properties", "Classification001", new ArrayList<Property>());
		propertySet.getProperties().add(property1);
		alphanumericInformationSpecification.getPropertySets().add(propertySet);
		specificationPerObjectType.setAlphanumericInformationSpecification(alphanumericInformationSpecification);

		//// add it
		specificationPerObjectTypes.add(specificationPerObjectType);

		// 02. interior door
		SpecificationPerObjectType specificationPerObjectTypeDoor2 = new SpecificationPerObjectType();
		specificationPerObjectTypeDoor2.setGlobalId("99b37edd-e108-4601-91d4-abfbfd069977");

		// set object type
		ObjectType objectTypeInteriorDoor = new ObjectType("Interior-Door", "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/ADD2_TC1/HTML/schema/ifcsharedbldgelements/lexical/ifcdoor.htm",
				"IfcDoor", objectType);

		specificationPerObjectTypeDoor2.setObjectType(objectType);
		// set alphanumeric information
		AlphanumericInformationSpecification alphanumericInformationSpecificationInterior = new AlphanumericInformationSpecification();
		alphanumericInformationSpecificationInterior.setDescription("Interior Door object alphanumeric information");
		alphanumericInformationSpecificationInterior.setPropertySets(new ArrayList<PropertySet>());
		// create properties
		Property property1Interior = new Property("FireResistanceRating", "NONE", "Integer", "http://bsdd.buildingsmart.org/#concept/details/07RqSAS5b3xgKYraRjwwZP");
		Property property2Interior = new Property("IsCombustible", "NONE", "Boolean", "http://bsdd.buildingsmart.org/#concept/details/08fiQpHdbDr8e3q81XFwRb");
		PropertySet propertySetInterior = new PropertySet("FireCodeProperties", "Classification001", new ArrayList<Property>());
		propertySetInterior.getProperties().add(property1Interior);
		propertySetInterior.getProperties().add(property2Interior);
		alphanumericInformationSpecificationInterior.getPropertySets().add(propertySetInterior);
		specificationPerObjectTypeDoor2.setAlphanumericInformationSpecification(alphanumericInformationSpecificationInterior);

		//// add it
		specificationPerObjectTypes.add(specificationPerObjectTypeDoor2);

//		SpecificationPerObjectType specificationPerObjectType1 = new SpecificationPerObjectType();
//		specificationPerObjectType1.setGlobalId("8bae44fe-b9ab-462b-9112-2ee12d5381fb");
//
//		// set object type
//		ObjectType objectTypeWall = new ObjectType("Wall", "Classification16", "IFC", null);
//		specificationPerObjectType1.setObjectType(objectTypeWall);
//
//		// set geometric Information
////		GeometricSpecification geometricSpecification = new GeometricSpecification();
////		geometricSpecification.setAppearance(AppearanceEnum.Textures);
////		geometricSpecification.setDetail(DetailEnum.L3);
////		geometricSpecification.setDimensionality(DimensionalityEnum.D3);
////		geometricSpecification.setLocation(LocationEnum.Relative);
////		geometricSpecification.setParametricBehaviour(ParametricBehaviourEnum.ParametricGeometry);
////		specificationPerObjectType1.setGeometricSpecification(geometricSpecification);
//
//		// set alphanumeric information
//		specificationPerObjectType1.setAlphanumericInformationSpecification(null);
//
//		// create documentation
////		specificationPerObjectType1.setDocumentationSpecification(null);
//
//		//// add it
//		specificationPerObjectTypes.add(specificationPerObjectType1);

		// go back to main object
		idsSpecification.setSpecificationPerObjectTypeList(specificationPerObjectTypes);

		StringWriter sw = new StringWriter();
		JAXB.marshal(idsSpecification, sw);
		String xmlString = sw.toString();


		FileWriter csvWriter = new FileWriter( "loin_test.xml");
		csvWriter.write(xmlString);

		csvWriter.flush();
		csvWriter.close();
	}
}
