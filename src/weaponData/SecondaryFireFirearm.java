package weaponData;

import java.util.ArrayList;

public class SecondaryFireFirearm extends Weapon{
	private double accuracy;
	private String falloff;
	private double fire_rate;
	private int magizine;
	private boolean noise;
	private double nbr_bullet;
	private double punch_through;
	private double reload;
	private TriggerType trigger;
	//PS = primary or secondary , true = primary  , false = secondary
	private boolean ps;
	private Firearm secondaryfire;
	
	public SecondaryFireFirearm(String name, ArrayList damage, double accuracy, String falloff, double fire_rate,
			int magizine, boolean noise, double nbr_bullet, double punch_through, double reload, TriggerType trigger,
			boolean ps, Firearm secondaryfire) {
		super(name, damage);
		this.accuracy = accuracy;
		this.falloff = falloff;
		this.fire_rate = fire_rate;
		this.magizine = magizine;
		this.noise = noise;
		this.nbr_bullet = nbr_bullet;
		this.punch_through = punch_through;
		this.reload = reload;
		this.trigger = trigger;
		this.ps = ps;
		this.secondaryfire = secondaryfire;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public String getFalloff() {
		return falloff;
	}

	public void setFalloff(String falloff) {
		this.falloff = falloff;
	}

	public double getFire_rate() {
		return fire_rate;
	}

	public void setFire_rate(double fire_rate) {
		this.fire_rate = fire_rate;
	}

	public int getMagizine() {
		return magizine;
	}

	public void setMagizine(int magizine) {
		this.magizine = magizine;
	}

	public boolean isNoise() {
		return noise;
	}

	public void setNoise(boolean noise) {
		this.noise = noise;
	}

	public double getNbr_bullet() {
		return nbr_bullet;
	}

	public void setNbr_bullet(double nbr_bullet) {
		this.nbr_bullet = nbr_bullet;
	}

	public double getPunch_through() {
		return punch_through;
	}

	public void setPunch_through(double punch_through) {
		this.punch_through = punch_through;
	}

	public double getReload() {
		return reload;
	}

	public void setReload(double reload) {
		this.reload = reload;
	}

	public TriggerType getTrigger() {
		return trigger;
	}

	public void setTrigger(TriggerType trigger) {
		this.trigger = trigger;
	}

	public boolean isPs() {
		return ps;
	}

	public void setPs(boolean ps) {
		this.ps = ps;
	}

	public Firearm getSecondaryfire() {
		return secondaryfire;
	}

	public void setSecondaryfire(Firearm secondaryfire) {
		this.secondaryfire = secondaryfire;
	}
	
	
}
