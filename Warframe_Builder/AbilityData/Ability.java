package AbilityData;

import java.util.ArrayList;

import weaponData.Damage;

public class Ability {
	private String name;
	private String description;
	private double energyCost;
	private ArrayList<AbilityAttribute> abilityData;
	private ArrayList<Damage> damage;
	
	public Ability(String name ,String description, double energyCost, ArrayList<AbilityAttribute> abilityData, ArrayList<Damage> damage) {
		this.name = name;
		this.description = description;
		this.energyCost = energyCost;
		this.abilityData = abilityData;
		this.damage = damage;
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

	public double getEnergyCost() {
		return energyCost;
	}

	public void setEnergyCost(double energyCost) {
		this.energyCost = energyCost;
	}

	public ArrayList<AbilityAttribute> getAbilityData() {
		return abilityData;
	}

	public void setAbilityData(ArrayList<AbilityAttribute> abilityData) {
		this.abilityData = abilityData;
	}

	public ArrayList<Damage> getDamage() {
		return damage;
	}

	public void setDamage(ArrayList<Damage> damage) {
		this.damage = damage;
	}
	
	//change the value of ability attributes modifiers
	public void UpdateAllModifiers(String modifier_type, double scaling) {
		if(modifier_type == "strenght") {
			for(Damage e : damage) {
				e.setDamage(e.getDamage() * scaling/100);
			}
		} else
		for(AbilityAttribute e : abilityData) {
			e.getModifier().updateScaling(modifier_type, scaling/100);
		}
	}

}
