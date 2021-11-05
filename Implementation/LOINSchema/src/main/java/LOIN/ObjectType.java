package LOIN;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectType {
	@XmlAttribute
	private String name;
	@XmlAttribute
	private String refToClassification;
	@XmlAttribute
	private String refToDataModelType;

	private ObjectType subTypeOf;

	public ObjectType() {
	}

	public ObjectType(String name, String refToClassification, String refToDataModelType, ObjectType subTypeOf) {
		this.name = name;
		this.refToClassification = refToClassification;
		this.refToDataModelType = refToDataModelType;
		this.subTypeOf = subTypeOf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRefToClassification() {
		return refToClassification;
	}

	public void setRefToClassification(String refToClassification) {
		this.refToClassification = refToClassification;
	}

	public String getRefToDataModelType() {
		return refToDataModelType;
	}

	public void setRefToDataModelType(String refToDataModelType) {
		this.refToDataModelType = refToDataModelType;
	}

	public ObjectType getSubTypeOf() {
		return subTypeOf;
	}

	public void setSubTypeOf(ObjectType subTypeOf) {
		this.subTypeOf = subTypeOf;
	}
}
