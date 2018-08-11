package weaponData;

import java.util.ArrayList;

public class Melee extends Weapon{
private double attack_speed;
private double channeling_cost;
private double channeling_dmg;
private double damage_block;
private double leap_dmg;
private double spin_dmg;
private double wall_dmg;
private double range;

public Melee(String name, ArrayList damage, double attack_speed, double channeling_cost, double channeling_dmg,
		double damage_block, double leap_dmg, double spin_dmg, double wall_dmg, double range) {
	super(name, damage);
	this.attack_speed = attack_speed;
	this.channeling_cost = channeling_cost;
	this.channeling_dmg = channeling_dmg;
	this.damage_block = damage_block;
	this.leap_dmg = leap_dmg;
	this.spin_dmg = spin_dmg;
	this.wall_dmg = wall_dmg;
	this.range = range;
}

public double getAttack_speed() {
	return attack_speed;
}

public void setAttack_speed(double attack_speed) {
	this.attack_speed = attack_speed;
}

public double getChanneling_cost() {
	return channeling_cost;
}

public void setChanneling_cost(double channeling_cost) {
	this.channeling_cost = channeling_cost;
}

public double getChanneling_dmg() {
	return channeling_dmg;
}

public void setChanneling_dmg(double channeling_dmg) {
	this.channeling_dmg = channeling_dmg;
}

public double getDamage_block() {
	return damage_block;
}

public void setDamage_block(double damage_block) {
	this.damage_block = damage_block;
}

public double getLeap_dmg() {
	return leap_dmg;
}

public void setLeap_dmg(double leap_dmg) {
	this.leap_dmg = leap_dmg;
}

public double getSpin_dmg() {
	return spin_dmg;
}

public void setSpin_dmg(double spin_dmg) {
	this.spin_dmg = spin_dmg;
}

public double getWall_dmg() {
	return wall_dmg;
}

public void setWall_dmg(double wall_dmg) {
	this.wall_dmg = wall_dmg;
}

public double getRange() {
	return range;
}

public void setRange(double range) {
	this.range = range;
}


}
