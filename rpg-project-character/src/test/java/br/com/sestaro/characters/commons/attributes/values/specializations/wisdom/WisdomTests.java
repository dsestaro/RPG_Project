package br.com.sestaro.characters.commons.attributes.values.specializations.wisdom;

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
 * Class to test {@link Wisdom}.
 * 
 * @author davidson.sestaro
 */
public class WisdomTests {
  
  /**
   * Validate initial configuration.
   */
  @Test
  public final void testShouldValidateInitialSpecializationValues() {
    Wisdom strength = new Wisdom(SIXTEEN, FOURTEEN);
    
    assertEquals(FIFTEEN, strength.getWisdom());
    assertEquals(SIXTEEN, strength.getInstinct());
    assertEquals(FOURTEEN, strength.getIntuition());
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathOne() {
    new Wisdom(NEGATIVE, POSITIVE);
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathTwo() {
    new Wisdom(POSITIVE, NEGATIVE);
  }
  
  /**
   * Add a value to the instinct.
   */
  @Test
  public final void testShouldValidateSumOfValueToTheInstinct() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addInstinct(POSITIVE);
    
    assertEquals(EIGHTEEN, wisdom.getInstinct());
  }
  
  /**
   * Remove a value to the instinct.
   */
  @Test
  public final void testShouldValidateSubtractionOfValueToTheInstinct() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addInstinct(NEGATIVE);
    
    assertEquals(FOURTEEN, wisdom.getInstinct());
  }
  
  /**
   * Add a value to the intuition.
   */
  @Test
  public final void testShouldValidateSumOfValueToTheIntuition() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addIntuition(POSITIVE);
    
    assertEquals(SIXTEEN, wisdom.getIntuition());
  }
  
  /**
   * Remove a value to the intuition.
   */
  @Test
  public final void testShouldValidateSubtractionOfValueToTheIntuition() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addIntuition(NEGATIVE);
    
    assertEquals(TWELVE, wisdom.getIntuition());
  }
  
  /**
   * Test attribute name.
   */
  @Test
  public final void testShouldValidateClassName() {
    assertEquals("WIS", Wisdom.getName());
  }
}
