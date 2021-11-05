package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class LOINSpecification {
	@XmlAttribute
	private String globalId;

	@XmlAttribute
	private String name;

	private String description;

	private Context context;

	private List<SpecificationPerObjectType> specificationPerObjectTypeList;

	public LOINSpecification() {
	}

	public LOINSpecification(String globalId, String name, String description, Context context, List<SpecificationPerObjectType> specificationPerObjectTypeList) {
		this.globalId = globalId;
		this.name = name;
		this.description = description;
		this.context = context;
		this.specificationPerObjectTypeList = specificationPerObjectTypeList;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public List<SpecificationPerObjectType> getSpecificationPerObjectTypeList() {
		return specificationPerObjectTypeList;
	}

	public void setSpecificationPerObjectTypeList(List<SpecificationPerObjectType> specificationPerObjectTypeList) {
		this.specificationPerObjectTypeList = specificationPerObjectTypeList;
	}
}
