package WarframeData;

import java.util.ArrayList;

import AbilityData.Ability;

public class Warframe {
private double health;
private double shield;
private double energy;
private double armor;
private double sprint_speed;
private double duration;
private double efficiency;
private double range;
private double strenght;
private ArrayList<Ability> abilityList ;

public void UpdateAbilities() {
	for (Ability e : abilityList) {
		e.UpdateAllModifiers("range", range);
		e.UpdateAllModifiers("efficiency", efficiency);
		e.UpdateAllModifiers("strenght", strenght);
		e.UpdateAllModifiers("duration", duration);
	}
}
}
