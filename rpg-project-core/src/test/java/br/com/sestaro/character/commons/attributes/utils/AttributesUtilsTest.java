package br.com.sestaro.character.commons.attributes.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class AttributesUtilsTest {

	@Test(expected=NegativeAttributeValueException.class)
	public void validateAttributeTest() {
		AttributesUtils.validateAttributeValue(-1);
	}
	
	@Test
	public void calculateModifierPositiveTest() {
		assertEquals(4, AttributesUtils.calculateModifier(18));
	}
	
	@Test
	public void calculateModifierNegativeTest() {
		assertEquals(-2, AttributesUtils.calculateModifier(5));
	}
}
