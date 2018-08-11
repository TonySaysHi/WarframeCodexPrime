package AbilityData;

import java.util.ArrayList;

import weaponData.Damage;

public class Ability {
	private String name;
	private String description;
	private double energyCost;
	private ArrayList<AbilityAttribute> abilityData;
	private Damage damage;
	
	public Ability(String name ,String description, double energyCost, ArrayList<AbilityAttribute> abilityData, Damage damage) {
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

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}

}
