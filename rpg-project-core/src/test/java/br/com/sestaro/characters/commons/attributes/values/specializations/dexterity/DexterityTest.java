package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;

public class DexterityTest {
	@Test
	public void initializationTest() {
		Dexterity dexterity = new Dexterity(16, 14);
		
		assertEquals(15, dexterity.getDexterity());
		assertEquals(16, dexterity.getSpeed());
		assertEquals(14, dexterity.getCoordination());
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeSpeedValue() {
		new Dexterity(-1, 1);
	}
	
	@Test(expected=NegativeAttributeValueException.class)
	public void testNegativeCoordinationValue() {
		new Dexterity(1, -1);
	}
	
	@Test
	public void addSpeedTest() {
		Dexterity dexterity = new Dexterity(16, 14);
		
		dexterity.addSpeed(2);
		
		assertEquals(18, dexterity.getSpeed());
	}
	
	@Test
	public void removeSpeedTest() {
		Dexterity dexterity = new Dexterity(16, 14);
		
		dexterity.addSpeed(-2);
		
		assertEquals(14, dexterity.getSpeed());
	}
	
	@Test
	public void addCoordinationTest() {
		Dexterity dexterity = new Dexterity(16, 14);
		
		dexterity.addCoordination(3);
		
		assertEquals(17, dexterity.getCoordination());
	}
	
	@Test
	public void removeEnduranceTest() {
		Dexterity dexterity = new Dexterity(16, 14);
		
		dexterity.addCoordination(-1);
		
		assertEquals(13, dexterity.getCoordination());
	}
}
