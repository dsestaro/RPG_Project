package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIXTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FOURTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FIFTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.EIGHTEEN_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.POSITIVE_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.NEGATIVE_VALUE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.TWELVE_VALUE;


import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;

/**
 * Class to test {@link Dexterity}.
 * 
 * @author davidson.sestaro
 */
public class DexterityTest {
  
  /**
   * Validate initial configuration.
   */
	@Test
  public final void initializationTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN_VALUE, FOURTEEN_VALUE);
		
		assertEquals(FIFTEEN_VALUE, dexterity.getDexterity());
		assertEquals(SIXTEEN_VALUE, dexterity.getSpeed());
		assertEquals(FOURTEEN_VALUE, dexterity.getCoordination());
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeSpeedValue() {
		new Dexterity(NEGATIVE_VALUE, POSITIVE_VALUE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeCoordinationValue() {
		new Dexterity(POSITIVE_VALUE, NEGATIVE_VALUE);
	}
	
	/**
   * Add a value to the speed.
   */
	@Test
  public final void addSpeedTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN_VALUE, FOURTEEN_VALUE);
		
		dexterity.addSpeed(POSITIVE_VALUE);
		
		assertEquals(EIGHTEEN_VALUE, dexterity.getSpeed());
	}
	
	/**
   * Remove a value to the speed.
   */
	@Test
  public final void removeSpeedTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN_VALUE, SIXTEEN_VALUE);
		
		dexterity.addSpeed(NEGATIVE_VALUE);
		
		assertEquals(FOURTEEN_VALUE, dexterity.getSpeed());
	}
	
	/**
   * Add a value to the coordination.
   */
	@Test
  public final void addCoordinationTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN_VALUE, FOURTEEN_VALUE);
		
		dexterity.addCoordination(POSITIVE_VALUE);
		
		assertEquals(SIXTEEN_VALUE, dexterity.getCoordination());
	}
	
	/**
   * Remove a value to the coordination.
   */
	@Test
  public final void removeCoordinationTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN_VALUE, FOURTEEN_VALUE);
		
		dexterity.addCoordination(NEGATIVE_VALUE);
		
		assertEquals(TWELVE_VALUE, dexterity.getCoordination());
	}
}
