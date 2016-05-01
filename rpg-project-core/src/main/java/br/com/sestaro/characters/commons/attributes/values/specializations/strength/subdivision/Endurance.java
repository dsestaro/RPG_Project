package br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class Endurance implements Specialization {

	private int endurance;
	private final String NAME = "Endurance";
	
	public Endurance(int endurance) {
		setValue(endurance);
	}

	public int getValue() {
		return this.endurance;
	}

	public void setValue(int endurance) {
		AttributesUtils.validateAttributeValue(endurance);
		this.endurance = endurance;
	}
	
	public String getName() {
		return this.NAME;
	}
}
