package br.com.sestaro.characters.commons.attributes.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Class to test {@link AttributesNames}.
 * 
 * @author davidson.sestaro
 */
public class AttributesNamesTest {
	
  private static final int STRENGTH_POSITION = 10;
  private static final int STRENGTH_PHYSICAL_STRENGTH_POSITION = 11;
  private static final int STRENGTH_ENDURANCE_STRENGTH_POSITION = 12;
  private static final int DEXTERITY_POSITION = 20;
  private static final int DEXTERITY_SPEED_POSITION = 21;
  private static final int DEXTERITY_COORDINATION_POSITION = 22;
  private static final int CONSTITUTION_POSITION = 30;
  private static final int CONSTITUTION_TOUGHNESS_POSITION = 31;
  private static final int CONSTITUTION_RESISTANCE_POSITION = 32;
  private static final int INTELLIGENCE_POSITION = 4;
  private static final int WISDOM_POSITION = 5;
  private static final int CHARISMA_POSITION = 6;
  
  /**
   * Test enum position.
   */
	@Test
  public final void enumTest() {
		assertEquals(STRENGTH_POSITION, AttributesNames.STRENGTH.getPosition());
		assertEquals(STRENGTH_PHYSICAL_STRENGTH_POSITION, AttributesNames.STRENGTH_PHYSICALSTRENGTH.getPosition());
		assertEquals(STRENGTH_ENDURANCE_STRENGTH_POSITION, AttributesNames.STRENGTH_ENDURANCE.getPosition());
		assertEquals(DEXTERITY_POSITION, AttributesNames.DEXTERITY.getPosition());
		assertEquals(DEXTERITY_SPEED_POSITION, AttributesNames.DEXTERITY_SPEED.getPosition());
		assertEquals(DEXTERITY_COORDINATION_POSITION, AttributesNames.DEXTERITY_COORDINATION.getPosition());
		assertEquals(CONSTITUTION_POSITION, AttributesNames.CONSTITUTION.getPosition());
		assertEquals(CONSTITUTION_TOUGHNESS_POSITION, AttributesNames.CONSTITUTION_TOUGHNESS.getPosition());
		assertEquals(CONSTITUTION_RESISTANCE_POSITION, AttributesNames.CONSTITUTION_RESISTANCE.getPosition());
		assertEquals(INTELLIGENCE_POSITION, AttributesNames.INTELLIGENCE.getPosition());
		assertEquals(WISDOM_POSITION, AttributesNames.WISDOM.getPosition());
		assertEquals(CHARISMA_POSITION, AttributesNames.CHARISMA.getPosition());
	}
}
