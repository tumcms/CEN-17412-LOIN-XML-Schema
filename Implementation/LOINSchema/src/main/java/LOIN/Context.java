package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Context {
	@XmlAttribute
	private String purpose;

	@XmlAttribute
	private String informationDeliveryMileStone;

	@XmlAttribute
	private String sendingActor;

	@XmlAttribute
	private String receivingActor;

	public Context() {

	}

	public Context(String purpose, String informationDeliveryMileStone, String sendingActor, String receivingActor) {
		this.purpose = purpose;
		this.informationDeliveryMileStone = informationDeliveryMileStone;
		this.sendingActor = sendingActor;
		this.receivingActor = receivingActor;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getInformationDeliveryMileStone() {
		return informationDeliveryMileStone;
	}

	public void setInformationDeliveryMileStone(String informationDeliveryMileStone) {
		this.informationDeliveryMileStone = informationDeliveryMileStone;
	}

	public String getSendingActor() {
		return sendingActor;
	}

	public void setSendingActor(String sendingActor) {
		this.sendingActor = sendingActor;
	}

	public String getReceivingActor() {
		return receivingActor;
	}

	public void setReceivingActor(String receivingActor) {
		this.receivingActor = receivingActor;
	}
}
