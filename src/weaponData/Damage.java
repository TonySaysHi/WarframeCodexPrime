
package weaponData;

import enemyData.MaterialType;
import exceptions.MissingMaterialTypeException;

public class Damage {
private DamageType type;
private double damage;

public Damage(DamageType type, double damage) {
	this.type = type;
	this.damage = damage;
}

public DamageType getType() {
	return type;
}

public void setType(DamageType type) {
	this.type = type;
}

public double getDamage() {
	return damage;
}

public void setDamage(double damage) {
	this.damage = damage;
}

/**
 * see http://warframe.wikia.com/wiki/Damage_2.0#Armored
 * 
 *
 * Armor rating can be negative, and this is intended.
 * @return damage inflicted to a specific hitpoint and armor type combo.
 * @throws MissingMaterialTypeException 
 */
public double damageSimulation(MaterialType materialType, MaterialType armorType, float ArmorRating) throws MissingMaterialTypeException {
	
	if (materialType != null) {
	boolean Armored = (armorType != null);
	double HM = materialType.getDmgMultiplier(type);
	
	double DM;
	
	if (Armored) {
		double AM = armorType.getDmgMultiplier(type);
		double AR = ArmorRating;
		
		//TODO: FIX ROUNDING ERRORS, 3% IS NOT AN ACCEPTABLE MARGIN
		DM = ((1+HM)*(1+AM))/(1+((AR*(1-AM))/300));
	} else DM = 1 + HM;
	
	return  damage*(DM);
	
	} else throw new MissingMaterialTypeException();
	

	
}


}
