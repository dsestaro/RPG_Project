package br.com.sestaro.characters.commons.attributes.values.specializations.strength;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrengthTest {

	@Test
	public void initializationTest() {
		Strength strength = new Strength(15, 16, 14);
		
		assertEquals(15, strength.getStrength());
		assertEquals(14, strength.getEndurance());
		assertEquals(16, strength.getPhysicalStrength());
	}
	
	@Test
	public void addPhysicalStrengthTest() {
		Strength strength = new Strength(15, 16, 14);
		
		strength.addPhysicalStrength(2);
		
		assertEquals(18, strength.getPhysicalStrength());
	}
	
	@Test
	public void removePhysicalStrengthTest() {
		Strength strength = new Strength(15, 16, 14);
		
		strength.addPhysicalStrength(-2);
		
		assertEquals(14, strength.getPhysicalStrength());
	}
	
	@Test
	public void addEnduranceTest() {
		Strength strength = new Strength(15, 16, 14);
		
		strength.addEndurance(3);
		
		assertEquals(17, strength.getEndurance());
	}
	
	@Test
	public void removeEnduranceTest() {
		Strength strength = new Strength(15, 16, 14);
		
		strength.addEndurance(-1);
		
		assertEquals(13, strength.getEndurance());
	}
}
