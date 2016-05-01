package br.com.sestaro.characters.commons.attributes.values;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeNameException;
import br.com.sestaro.characters.commons.attributes.values.AttributesValueHandler;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;

public class AttributesValueHandlerTest {

	private AttributesValues values; 
	private Strength strength;
	private Dexterity dexterity;
	private int constitution = 13;
	private int intelligence = 14;
	private int wisdom = 15;
	private int charisma = 16;
	
	@Before
	public void initialize() {
		this.strength = new Strength(12, 8);
		this.dexterity = new Dexterity(14, 14);
		
		this.values = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	@Test
	public void getAttributeByPositionTest() {
		int attributeValue = 0;
		
		AttributesNames attributeName = AttributesNames.STRENGTH;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(10, attributeValue);
		
		attributeName = AttributesNames.DEXTERITY;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(14, attributeValue);
		
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
	
	@Test
	public void addAttributeByPositionTest() {
		int attributeValue = 0;
		
		AttributesNames attributeName = AttributesNames.STRENGTH_PHYSICALSTRENGTH;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 1);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(13, attributeValue);
		
		attributeName = AttributesNames.STRENGTH_ENDURANCE;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 2);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(10, attributeValue);
		
		attributeName = AttributesNames.DEXTERITY_SPEED;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 3);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(17, attributeValue);
		
		attributeName = AttributesNames.DEXTERITY_COORDINATION;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 2);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(16, attributeValue);
		
		attributeName = AttributesNames.CONSTITUTION;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, -2);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(constitution - 2, attributeValue);
		
		attributeName = AttributesNames.INTELLIGENCE;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 1);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(intelligence + 1, attributeValue);
		
		attributeName = AttributesNames.WISDOM;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 7);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(wisdom + 7, attributeValue);
		
		attributeName = AttributesNames.CHARISMA;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 3);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(charisma + 3, attributeValue);
	}
	
	@Test(expected=InvalidAttributeNameException.class)
	public void invalidNameTest() {
		AttributesNames attributeName = AttributesNames.STRENGTH;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 1);
	}
}
