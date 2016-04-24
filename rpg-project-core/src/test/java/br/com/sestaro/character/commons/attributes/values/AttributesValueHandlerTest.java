package br.com.sestaro.character.commons.attributes.values;

import static org.junit.Assert.assertEquals;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.values.AttributesValueHandler;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;

public class AttributesValueHandlerTest {

	public void getAttributeByPosition() {
		int strength = 10;
		int dexterity = 12;
		int constitution = 13;
		int intelligence = 14;
		int wisdom = 15;
		int charisma = 16;
		
		AttributesValues values = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
		int attributeValue = 0;
		
		AttributesNames attributeName = AttributesNames.STRENGTH;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(strength, attributeValue);
		
		attributeName = AttributesNames.DEXTERITY;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(dexterity, attributeValue);
		
		attributeName = AttributesNames.CONSTITUTION;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(constitution, attributeValue);
		
		attributeName = AttributesNames.INTELLIGENCE;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(intelligence, attributeValue);
		
		attributeName = AttributesNames.WISDOM;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(wisdom, attributeValue);
		
		attributeName = AttributesNames.CHARISMA;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(charisma, attributeValue);
	}
}
