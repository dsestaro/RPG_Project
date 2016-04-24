package br.com.sestaro.characters.commons.attributes.utils;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;

public class AttributesUtils {

	public static void validateAttributeValue(int value) {
		if(value < 0) {
			throw new NegativeAttributeValueException();
		}
	}
	
	public static int calculateModifier(int value) {
		return (value - 10) / 2;
	}
}
