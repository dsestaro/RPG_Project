package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class Coordination implements Specialization {

	private int coordination;
	public static final String NAME = "Coordination";
	
	public Coordination(int coordination) {
		setValue(coordination);
	}
	
	public int getValue() {
		return this.coordination;
	}

	public void setValue(int coordination) {
		AttributesUtils.validateAttributeValue(coordination);
		this.coordination = coordination;
	}
}
