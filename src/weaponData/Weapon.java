package weaponData;
import java.util.ArrayList;

public class Weapon {
private String name;
private ArrayList Damage;

public Weapon(String name, ArrayList damage) {
	super();
	this.name = name;
	Damage = damage;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList getDamage() {
	return Damage;
}

public void setDamage(ArrayList damage) {
	Damage = damage;
}

}
