package br.com.sestaro.characters.commons.attributes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.Attributes;
import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;

public class AttributesTests {
	
	private AttributesValues attributesValues;
	
	@Before
	public void initialContext() {
		Strength strength = new Strength(10, 14);
		Dexterity dexterity = new Dexterity(12, 14);
		Constitution constitution = new Constitution(13, 13);
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
	
	@Test
	public void testInitializationWithoutValues() {
		new Attributes(this.attributesValues).getValues();
	}
	
	@Test
	public void positiveAttributeModifierTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(1, attributes.getAttributeModifier(AttributesNames.CONSTITUTION));
	}
	
	@Test
	public void negativeAttributeModifierTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(-2, attributes.getAttributeModifier(AttributesNames.WISDOM));
	}
	
	@Test
	public void addAttributeValueTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		attributes.addAttributeValue(AttributesNames.INTELLIGENCE, 6);
		
		assertEquals(5, attributes.getAttributeModifier(AttributesNames.INTELLIGENCE));
	}
}
