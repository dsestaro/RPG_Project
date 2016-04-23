package main.java.br.com.sestaro.characters.attributes.utils;

import main.java.br.com.sestaro.characters.attributes.exceptions.NegativeAttributeValueException;

public class AttributesUtils {

	public static void validateAttributeValue(int value) {
		if(value < 0) {
			throw new NegativeAttributeValueException();
		}
	}
}
