package weaponData;
import java.util.ArrayList;

import enemyData.MaterialType;

public class Weapon {
private String name;
private ArrayList<Damage> damage;

public Weapon(String name, ArrayList damage) {
	super();
	this.name = name;
	this.damage = damage;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList getDamage() {
	return damage;
}

public void setDamage(ArrayList damage) {
	this.damage = damage;
}

public double CalculateDamage(MaterialType materialType ,MaterialType armorType, double ArmorRating) throws MissingMaterialTypeException {
	double temp = 0;
	for(Damage e:damage) {
		temp += e.damageSimulation(materialType, armorType, ArmorRating);
	}
	return temp;
	
}
}
