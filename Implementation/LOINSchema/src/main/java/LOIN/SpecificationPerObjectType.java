package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class SpecificationPerObjectType {
	@XmlAttribute
	private String globalId;

	private ObjectType objectType;

	private DocumentationSpecification documentationSpecification;

	private GeometricSpecification geometricSpecification;

	private AlphanumericInformationSpecification alphanumericInformationSpecification;

	public SpecificationPerObjectType() {
	}

	public SpecificationPerObjectType(String globalId, ObjectType objectType, DocumentationSpecification documentationSpecification,
	                                  GeometricSpecification geometricSpecification,
	                                  AlphanumericInformationSpecification alphanumericInformationSpecification) {
		this.globalId = globalId;
		this.objectType = objectType;
		this.documentationSpecification = documentationSpecification;
		this.geometricSpecification = geometricSpecification;
		this.alphanumericInformationSpecification = alphanumericInformationSpecification;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public ObjectType getObjectType() {
		return objectType;
	}

	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}

	public DocumentationSpecification getDocumentationSpecification() {
		return documentationSpecification;
	}

	public void setDocumentationSpecification(DocumentationSpecification documentationSpecification) {
		this.documentationSpecification = documentationSpecification;
	}

	public GeometricSpecification getGeometricSpecification() {
		return geometricSpecification;
	}

	public void setGeometricSpecification(GeometricSpecification geometricSpecification) {
		this.geometricSpecification = geometricSpecification;
	}

	public AlphanumericInformationSpecification getAlphanumericInformationSpecification() {
		return alphanumericInformationSpecification;
	}

	public void setAlphanumericInformationSpecification(AlphanumericInformationSpecification alphanumericInformationSpecification) {
		this.alphanumericInformationSpecification = alphanumericInformationSpecification;
	}
}
