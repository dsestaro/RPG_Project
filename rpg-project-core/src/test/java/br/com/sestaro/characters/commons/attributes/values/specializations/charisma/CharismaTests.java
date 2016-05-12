package br.com.sestaro.characters.commons.attributes.values.specializations.charisma;

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
 * Class to test {@link Charisma}.
 * 
 * @author davidson.sestaro
 */
public class CharismaTests {
  
  /**
   * Validate initial configuration.
   */
  @Test
  public final void testShouldValidateInitialSpecializationValues() {
    Charisma charisma = new Charisma(SIXTEEN, FOURTEEN);
    
    assertEquals(FIFTEEN, charisma.getCharisma());
    assertEquals(SIXTEEN, charisma.getAppearance());
    assertEquals(FOURTEEN, charisma.getCharm());
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathOne() {
    new Charisma(NEGATIVE, POSITIVE);
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathTwo() {
    new Charisma(POSITIVE, NEGATIVE);
  }
  
  /**
   * Add a value to the appearance.
   */
  @Test
  public final void testShouldValidateSumOfValueToTheAppearance() {
    Charisma charisma = new Charisma(SIXTEEN, FOURTEEN);
    
    charisma.addAppearance(POSITIVE);
    
    assertEquals(EIGHTEEN, charisma.getAppearance());
  }
  
  /**
   * Remove a value to the appearance.
   */
  @Test
  public final void testShouldValidateSubtractionOfValueToTheAppearance() {
    Charisma charisma = new Charisma(SIXTEEN, FOURTEEN);
    
    charisma.addAppearance(NEGATIVE);
    
    assertEquals(FOURTEEN, charisma.getAppearance());
  }
  
  /**
   * Add a value to the charm.
   */
  @Test
  public final void testShouldValidateSumOfValueToTheCharm() {
    Charisma charisma = new Charisma(SIXTEEN, FOURTEEN);
    
    charisma.addCharm(POSITIVE);
    
    assertEquals(SIXTEEN, charisma.getCharm());
  }
  
  /**
   * Remove a value to the charm.
   */
  @Test
  public final void testShouldValidateSubtractionOfValueToTheCharm() {
    Charisma charisma = new Charisma(SIXTEEN, FOURTEEN);
    
    charisma.addCharm(NEGATIVE);
    
    assertEquals(TWELVE, charisma.getCharm());
  }
  
  /**
   * Test attribute name.
   */
  @Test
  public final void testShouldValidateClassName() {
    assertEquals("CHA", Charisma.getName());
  }
}
