package LOIN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Unit {

    @XmlAttribute
    private String ucum_code;

    public Unit() {

    }

    public Unit(String code) {
        this.ucum_code = code;
    }

    public String getUcum_code() {
        return ucum_code;
    }

    public void setUcum_code(String ucum_code) {
        this.ucum_code = ucum_code;
    }
}
