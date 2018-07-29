package weaponData;

public enum DamageType {
	SLASH(StatusEffect.BLEED),
	PUNCTURE(StatusEffect.DAMAGE_MINUS),
	IMPACT(StatusEffect.STAGGER),
	HEAT(StatusEffect.BURN),
	COLD(StatusEffect.SLOWDOWN),
	ELECTRIC(StatusEffect.STUN),
	TOXIN(StatusEffect.POISON),
	BLAST(StatusEffect.KNOCKDOWN),
	RADIATION(StatusEffect.FRIENDLY_FIRE),
	GAS(StatusEffect.TOXIN_CLOUD),
	MAGNETIC(StatusEffect.SHIELD_MINUS),
	VIRAL(StatusEffect.HEALTH_MINUS),
	CORROSIVE(StatusEffect.ARMOR_MINUS),
	VOID(StatusEffect.BULLET_ATTRACT),
	TRUE(null);
	
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
