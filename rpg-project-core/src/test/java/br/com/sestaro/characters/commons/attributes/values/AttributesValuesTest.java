package br.com.sestaro.characters.commons.attributes.values;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;

public class AttributesValuesTest {

	private AttributesValues attributes; 
	private Strength strength;
	private int dexterity = 2;
	private int constitution = 3;
	private int intelligence = 4;
	private int wisdom = 5;
	private int charisma = 6;
	
	@Before
	public void initialization() {
		this.strength = new Strength(12, 16);
		this.attributes = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	@Test
	public void testInitializationWithValues() {
		assertEquals(14, this.attributes.getStrength().getStrength());
		assertEquals(12, this.attributes.getStrength().getPhysicalStrength());
		assertEquals(16, this.attributes.getStrength().getEndurance());
		assertEquals(this.dexterity, this.attributes.getDexterity());
		assertEquals(this.constitution, this.attributes.getConstitution());
		assertEquals(this.intelligence, this.attributes.getIntelligence());
		assertEquals(this.wisdom, this.attributes.getWisdom());
		assertEquals(this.charisma, this.attributes.getCharisma());
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeDexterityValue() {
		attributes.setDexterity(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeConstitutionValue() {
		attributes.setConstitution(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeIntelligenceValue() {
		attributes.setIntelligence(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeWisdomValue() {
		attributes.setWisdom(-1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeCharismaValue() {
		attributes.setCharisma(-1);
	}
}
