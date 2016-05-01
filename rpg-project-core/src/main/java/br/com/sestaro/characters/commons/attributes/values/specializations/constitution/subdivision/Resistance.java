package br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class Resistance implements Specialization{

	private int resistance;
	private final String NAME = "Resistance";
	
	public Resistance(int resistance) {
		setValue(resistance);
	}
	
	public int getValue() {
		return this.resistance;
	}

	public void setValue(int resistance) {
		AttributesUtils.validateAttributeValue(resistance);
		this.resistance = resistance;
	}

	public String getName() {
		return this.NAME;
	}
}
