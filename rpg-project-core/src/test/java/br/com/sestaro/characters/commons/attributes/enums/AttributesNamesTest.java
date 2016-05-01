package br.com.sestaro.characters.commons.attributes.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;

public class AttributesNamesTest {
	
	@Test
	public void enumTest() {
		assertEquals(10, AttributesNames.STRENGTH.getPosition());
		assertEquals(11, AttributesNames.STRENGTH_PHYSICALSTRENGTH.getPosition());
		assertEquals(12, AttributesNames.STRENGTH_ENDURANCE.getPosition());
		assertEquals(20, AttributesNames.DEXTERITY.getPosition());
		assertEquals(21, AttributesNames.DEXTERITY_SPEED.getPosition());
		assertEquals(22, AttributesNames.DEXTERITY_COORDINATION.getPosition());
		assertEquals(30, AttributesNames.CONSTITUTION.getPosition());
		assertEquals(31, AttributesNames.CONSTITUTION_TOUGHNESS.getPosition());
		assertEquals(32, AttributesNames.CONSTITUTION_RESISTANCE.getPosition());
		assertEquals(4, AttributesNames.INTELLIGENCE.getPosition());
		assertEquals(5, AttributesNames.WISDOM.getPosition());
		assertEquals(6, AttributesNames.CHARISMA.getPosition());
	}
}
