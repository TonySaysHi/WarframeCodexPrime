package weaponData;

public enum DamageType {

	IMPACT(StatusEffect.STAGGER),
	PUNCTURE(StatusEffect.DAMAGE_MINUS),
	SLASH(StatusEffect.BLEED),
	COLD(StatusEffect.SLOWDOWN),
	ELECTRIC(StatusEffect.STUN),
	HEAT(StatusEffect.BURN),
	TOXIN(StatusEffect.POISON),
	BLAST(StatusEffect.KNOCKDOWN),
	CORROSIVE(StatusEffect.ARMOR_MINUS),
	GAS(StatusEffect.TOXIN_CLOUD),
	MAGNETIC(StatusEffect.SHIELD_MINUS),
	RADIATION(StatusEffect.FRIENDLY_FIRE),
	VIRAL(StatusEffect.HEALTH_MINUS),
	TRUE(null),
	VOID(StatusEffect.BULLET_ATTRACT);
	
	private StatusEffect status;
	
	DamageType(StatusEffect status) {
		this.status = status;
	}

	public StatusEffect getStatus() {
		return status;
	}

	public void setStatus(StatusEffect status) {
		this.status = status;
	}
	
	
}
