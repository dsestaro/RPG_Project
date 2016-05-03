package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity;

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
		Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);
		
		assertEquals(FIFTEEN, dexterity.getDexterity());
		assertEquals(SIXTEEN, dexterity.getSpeed());
		assertEquals(FOURTEEN, dexterity.getCoordination());
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeSpeedValue() {
		new Dexterity(NEGATIVE, POSITIVE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeCoordinationValue() {
		new Dexterity(POSITIVE, NEGATIVE);
	}
	
	/**
   * Add a value to the speed.
   */
	@Test
  public final void addSpeedTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);
		
		dexterity.addSpeed(POSITIVE);
		
		assertEquals(EIGHTEEN, dexterity.getSpeed());
	}
	
	/**
   * Remove a value to the speed.
   */
	@Test
  public final void removeSpeedTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN, SIXTEEN);
		
		dexterity.addSpeed(NEGATIVE);
		
		assertEquals(FOURTEEN, dexterity.getSpeed());
	}
	
	/**
   * Add a value to the coordination.
   */
	@Test
  public final void addCoordinationTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);
		
		dexterity.addCoordination(POSITIVE);
		
		assertEquals(SIXTEEN, dexterity.getCoordination());
	}
	
	/**
   * Remove a value to the coordination.
   */
	@Test
  public final void removeCoordinationTest() {
		Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);
		
		dexterity.addCoordination(NEGATIVE);
		
		assertEquals(TWELVE, dexterity.getCoordination());
	}
}
