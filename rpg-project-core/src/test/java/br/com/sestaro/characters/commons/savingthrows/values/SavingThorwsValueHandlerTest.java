package br.com.sestaro.characters.commons.savingthrows.values;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.values.SavingThrowsValueHandler;
import br.com.sestaro.characters.commons.savingthrows.values.SavingThrowsValues;

public class SavingThorwsValueHandlerTest {

	private SavingThrowsValues values;
	int fortitude = 2;
	int reflex = 3;
	int will = 2;

	@Before
	public void initialContext() {
		this.values = new SavingThrowsValues(fortitude, reflex, will);
	}
	
	@Test
	public void getSavingThrowByPositionTest() {
		int attributeValue = 0;
		
		SavingThrowsNames name = SavingThrowsNames.FORTITUDE;
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(fortitude, attributeValue);
		
		name = SavingThrowsNames.REFLEX;
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(reflex, attributeValue);
		
		name = SavingThrowsNames.WILL;
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(will, attributeValue);
	}
	
	@Test
	public void addSavingThrowByPositionTest() {
		int attributeValue = 0;
		
		SavingThrowsNames name = SavingThrowsNames.FORTITUDE;
		SavingThrowsValueHandler.setSavingThrowByPosition(values, name, 2);
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(2, attributeValue);
		
		name = SavingThrowsNames.REFLEX;
		SavingThrowsValueHandler.setSavingThrowByPosition(values, name, 3);
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(3, attributeValue);
		
		name = SavingThrowsNames.WILL;
		SavingThrowsValueHandler.setSavingThrowByPosition(values, name, -2);
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(-2, attributeValue);
	}
}
