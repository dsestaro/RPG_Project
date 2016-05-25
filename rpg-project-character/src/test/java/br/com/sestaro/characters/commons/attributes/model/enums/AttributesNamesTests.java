package br.com.sestaro.characters.commons.attributes.model.enums;

import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.CHARISMA_APPEARANCE_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.CHARISMA_CHARM_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.CHARISMA_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.CONSTITUTION_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.CONSTITUTION_RESISTANCE_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.CONSTITUTION_TOUGHNESS_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.DEXTERITY_COORDINATION_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.DEXTERITY_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.DEXTERITY_SPEED_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.INTELLIGENCE_KNOWLEDGE_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.INTELLIGENCE_LOGIC_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.INTELLIGENCE_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.STRENGTH_ENDURANCE_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.STRENGTH_PHYSICAL_STRENGTH_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.STRENGTH_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.WISDOM_INSTINCT_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.WISDOM_INTUITION_POSITION;
import static br.com.sestaro.characters.commons.attributes.model.enums.constants.AttributeNamePositionConstantValues.WISDOM_POSITION;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Class to test {@link AttributesNames}.
 * 
 * @author davidson.sestaro
 */
public class AttributesNamesTests {
	
  /**
   * Test enum position.
   */
	@Test
  public final void testShouldValidateEnumPosition() {
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
		assertEquals(WISDOM_INSTINCT_POSITION, AttributesNames.WISDOM_INSTINCT.getPosition());
		assertEquals(WISDOM_INTUITION_POSITION, AttributesNames.WISDOM_INTUITION.getPosition());
		
		assertEquals(CHARISMA_POSITION, AttributesNames.CHARISMA.getPosition());
		assertEquals(CHARISMA_APPEARANCE_POSITION, AttributesNames.CHARISMA_APPEARANCE.getPosition());
		assertEquals(CHARISMA_CHARM_POSITION, AttributesNames.CHARISMA_CHARM.getPosition());
	}
}
