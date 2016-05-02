package br.com.sestaro.characters.commons.attributes.values.specializations.constitution;

import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.EIGHTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FOURTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.NEGATIVE_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.POSITIVE_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIXTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.THIRTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.TWELVE_VALUE;
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
		Constitution constitution = new Constitution(TWELVE_VALUE, FOURTEEN_VALUE);
		
		assertEquals(THIRTEEN_VALUE, constitution.getConstitution());
		assertEquals(TWELVE_VALUE, constitution.getToughness());
		assertEquals(FOURTEEN_VALUE, constitution.getResistance());
	}
	
	/**
	 * Validate negative input.
	 */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeToughnessValue() {
		new Constitution(NEGATIVE_VALUE, POSITIVE_VALUE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeResistanceValue() {
		new Constitution(POSITIVE_VALUE, NEGATIVE_VALUE);
	}
	
	/**
	 * Add a value to the toughness.
	 */
	@Test
  public final void addToughnessTest() {
		Constitution constitution = new Constitution(SIXTEEN_VALUE, SIXTEEN_VALUE);
		
		constitution.addToughness(POSITIVE_VALUE);
		
		assertEquals(EIGHTEEN_VALUE, constitution.getToughness());
	}
	
	/**
   * Remove a value to the toughness.
   */
	@Test
  public final void removeToughnessTest() {
		Constitution constitution = new Constitution(SIXTEEN_VALUE, SIXTEEN_VALUE);
		
		constitution.addToughness(NEGATIVE_VALUE);
		
		assertEquals(FOURTEEN_VALUE, constitution.getToughness());
	}
	
	/**
   * Add a value to the resistance.
   */
	@Test
  public final void addResistanceTest() {
		Constitution constitution = new Constitution(SIXTEEN_VALUE, FOURTEEN_VALUE);
		
		constitution.addResistance(POSITIVE_VALUE);
		
		assertEquals(SIXTEEN_VALUE, constitution.getResistance());
	}
	
	/**
   * Remove a value to the resistance.
   */
	@Test
  public final void removeEnduranceTest() {
		Constitution constitution = new Constitution(SIXTEEN_VALUE, FOURTEEN_VALUE);
		
		constitution.addResistance(NEGATIVE_VALUE);
		
		assertEquals(TWELVE_VALUE, constitution.getResistance());
	}
}
