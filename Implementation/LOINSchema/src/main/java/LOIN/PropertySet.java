package LOIN;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class PropertySet {
	@XmlAttribute
	private String name;
	@XmlAttribute
	private String refToClassification;

	@XmlElementWrapper(name="properties")
	@XmlElement(name="property")
	private List<Property> properties;

	public PropertySet() {
	}

	public PropertySet(String name, String refToClassification, List<Property> properties) {
		this.name = name;
		this.refToClassification = refToClassification;
		this.properties = properties;
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

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
}
