package weaponData;

import java.util.ArrayList;

public class WeaponPlatform extends Weapon{
	private Weapon slot1;
	private Weapon slot2;
	
	public WeaponPlatform(String name, Weapon slot1, Weapon slot2) {
		super(name, null);
		this.slot1 = slot1;
		this.slot2 = slot2;
	}

	public Weapon getSlot1() {
		return slot1;
	}

	public void setSlot1(Weapon slot1) {
		this.slot1 = slot1;
	}

	public Weapon getSlot2() {
		return slot2;
	}

	public void setSlot2(Weapon slot2) {
		this.slot2 = slot2;
	}

}
