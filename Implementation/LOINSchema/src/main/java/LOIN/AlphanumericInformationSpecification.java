package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class AlphanumericInformationSpecification {

	private String Description;

	@XmlElementWrapper(name="propertySets")
	@XmlElement(name="propertySet")
	private List<PropertySet> propertySets;

	@XmlElementWrapper(name="properties")
	@XmlElement(name="property")
	private List<Property> properties;

	public AlphanumericInformationSpecification() {
	}

	public AlphanumericInformationSpecification(String description, List<PropertySet> propertySets, List<Property> properties) {
		Description = description;
		this.propertySets = propertySets;
		this.properties = properties;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<PropertySet> getPropertySets() {
		return propertySets;
	}

	public void setPropertySets(List<PropertySet> propertySets) {
		this.propertySets = propertySets;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
}
