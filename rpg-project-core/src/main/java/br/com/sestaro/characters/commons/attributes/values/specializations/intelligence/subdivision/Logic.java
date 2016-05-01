package br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class Logic implements Specialization {

	private int logic;
	private final String NAME = "Logic";
	
	public Logic(int logic) {
		setValue(logic);
	}
	
	public int getValue() {
		return this.logic;
	}

	public void setValue(int logic) {
		AttributesUtils.validateAttributeValue(logic);
		this.logic = logic;
	}

	public String getName() {
		return this.NAME;
	}
}
