package enemyData;

import java.util.ArrayList;

import weaponData.DamageType;

public enum MaterialType {
	CLONED_FLESH(new double[] {-.25f,0,.25f,0,0,.25f,0,0,0,-.5f,0,0,.75f,0,-.5f}),
	FERRITE(new double[] {0,.5f,-.15f,0,0,0,.25f,-.25f,.75f,0,0,0,0,0,0}),
	ALLOY(new double[] {0,.15f,-.5f,.25f,-.5f,0,0,0,0,0,-0.5f,.75f,0,0,0}),
	MACHINERY(new double[] {.25f,0,0,0,.5f,0,-.25f,.75f,0,0,0,0,-.25f,0,-.5f}),
	FLESH(new double[] {-.25f,0,.25f,0,0,0,.50f,0,0,.25f,0,0,.5f,0,0}),
	SHIELD(new double[] {.5f,-.2f,0,.5f,0,0,0,0,0,0,.75f,-.25f,0,0,0}),
	PROTO_SHIELD(new double[] {.15f,-.5f,0,0,0,-.5f,0,0,-.5f,0,.75f,0,0,0,0}),
	ROBOTIC(new double[] {0,.25f,-.25f,0,.5f,0,-.25f,0,0,0,0,.25f,0,0,0}),
	INFESTED(new double[] {0,0,.25f,0,0,.25f,0,0,0,.75f,0,-.5f,-.5f,0,0}),
	INFESTED_FLESH(new double[] {0,0,.5f,-.5f,0,.5f,0,0,0,.5f,0,0,0,0,0}),
	FOSSILIZED(new double[] {0,0,.15f,-.25f,0,0,-.5f,.5f,.75f,0,0,-.75f,0,0,-.5f}),
	SINEW(new double[] {0,.25f,0,0.25f,0,0,0,-.5f,0,0,0,.5f,0,0,0});
	
	
	/**
	 * Damage types, in order: Impact,Puncture,Slash,Cold,Electric,Heat,Toxin,Blast,Corrosive,Gas,Magnetic,Radiation,Viral,True,Void
	 */
	double[] dmgMultiplier;
	
	MaterialType(double[] multipliers){
		dmgMultiplier = multipliers;
	}
	
	public double getDmgMultiplier(DamageType type){
		return dmgMultiplier[type.ordinal()];
	}
	
	public double[] getDmgMultiplier() {
		return dmgMultiplier;
	}
	
}
