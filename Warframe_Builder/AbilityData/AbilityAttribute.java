package AbilityData;

public class AbilityAttribute {
private String type;
private String unit;
private Modifier modifier;

public AbilityAttribute(String type, Modifier modifier , String unit) {
	this.type = type;
	this.modifier = modifier;
	this.unit = unit;
}

public String getUnit() {
	return unit;
}

public void setUnit(String unit) {
	this.unit = unit;
}

public Modifier getModifier() {
	return modifier;
}

public void setModifier(Modifier modifier) {
	this.modifier = modifier;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Modifier getNumber() {
	return modifier;
}

public void setNumber(Modifier modifier) {
	this.modifier = modifier;
}
}
