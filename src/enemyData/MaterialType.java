package enemyData;

import java.util.ArrayList;

import weaponData.DamageType;

public enum MaterialType {
	CLONED_FLESH(new float[] {0.75f,1,1.25f,1,1,1.25f,1,1,1,0.5f,1,1,1.75f,1,0.5f}),
	FERRITE(new float[] {1,1.5f,0.85f,1,1,1,1.25f,0.75f,1.75f,1,1,1,1,1,1}),
	ALLOY(new float[] {1,1.15f,0.5f,1.25f,0.5f,1,1,1,1,1,0.5f,1.75f,1,1,1}),
	MACHINERY(new float[] {1.25f,1,1,1,0.5f,1,0.75f,1.75f,1,1,1,1,0.75f,1,0.5f}),
	FLESH(new float[] {0.75f,1,1.25f,1,1,1,1.50f,1,1,0.75f,1,1,1.5f,1,1}),
	SHIELD(new float[] {1.5f,0.8f,1,1.5f,1,1,0,1,1,1,1.75f,0.75f,1,1,1}),
	PROTO_SHIELD(new float[] {1.15f,0.5f,1,1,1,0.5f,0,1,0.5f,1,1.75f,1,1,1,1}),
	ROBOTIC(new float[] {1,1.25f,0.75f,1,1.5f,1,0.75f,1,1,1,1,1.25f,1,1,1}),
	INFESTED(new float[] {1,1,1.25f,1,1,1.25f,1,1,1,1.75f,1,0.5f,0.5f,1,1}),
	INFESTED_FLESH(new float[] {1,1,1.5f,0.5f,1,1.5f,1,1,1,1.5f,1,1,1,1,1}),
	FOSSILIZED(new float[] {1,1,1.15f,0.75f,1,1,0.5f,1.5f,1.75f,1,1,0.25f,1,1,0.5f}),
	SINEW(new float[] {1,1.25f,1,1.25f,1,1,1,0.5f,1,1,1,1.5f,1,1,1});
	
	
	/**
	 * Damage types, in order: Impact,Puncture,Slash,Cold,Electric,Heat,Toxin,Blast,Corrosive,Gas,Magnetic,Radiation,Viral,True,Void
	 */
	float[] dmgMultiplier;
	
	MaterialType(float[] multipliers){
		dmgMultiplier = multipliers;
	}
	
	public float getDmgMultiplier(DamageType type){
		return dmgMultiplier[type.ordinal()];
	}
	
	public float[] getDmgMultiplier() {
		return dmgMultiplier;
	}
	
}
