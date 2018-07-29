package weaponData;

import enemyData.MaterialType;

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
 * Armor rating can be negative, and this is intended.
 * @return damage inflicted to a specific armor type.
 * @throws MissingMaterialTypeException 
 */
public double DamageSimulation(MaterialType materialType, MaterialType armorType, double ArmorRating) throws MissingMaterialTypeException {
	
	if (materialType != null) {
	boolean Armored = (armorType != null);
	double HM = materialType.getDmgMultiplier(type);
	
	double DM;
	
	if (Armored) {
		double AM = armorType.getDmgMultiplier(type);
		double AR = ArmorRating;
		
		DM = ((HM)*(AM))/(1+((AR*(AM))/300));
	} else DM = HM;
	
	return  damage*(1+DM);
	
	} else throw new MissingMaterialTypeException();
	

	
}


}
