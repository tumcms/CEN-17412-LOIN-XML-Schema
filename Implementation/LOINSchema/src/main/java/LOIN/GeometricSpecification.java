package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class GeometricSpecification {

	private DetailEnum detail;

	private DimensionalityEnum dimensionality;

	private LocationEnum location;

	private AppearanceEnum appearance;

	private ParametricBehaviourEnum parametricBehaviour;

	public GeometricSpecification() {
	}

	public GeometricSpecification(DetailEnum detail, DimensionalityEnum dimensionality,
	                              LocationEnum location, AppearanceEnum appearance,
	                              ParametricBehaviourEnum parametricBehaviour) {
		this.detail = detail;
		this.dimensionality = dimensionality;
		this.location = location;
		this.appearance = appearance;
		this.parametricBehaviour = parametricBehaviour;
	}

	public DetailEnum getDetail() {
		return detail;
	}

	public void setDetail(DetailEnum detail) {
		this.detail = detail;
	}

	public DimensionalityEnum getDimensionality() {
		return dimensionality;
	}

	public void setDimensionality(DimensionalityEnum dimensionality) {
		this.dimensionality = dimensionality;
	}

	public LocationEnum getLocation() {
		return location;
	}

	public void setLocation(LocationEnum location) {
		this.location = location;
	}

	public AppearanceEnum getAppearance() {
		return appearance;
	}

	public void setAppearance(AppearanceEnum appearance) {
		this.appearance = appearance;
	}

	public ParametricBehaviourEnum getParametricBehaviour() {
		return parametricBehaviour;
	}

	public void setParametricBehaviour(ParametricBehaviourEnum parametricBehaviour) {
		this.parametricBehaviour = parametricBehaviour;
	}
}


enum DetailEnum {
	L1,
	L2,
	L3,
	L4,
	L5
}

enum DimensionalityEnum {
	D0,
	D1,
	D2,
	D3,
}

enum LocationEnum {
	Absolute,
	Relative
}


enum AppearanceEnum {
	NoColor,
	SingleColor,
	MaterialColor,
	Textures
}

enum ParametricBehaviourEnum {
	ExplicitGeometry,
	ConstructiveGeometry,
	ParametricGeometry
}