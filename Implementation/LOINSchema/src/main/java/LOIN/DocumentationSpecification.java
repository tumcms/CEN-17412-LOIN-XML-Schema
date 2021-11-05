package LOIN;

public class DocumentationSpecification {

	private RequiredDocument requiredDocument;

	public DocumentationSpecification() {
	}

	public DocumentationSpecification(RequiredDocument requiredDocument) {
		this.requiredDocument = requiredDocument;
	}

	public RequiredDocument getRequiredDocument() {
		return requiredDocument;
	}

	public void setRequiredDocument(RequiredDocument requiredDocument) {
		this.requiredDocument = requiredDocument;
	}
}
