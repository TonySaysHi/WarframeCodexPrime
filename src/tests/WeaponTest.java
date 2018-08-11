package tests;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import enemyData.MaterialType;
import exceptions.MissingMaterialTypeException;
import weaponData.Damage;
import weaponData.DamageType;
import weaponData.Firearm;
import weaponData.TriggerType;

public class WeaponTest {
	Firearm Vectis_P;

	@Before
	public void PrepareWeapon() {
		Damage A = new Damage(DamageType.PUNCTURE, 157.5);
		Damage B = new Damage(DamageType.SLASH, 52.5);
		Damage C = new Damage(DamageType.IMPACT, 140);
		ArrayList<Damage> D = new ArrayList<Damage>();
		D.add(A);
		D.add(B);
		D.add(C);
	    Vectis_P = new Firearm("Vectis Prime", D, 13.3, "400-600", 2.67, 2, true, 1, 1, 1,
				TriggerType.SEMI_AUTOMATIC, true);
	}
	
	@Test
	public void CalculateDatDamage() throws MissingMaterialTypeException {
		double tempD = Vectis_P.calculateDamage(MaterialType.CLONED_FLESH, MaterialType.ALLOY, 200);
		System.out.println(tempD);
	}
}