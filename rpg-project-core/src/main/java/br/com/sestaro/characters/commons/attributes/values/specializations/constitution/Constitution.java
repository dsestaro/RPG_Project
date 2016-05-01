package br.com.sestaro.characters.commons.attributes.values.specializations.constitution;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Toughness;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Resistance;

public class Constitution {
	private Toughness health;
	private Resistance resistance;
	
	public Constitution(int health, int coordination) {
		this.health = new Toughness(health);
		this.resistance = new Resistance(coordination);

		AttributesUtils.initialValidations(this.health, this.resistance);
	}
	
	public int getConstitution() {
		return (health.getValue() + resistance.getValue()) / 2;
	}

	public void addToughness(int value) {
		this.health.setValue(health.getValue() + value);
	}
	
	public void addResistance(int value) {
		this.resistance.setValue(resistance.getValue() + value);
	}

	public int getToughness() {
		return health.getValue();
	}

	public int getResistance() {
		return resistance.getValue();
	}
}
