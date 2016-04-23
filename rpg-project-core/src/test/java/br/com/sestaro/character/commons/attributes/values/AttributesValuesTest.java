package test.java.br.com.sestaro.character.commons.attributes.values;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import main.java.br.com.sestaro.characters.commons.attributes.values.AttributesValues;

public class AttributesValuesTest {

	@Test
	public void testInitializationWithValues() {
		int strength = 1;
		int dexterity = 2;
		int constitution = 3;
		int intelligence = 4;
		int wisdom = 5;
		int charisma = 6;
		
		AttributesValues attributes = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
		
		assertEquals(strength, attributes.getStrength());
		assertEquals(dexterity, attributes.getDexterity());
		assertEquals(constitution, attributes.getConstitution());
		assertEquals(intelligence, attributes.getIntelligence());
		assertEquals(wisdom, attributes.getWisdom());
		assertEquals(charisma, attributes.getCharisma());
	}
	
	@Test
	public void testInitializationWithoutValues() {
		AttributesValues attributes = new AttributesValues();
		
		assertEquals(0, attributes.getStrength());
		assertEquals(0, attributes.getDexterity());
		assertEquals(0, attributes.getConstitution());
		assertEquals(0, attributes.getIntelligence());
		assertEquals(0, attributes.getWisdom());
		assertEquals(0, attributes.getCharisma());
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeStrengthValue() {
		AttributesValues attributes = new AttributesValues();
		
		attributes.setStrength(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeDexterityValue() {
		AttributesValues attributes = new AttributesValues();
		
		attributes.setDexterity(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeConstitutionValue() {
		AttributesValues attributes = new AttributesValues();
		
		attributes.setConstitution(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeIntelligenceValue() {
		AttributesValues attributes = new AttributesValues();
		
		attributes.setIntelligence(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeWisdomValue() {
		AttributesValues attributes = new AttributesValues();
		
		attributes.setWisdom(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeCharismaValue() {
		AttributesValues attributes = new AttributesValues();
		
		attributes.setCharisma(-1);
	}
}
