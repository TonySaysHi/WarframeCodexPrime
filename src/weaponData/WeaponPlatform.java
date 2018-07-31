package weaponData;
import java.util.ArrayList;

import enemyData.MaterialType;
import exceptions.MissingMaterialTypeException;

public class WeaponPlatform {
private String name;
private ArrayList<Damage> damage;

public WeaponPlatform(String name, ArrayList damage) {
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

public double calculateDamage(MaterialType materialType ,MaterialType armorType, float ArmorRating) throws MissingMaterialTypeException {
	float temp = 0;
	for(Damage e:damage) {
		temp += e.damageSimulation(materialType, armorType, ArmorRating);
	}
	return temp;
	
}
}
