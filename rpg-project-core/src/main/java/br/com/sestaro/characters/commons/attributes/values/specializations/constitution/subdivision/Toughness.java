package br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class Toughness implements Specialization{

	private int health;
	private final String NAME = "Toughness";
	
	public Toughness(int health) {
		setValue(health);
	}
	
	public int getValue() {
		return this.health;
	}

	public void setValue(int health) {
		AttributesUtils.validateAttributeValue(health);
		this.health = health;
	}

	public String getName() {
		return this.NAME;
	}
}
