package weaponData;

public enum DamageType {

	IMPACT(StatusEffect.STAGGER,"Impact"),
	PUNCTURE(StatusEffect.DAMAGE_MINUS, "Puncture"),
	SLASH(StatusEffect.BLEED, "Slash"),
	COLD(StatusEffect.SLOWDOWN, "Cold"),
	ELECTRIC(StatusEffect.STUN, "Electric"),
	HEAT(StatusEffect.BURN, "Heat"),
	TOXIN(StatusEffect.POISON, "Toxin"),
	BLAST(StatusEffect.KNOCKDOWN,"Blast"),
	CORROSIVE(StatusEffect.ARMOR_MINUS, "Corrosive"),
	GAS(StatusEffect.TOXIN_CLOUD, "Gas"),
	MAGNETIC(StatusEffect.SHIELD_MINUS, "Magnetic"),
	RADIATION(StatusEffect.FRIENDLY_FIRE, "Radiation"),
	VIRAL(StatusEffect.HEALTH_MINUS, "Viral"),
	TRUE(null, "True Damage"),
	VOID(StatusEffect.BULLET_ATTRACT, "Void");
	
	private StatusEffect status;
	private String nom;
	
	DamageType(StatusEffect status, String nom) {
		this.status = status;
		this.nom = nom;
	}

	public StatusEffect getStatus() {
		return status;
	}

	public void setStatus(StatusEffect status) {
		this.status = status;
	}
	
	
}
