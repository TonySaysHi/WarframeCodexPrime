package AbilityData;

public class AbilityAttribute {
private EffectType type;
private double number;

public AbilityAttribute(EffectType type, double number) {
	this.type = type;
	this.number = number;
}

public EffectType getType() {
	return type;
}

public void setType(EffectType type) {
	this.type = type;
}

public double getNumber() {
	return number;
}

public void setNumber(double number) {
	this.number = number;
}
}
