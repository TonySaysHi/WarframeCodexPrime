package tests;

import org.junit.Before;
import org.junit.Test;

import enemyData.MaterialType;
import exceptions.MissingMaterialTypeException;
import weaponData.Damage;
import weaponData.DamageType;

public class DamageSimulationTest {
	private Damage impactHit, punctureHit, slashHit, coldHit, electricHit, heatHit, toxinHit, blastHit, corrosiveHit,
			gasHit, magneticHit, radiationHit, viralHit, trueHit, voidHit;

	Damage[] damageArray = { impactHit, punctureHit, slashHit, coldHit, electricHit, heatHit, toxinHit, blastHit,
			corrosiveHit, gasHit, magneticHit, radiationHit, viralHit, trueHit, voidHit };

	@Before
	public void damageInit() {
		for (DamageType type : DamageType.values()) {
			damageArray[type.ordinal()] = new Damage(type, 100);
		}
	}

	@Test
	public void unarmoredTests() {
		MaterialType unarmored = null;
		try {
			for (MaterialType type : MaterialType.values()) {
				System.out.println(type.name());
				for (int i = 0; i < damageArray.length; i++) {
					System.out.print(damageArray[i].damageSimulation(type, unarmored, 0) + " ");
				}
				System.out.println("\n-----------");
			}
		} catch (MissingMaterialTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
