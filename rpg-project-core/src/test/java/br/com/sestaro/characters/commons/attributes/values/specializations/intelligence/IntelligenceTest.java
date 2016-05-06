package br.com.sestaro.characters.commons.attributes.values.specializations.intelligence;

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
 * Class to test {@link Intelligence}.
 * 
 * @author davidson.sestaro
 */
public class IntelligenceTest {
  /**
   * Validate initial configuration.
   */
  @Test
  public final void initializationTest() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    assertEquals(FIFTEEN, intelligence.getIntelligence());
    assertEquals(SIXTEEN, intelligence.getKnowledge());
    assertEquals(FOURTEEN, intelligence.getLogic());
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testNegativePhysicalIntelligenceValue() {
    new Intelligence(NEGATIVE, POSITIVE);
  }
  
  /**
   * Validate negative input.
   */
  @Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeEnduranceValue() {
    new Intelligence(POSITIVE, NEGATIVE);
  }
  
  /**
   * Add a value to the physical Intelligence.
   */
  @Test
  public final void addPhysicalIntelligenceTest() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addKnowledge(POSITIVE);
    
    assertEquals(EIGHTEEN, intelligence.getKnowledge());
  }
  
  /**
   * Remove a value to the physical Intelligence.
   */
  @Test
  public final void removePhysicalIntelligenceTest() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addKnowledge(NEGATIVE);
    
    assertEquals(FOURTEEN, intelligence.getKnowledge());
  }
  
  /**
   * Add a value to the endurance.
   */
  @Test
  public final void addEnduranceTest() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addLogic(POSITIVE);
    
    assertEquals(SIXTEEN, intelligence.getLogic());
  }
  
  /**
   * Remove a value to the physical Intelligence.
   */
  @Test
  public final void removeEnduranceTest() {
    Intelligence intelligence = new Intelligence(SIXTEEN, FOURTEEN);
    
    intelligence.addLogic(NEGATIVE);
    
    assertEquals(TWELVE, intelligence.getLogic());
  }
  
  /**
   * Test attribute name.
   */
  @Test
  public final void testName() {
    assertEquals("INT", Intelligence.getName());
  }
}
