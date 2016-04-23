package main.java.br.com.sestaro.characters.commons.attributes;

import main.java.br.com.sestaro.characters.commons.attributes.exceptions.NullAttributesException;
import main.java.br.com.sestaro.characters.commons.attributes.values.AttributesValues;

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
}
