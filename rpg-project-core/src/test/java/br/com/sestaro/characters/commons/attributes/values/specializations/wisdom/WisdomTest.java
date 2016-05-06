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
public class WisdomTest {
  
  /**
   * Validate initial configuration.
   */
  @Test
  public final void initializationTest() {
    Wisdom strength = new Wisdom(SIXTEEN, FOURTEEN);
    
    assertEquals(FIFTEEN, strength.getWisdom());
    assertEquals(SIXTEEN, strength.getInstinct());
    assertEquals(FOURTEEN, strength.getIntuition());
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeInstinctValue() {
    new Wisdom(NEGATIVE, POSITIVE);
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeIntuitionValue() {
    new Wisdom(POSITIVE, NEGATIVE);
  }
  
  /**
   * Add a value to the instinct.
   */
  @Test
  public final void addInstinctTest() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addInstinct(POSITIVE);
    
    assertEquals(EIGHTEEN, wisdom.getInstinct());
  }
  
  /**
   * Remove a value to the instinct.
   */
  @Test
  public final void removeInstinctTest() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addInstinct(NEGATIVE);
    
    assertEquals(FOURTEEN, wisdom.getInstinct());
  }
  
  /**
   * Add a value to the intuition.
   */
  @Test
  public final void addIntuitionTest() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addIntuition(POSITIVE);
    
    assertEquals(SIXTEEN, wisdom.getIntuition());
  }
  
  /**
   * Remove a value to the intuition.
   */
  @Test
  public final void removeIntuitionTest() {
    Wisdom wisdom = new Wisdom(SIXTEEN, FOURTEEN);
    
    wisdom.addIntuition(NEGATIVE);
    
    assertEquals(TWELVE, wisdom.getIntuition());
  }
}
