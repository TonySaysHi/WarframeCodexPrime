package weaponData;


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


}
