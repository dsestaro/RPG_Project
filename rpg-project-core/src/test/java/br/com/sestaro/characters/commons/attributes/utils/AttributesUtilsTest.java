package br.com.sestaro.characters.commons.attributes.utils;

import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.EIGHTEEN_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.EIGHTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FIVE_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FIVE_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FOURTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.NINETEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SEVENTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIXTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.TWELVE_VALUE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Speed;

/**
 * Class to test {@link AttributesUtils}.
 * 
 * @author davidson.sestaro
 */
public class AttributesUtilsTest {
  
  /**
   * Validate attributes with null value.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void validateAttributeTest() {
		AttributesUtils.validateAttributeValue(-1);
	}
	
	/**
	 * Validate positive modifier calc.
	 */
	@Test
  public final void calculateModifierPositiveTest() {
		assertEquals(EIGHTEEN_MODIFIER, AttributesUtils.calculateModifier(EIGHTEEN_VALUE));
	}
	
	/**
   * Validate negative modifier calc.
   */
	@Test
  public final void calculateModifierNegativeTest() {
		assertEquals(FIVE_MODIFIER, AttributesUtils.calculateModifier(FIVE_VALUE));
	}
	
	/**
   * Validate difference between attributes.
   */
	@Test(expected = InvalidAttributeValueException.class)
  public final void initialValidationsGreaterThan4Test() {
		Specialization spec1 = new Speed(TWELVE_VALUE);
		Specialization spec2 = new Speed(SEVENTEEN_VALUE);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
	
	/**
   * Validate difference between attributes.
   */
	@Test(expected = InvalidAttributeValueException.class)
  public final void initialValidationsGreaterThan4Test2() {
		Specialization spec1 = new Speed(SEVENTEEN_VALUE);
		Specialization spec2 = new Speed(TWELVE_VALUE);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
	
	/**
   * Validate difference between attributes with an attribute greater then 18.
   */
	@Test(expected = InvalidAttributeValueException.class)
  public final void initialValidationsGreaterThan18Test() {
		Specialization spec1 = new Speed(NINETEEN_VALUE);
		Specialization spec2 = new Speed(FOURTEEN_VALUE);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
	
	/**
   * Validate difference between attributes with an attribute greater then 18.
   */
	@Test(expected = InvalidAttributeValueException.class)
  public final void initialValidationsGreaterThan18Test2() {
		Specialization spec1 = new Speed(FOURTEEN_VALUE);
		Specialization spec2 = new Speed(NINETEEN_VALUE);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
	
	/**
	 * Validate difference between attributes with an attribute greater then 18.
	 */
	@Test
	public final void initialValidationsGreaterThan18Test3() {
	  Specialization spec1 = new Speed(NINETEEN_VALUE);
	  Specialization spec2 = new Speed(NINETEEN_VALUE);
	  
	  AttributesUtils.initialValidations(spec1, spec2);
	}
	
	/**
   * Validate initial configuration.
   */
	@Test
  public final void initialValidationsTest() {
		Specialization spec1 = new Speed(FOURTEEN_VALUE);
		Specialization spec2 = new Speed(SIXTEEN_VALUE);
		
		AttributesUtils.initialValidations(spec1, spec2);
	}
}
