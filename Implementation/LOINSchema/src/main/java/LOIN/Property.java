package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Property {
	@XmlAttribute
	private String name;

	private String unit;

	private String dataType;

	@XmlAttribute
	private String refToClassification;

	public Property() {
	}

	public Property(String name, String unit, String dataType, String refToClassification) {
		this.name = name;
		this.unit = unit;
		this.dataType = dataType;
		this.refToClassification = refToClassification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getRefToClassification() {
		return refToClassification;
	}

	public void setRefToClassification(String refToClassification) {
		this.refToClassification = refToClassification;
	}
}
