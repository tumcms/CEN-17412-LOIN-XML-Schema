package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequiredDocument {
	@XmlAttribute
	private String type;
	@XmlAttribute
	private String purpose;
	@XmlAttribute
	private String content;

	public RequiredDocument(String type, String purpose, String content) {
		this.type = type;
		this.purpose = purpose;
		this.content = content;
	}

	public RequiredDocument() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
