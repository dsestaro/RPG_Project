package br.com.sestaro.characters.commons.attributes.values.specializations.strength;

import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.EIGHTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.NEGATIVE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;

/**
 * Class to test {@link Strength}.
 * 
 * @author davidson.sestaro
 */
public class StrengthTests {

  /**
   * Validate initial configuration.
   */
	@Test
  public final void testShouldValidateInitialSpecializationValues() {
		Strength strength = new Strength(SIXTEEN, FOURTEEN);
		
		assertEquals(FIFTEEN, strength.getStrength());
		assertEquals(SIXTEEN, strength.getPhysicalStrength());
		assertEquals(FOURTEEN, strength.getEndurance());
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathOne() {
		new Strength(NEGATIVE, POSITIVE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathTwo() {
		new Strength(POSITIVE, NEGATIVE);
	}
	
	/**
   * Add a value to the physical strength.
   */
	@Test
  public final void testShouldValidateSumOfValueToThePhysicalStrength() {
		Strength strength = new Strength(SIXTEEN, FOURTEEN);
		
		strength.addPhysicalStrength(POSITIVE);
		
		assertEquals(EIGHTEEN, strength.getPhysicalStrength());
	}
	
	/**
   * Remove a value to the physical strength.
   */
	@Test
  public final void testShouldValidateSubtractionOfValueToThePhysicalStrength() {
		Strength strength = new Strength(SIXTEEN, FOURTEEN);
		
		strength.addPhysicalStrength(NEGATIVE);
		
		assertEquals(FOURTEEN, strength.getPhysicalStrength());
	}
	
	/**
   * Add a value to the endurance.
   */
	@Test
  public final void testShouldValidateSumOfValueToTheEndurance() {
		Strength strength = new Strength(SIXTEEN, FOURTEEN);
		
		strength.addEndurance(POSITIVE);
		
		assertEquals(SIXTEEN, strength.getEndurance());
	}
	
	/**
   * Remove a value to the endurance.
   */
	@Test
  public final void testShouldValidateSubtractionOfValueToTheEndurance() {
		Strength strength = new Strength(SIXTEEN, FOURTEEN);
		
		strength.addEndurance(NEGATIVE);
		
		assertEquals(TWELVE, strength.getEndurance());
	}
	
	/**
   * Test attribute name.
   */
  @Test
  public final void testShouldValidateClassName() {
    assertEquals("STR", Strength.getName());
  }
}
