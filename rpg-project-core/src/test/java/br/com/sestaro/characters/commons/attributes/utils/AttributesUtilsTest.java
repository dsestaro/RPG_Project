package br.com.sestaro.characters.commons.attributes.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeValueException;
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
	
	@Test(expected=InvalidAttributeValueException.class)
	public void initialValidationsGreaterThan4Test() {
		AttributesUtils.initialValidations(12, 17, "TESTE", "TESTE");
	}
	
	@Test(expected=InvalidAttributeValueException.class)
	public void initialValidationsGreaterThan4Test2() {
		AttributesUtils.initialValidations(17, 12, "TESTE", "TESTE");
	}
	
	@Test(expected=InvalidAttributeValueException.class)
	public void initialValidationsGreaterThan18Test() {
		AttributesUtils.initialValidations(14, 19, "TESTE", "TESTE");
	}
	
	@Test
	public void initialValidationsTest() {
		AttributesUtils.initialValidations(14, 16, "TESTE", "TESTE");
	}
}
