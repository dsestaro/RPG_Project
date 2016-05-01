package br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class Knowledge implements Specialization {

	private int knowledge;
	private final String NAME = "Knowledge";
	
	public Knowledge(int knowledge) {
		setValue(knowledge);
	}
	
	public int getValue() {
		return this.knowledge;
	}

	public void setValue(int knowledge) {
		AttributesUtils.validateAttributeValue(knowledge);
		this.knowledge = knowledge;
	}

	public String getName() {
		return this.NAME;
	}
}