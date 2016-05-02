package br.com.sestaro.characters.commons.attributes.values.specializations.constitution;

import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.EIGHTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.NEGATIVE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;

/**
 * Class to test {@link Constitution}.
 * 
 * @author davidson.sestaro
 */
public class ConstitutionTest {

  /**
   * Validate initial configuration.
   */
	@Test
  public final void initializationTest() {
		Constitution constitution = new Constitution(TWELVE, FOURTEEN);
		
		assertEquals(THIRTEEN, constitution.getConstitution());
		assertEquals(TWELVE, constitution.getToughness());
		assertEquals(FOURTEEN, constitution.getResistance());
	}
	
	/**
	 * Validate negative input.
	 */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeToughnessValue() {
		new Constitution(NEGATIVE, POSITIVE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeResistanceValue() {
		new Constitution(POSITIVE, NEGATIVE);
	}
	
	/**
	 * Add a value to the toughness.
	 */
	@Test
  public final void addToughnessTest() {
		Constitution constitution = new Constitution(SIXTEEN, SIXTEEN);
		
		constitution.addToughness(POSITIVE);
		
		assertEquals(EIGHTEEN, constitution.getToughness());
	}
	
	/**
   * Remove a value to the toughness.
   */
	@Test
  public final void removeToughnessTest() {
		Constitution constitution = new Constitution(SIXTEEN, SIXTEEN);
		
		constitution.addToughness(NEGATIVE);
		
		assertEquals(FOURTEEN, constitution.getToughness());
	}
	
	/**
   * Add a value to the resistance.
   */
	@Test
  public final void addResistanceTest() {
		Constitution constitution = new Constitution(SIXTEEN, FOURTEEN);
		
		constitution.addResistance(POSITIVE);
		
		assertEquals(SIXTEEN, constitution.getResistance());
	}
	
	/**
   * Remove a value to the resistance.
   */
	@Test
  public final void removeEnduranceTest() {
		Constitution constitution = new Constitution(SIXTEEN, FOURTEEN);
		
		constitution.addResistance(NEGATIVE);
		
		assertEquals(TWELVE, constitution.getResistance());
	}
}
