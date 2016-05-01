package br.com.sestaro.characters.commons.attributes.values.specializations.constitution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;

public class ConstitutionTest {

	@Test
	public void initializationTest() {
		Constitution constitution = new Constitution(12, 14);
		
		assertEquals(13, constitution.getConstitution());
		assertEquals(12, constitution.getToughness());
		assertEquals(14, constitution.getResistance());
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeToughnessValue() {
		new Constitution(-1, 1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeResistanceValue() {
		new Constitution(1, -1);
	}
	
	@Test
	public void addToughnessTest() {
		Constitution constitution = new Constitution(16, 14);
		
		constitution.addToughness(2);
		
		assertEquals(18, constitution.getToughness());
	}
	
	@Test
	public void removeToughnessTest() {
		Constitution constitution = new Constitution(16, 14);
		
		constitution.addToughness(-2);
		
		assertEquals(14, constitution.getToughness());
	}
	
	@Test
	public void addResistanceTest() {
		Constitution constitution = new Constitution(16, 14);
		
		constitution.addResistance(3);
		
		assertEquals(17, constitution.getResistance());
	}
	
	@Test
	public void removeEnduranceTest() {
		Constitution constitution = new Constitution(16, 14);
		
		constitution.addResistance(-1);
		
		assertEquals(13, constitution.getResistance());
	}
}
