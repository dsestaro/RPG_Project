package test.java.br.com.sestaro.character.attributes.utils;

import org.junit.Test;

import main.java.br.com.sestaro.characters.attributes.exceptions.NegativeAttributeValueException;
import main.java.br.com.sestaro.characters.attributes.utils.AttributesUtils;

public class AttributesUtilsTest {

	@Test(expected=NegativeAttributeValueException.class)
	public void validateAttributeTest() {
		AttributesUtils.validateAttributeValue(-1);
	}
}
