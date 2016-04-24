package br.com.sestaro.characters.commons.attributes;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.AttributesValueHandler;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;

public class Attributes {
	private AttributesValues values;

	public Attributes(AttributesValues values) {
		if(values == null) {
			throw new NullAttributesException();
		}
		
		this.values = values;
	}

	public AttributesValues getValues() {
		return values;
	}
	
	public int getAttributeModifier (AttributesNames attributeName) {
		return AttributesUtils.calculateModifier(AttributesValueHandler.getAttributeByPosition(this.values, attributeName));
	}
	
	public void addAttributeValue (AttributesNames attributeName, int value) {
		AttributesValueHandler.addAttributeByPosition(this.values, attributeName, value);
	}
}
