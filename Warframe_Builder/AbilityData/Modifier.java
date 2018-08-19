package AbilityData;

import java.util.ArrayList;

public class Modifier {
	private ArrayList<String> modifier_type;
	private double number;

	public Modifier(ArrayList<String> modifier_type, double number) {
		super();
		this.modifier_type = modifier_type;
		this.number = number;
	}

	public ArrayList<String> getModifier_type() {
		return modifier_type;
	}

	public void setModifier_type(ArrayList<String> modifier_type) {
		this.modifier_type = modifier_type;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	// modifie the number value of the modifier by checking the modifier type first
	public void updateScaling(String modifier_type, double scaling) {
		for (String e : this.modifier_type) {
			if (modifier_type == e) {
				this.number = this.number * scaling;
			}
		}
	}

}
