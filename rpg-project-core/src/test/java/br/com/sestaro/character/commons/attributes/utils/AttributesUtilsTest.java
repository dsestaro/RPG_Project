package test.java.br.com.sestaro.character.commons.attributes.utils;

import org.junit.Test;

import main.java.br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import main.java.br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class AttributesUtilsTest {

	@Test(expected=NegativeAttributeValueException.class)
	public void validateAttributeTest() {
		AttributesUtils.validateAttributeValue(-1);
	}
}
