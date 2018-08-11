package AbilityData;

public class Modifier {
private String modifier_type;
private double number;

public Modifier(String modifier_type, double number) {
	super();
	this.modifier_type = modifier_type;
	this.number = number;
}

public String getModifier_type() {
	return modifier_type;
}

public void setModifier_type(String modifier_type) {
	this.modifier_type = modifier_type;
}

public double getNumber() {
	return number;
}

public void setNumber(double number) {
	this.number = number;
}

}
