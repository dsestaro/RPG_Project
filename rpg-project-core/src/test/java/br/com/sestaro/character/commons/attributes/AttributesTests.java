package br.com.sestaro.character.commons.attributes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.Attributes;
import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;

public class AttributesTests {
	
	private AttributesValues attributesValues;
	
	@Before
	public void initialContext() {
		int strength = 10;
		int dexterity = 12;
		int constitution = 13;
		int intelligence = 14;
		int wisdom = 5;
		int charisma = 16;
		
		this.attributesValues = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}

	@Test
	public void testInitializationWithValues() {
		new Attributes(this.attributesValues);
	}
	
	@Test(expected=NullAttributesException.class)
	public void testNullAttributesValueInitialization() {
		new Attributes(null);
	}
	
	public void positiveAttributeModifierTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(1, attributes.getAttributeModifier(AttributesNames.CONSTITUTION));
	}
	
	public void negativeAttributeModifierTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(-2, attributes.getAttributeModifier(AttributesNames.WISDOM));
	}
}
