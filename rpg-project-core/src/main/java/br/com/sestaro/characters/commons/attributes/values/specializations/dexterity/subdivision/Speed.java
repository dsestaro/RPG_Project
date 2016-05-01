package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class Speed implements Specialization {

	private int speed;
	private final String NAME = "Speed";
	
	public Speed(int speed) {
		setValue(speed);
	}
	
	public int getValue() {
		return this.speed;
	}

	public void setValue(int speed) {
		AttributesUtils.validateAttributeValue(speed);
		this.speed = speed;
	}
	
	public String getName() {
		return this.NAME;
	}
}
