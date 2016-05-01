package br.com.sestaro.characters.commons.attributes.values.specializations.constitution;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Toughness;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Resistance;

public class Constitution {
	private Toughness toughness;
	private Resistance resistance;
	
	public Constitution(int toughness, int coordination) {
		this.toughness = new Toughness(toughness);
		this.resistance = new Resistance(coordination);

		AttributesUtils.initialValidations(this.toughness, this.resistance);
	}
	
	public int getConstitution() {
		return (toughness.getValue() + resistance.getValue()) / 2;
	}

	public void addToughness(int value) {
		this.toughness.setValue(toughness.getValue() + value);
	}
	
	public void addResistance(int value) {
		this.resistance.setValue(resistance.getValue() + value);
	}

	public int getToughness() {
		return toughness.getValue();
	}

	public int getResistance() {
		return resistance.getValue();
	}
}
