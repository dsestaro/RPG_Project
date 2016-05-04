package br.com.sestaro.characters.commons.attributes.enums;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.STRENGTH_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.STRENGTH_PHYSICAL_STRENGTH_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.STRENGTH_ENDURANCE_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.DEXTERITY_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.DEXTERITY_SPEED_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.DEXTERITY_COORDINATION_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.CONSTITUTION_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.CONSTITUTION_TOUGHNESS_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.CONSTITUTION_RESISTANCE_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.INTELLIGENCE_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.INTELLIGENCE_KNOWLEDGE_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.INTELLIGENCE_LOGIC_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.WISDOM_POSITION;
import static br.com.sestaro.characters.commons.attributes.enums.constants.AttributeNamePositionConstantValues.CHARISMA_POSITION;


import org.junit.Test;

/**
 * Class to test {@link AttributesNames}.
 * 
 * @author davidson.sestaro
 */
public class AttributesNamesTest {
	
  /**
   * Test enum position.
   */
	@Test
  public final void enumTest() {
		assertEquals(STRENGTH_POSITION, AttributesNames.STRENGTH.getPosition());
		assertEquals(STRENGTH_PHYSICAL_STRENGTH_POSITION, AttributesNames.STRENGTH_PHYSICALSTRENGTH.getPosition());
		assertEquals(STRENGTH_ENDURANCE_POSITION, AttributesNames.STRENGTH_ENDURANCE.getPosition());
		
		assertEquals(DEXTERITY_POSITION, AttributesNames.DEXTERITY.getPosition());
		assertEquals(DEXTERITY_SPEED_POSITION, AttributesNames.DEXTERITY_SPEED.getPosition());
		assertEquals(DEXTERITY_COORDINATION_POSITION, AttributesNames.DEXTERITY_COORDINATION.getPosition());
		
		assertEquals(CONSTITUTION_POSITION, AttributesNames.CONSTITUTION.getPosition());
		assertEquals(CONSTITUTION_TOUGHNESS_POSITION, AttributesNames.CONSTITUTION_TOUGHNESS.getPosition());
		assertEquals(CONSTITUTION_RESISTANCE_POSITION, AttributesNames.CONSTITUTION_RESISTANCE.getPosition());
		
		assertEquals(INTELLIGENCE_POSITION, AttributesNames.INTELLIGENCE.getPosition());
		assertEquals(INTELLIGENCE_KNOWLEDGE_POSITION, AttributesNames.INTELLIGENCE_KNOWLEDGE.getPosition());
		assertEquals(INTELLIGENCE_LOGIC_POSITION, AttributesNames.INTELLIGENCE_LOGIC.getPosition());
		
		assertEquals(WISDOM_POSITION, AttributesNames.WISDOM.getPosition());
		assertEquals(CHARISMA_POSITION, AttributesNames.CHARISMA.getPosition());
	}
}
