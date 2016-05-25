package br.com.sestaro.characters.commons.attributes.model.facade;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 * Class to test {@link AttributesFacade}.
 * 
 * @author davidson.sestaro
 */
public class AttributesFacadeTests {

  private static final boolean EXIST = true;
  
  /**
   * Test should validate if all names are being returned by the function.
   */
  @Test
  public final void testShouldValidateAttributesNames() {
    List<String> names = AttributesFacade.getAttributesNames();
    
    assertEquals(EXIST, names.contains("STR"));
    assertEquals(EXIST, names.contains("DEX"));
    assertEquals(EXIST, names.contains("CON"));
    assertEquals(EXIST, names.contains("INT"));
    assertEquals(EXIST, names.contains("WIS"));
    assertEquals(EXIST, names.contains("CHA"));
  }
}
