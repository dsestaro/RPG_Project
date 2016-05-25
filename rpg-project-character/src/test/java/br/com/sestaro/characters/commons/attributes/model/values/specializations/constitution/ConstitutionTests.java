package br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution;

import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.NEGATIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.model.exceptions.NegativeAttributeValueException;

/**
 * Class to test {@link Constitution}.
 * 
 * @author davidson.sestaro
 */
public class ConstitutionTests {

  /**
   * Validate initial configuration.
   */
	@Test
  public final void testShouldValidateInitialSpecializationValues() {
		Constitution constitution = new Constitution(TWELVE, FOURTEEN);
		
		assertEquals(THIRTEEN, constitution.getConstitution());
		assertEquals(TWELVE, constitution.getToughness());
		assertEquals(FOURTEEN, constitution.getResistance());
	}
	
	/**
	 * Validate negative input.
	 */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathOne() {
		new Constitution(NEGATIVE, POSITIVE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathTwo() {
		new Constitution(POSITIVE, NEGATIVE);
	}
	
	/**
	 * Add a value to the toughness.
	 */
	@Test
  public final void testShouldValidateSumOfValueToTheAppearanceToughness() {
		Constitution constitution = new Constitution(SIXTEEN, SIXTEEN);
		
		constitution.addToughness(POSITIVE);
		
		assertEquals(EIGHTEEN, constitution.getToughness());
	}
	
	/**
   * Remove a value to the toughness.
   */
	@Test
  public final void testShouldValidateSubtractionOfValueToTheAppearanceToughness() {
		Constitution constitution = new Constitution(SIXTEEN, SIXTEEN);
		
		constitution.addToughness(NEGATIVE);
		
		assertEquals(FOURTEEN, constitution.getToughness());
	}
	
	/**
   * Add a value to the resistance.
   */
	@Test
  public final void testShouldValidateSumOfValueToTheResistance() {
		Constitution constitution = new Constitution(SIXTEEN, FOURTEEN);
		
		constitution.addResistance(POSITIVE);
		
		assertEquals(SIXTEEN, constitution.getResistance());
	}
	
	/**
   * Remove a value to the resistance.
   */
	@Test
  public final void testShouldValidateSubtractionOfValueToTheResistance() {
		Constitution constitution = new Constitution(SIXTEEN, FOURTEEN);
		
		constitution.addResistance(NEGATIVE);
		
		assertEquals(TWELVE, constitution.getResistance());
	}
	
	/**
   * Test attribute name.
   */
  @Test
	public final void testShouldValidateClassName() {
	  assertEquals("CON", Constitution.getName());
	}
}
