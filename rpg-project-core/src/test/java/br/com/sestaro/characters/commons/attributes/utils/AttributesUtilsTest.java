package br.com.sestaro.characters.commons.attributes.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Speed;

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
		Specialization spec1 = new Speed(12);
		Specialization spec2 = new Speed(17);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
	
	@Test(expected=InvalidAttributeValueException.class)
	public void initialValidationsGreaterThan4Test2() {
		Specialization spec1 = new Speed(17);
		Specialization spec2 = new Speed(12);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
	
	@Test(expected=InvalidAttributeValueException.class)
	public void initialValidationsGreaterThan18Test() {
		Specialization spec1 = new Speed(14);
		Specialization spec2 = new Speed(19);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
	
	@Test
	public void initialValidationsTest() {
		Specialization spec1 = new Speed(14);
		Specialization spec2 = new Speed(16);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
}
