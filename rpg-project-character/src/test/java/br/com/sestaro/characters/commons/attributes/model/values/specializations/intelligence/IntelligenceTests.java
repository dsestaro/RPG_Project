package br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence;

import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.NEGATIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.model.exceptions.NegativeAttributeValueException;

/**
 * Class to test {@link Intelligence}.
 * 
 * @author davidson.sestaro
 */
public class IntelligenceTests {
  /**
   * Validate initial configuration.
   */
  @Test
  public final void testShouldValidateInitialSpecializationValues() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    assertEquals(FIFTEEN, intelligence.getIntelligence());
    assertEquals(SIXTEEN, intelligence.getKnowledge());
    assertEquals(FOURTEEN, intelligence.getLogic());
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathOne() {
    new Intelligence(NEGATIVE, POSITIVE);
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testShouldFailWhenValidatingNegativeValueSpecializationPathTwo() {
    new Intelligence(POSITIVE, NEGATIVE);
  }
  
  /**
   * Add a value to the physical Intelligence.
   */
  @Test
  public final void testShouldValidateSumOfValueToTheKnowledge() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addKnowledge(POSITIVE);
    
    assertEquals(EIGHTEEN, intelligence.getKnowledge());
  }
  
  /**
   * Remove a value to the physical Intelligence.
   */
  @Test
  public final void testShouldValidateSubtractionOfValueToTheKnowledge() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addKnowledge(NEGATIVE);
    
    assertEquals(FOURTEEN, intelligence.getKnowledge());
  }
  
  /**
   * Add a value to the endurance.
   */
  @Test
  public final void testShouldValidateSumOfValueToTheLogic() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addLogic(POSITIVE);
    
    assertEquals(SIXTEEN, intelligence.getLogic());
  }
  
  /**
   * Remove a value to the physical Intelligence.
   */
  @Test
  public final void testShouldValidateSubtractionOfValueToTheLogic() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addLogic(NEGATIVE);
    
    assertEquals(TWELVE, intelligence.getLogic());
  }
  
  /**
   * Test attribute name.
   */
  @Test
  public final void testShouldValidateClassName() {
    assertEquals("INT", Intelligence.getName());
  }
}
