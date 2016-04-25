package br.com.sestaro.character.commons.savingthrows;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.savingthrows.SavingThrows;
import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.exceptions.NullSavingThrowsException;
import br.com.sestaro.characters.commons.savingthrows.values.SavingThrowsValues;

public class SavingThrowsTest {
	
	private SavingThrowsValues values;
	int fortitude = 2;
	int reflex = 3;
	int will = 2;
	
	@Before
	public void initialContext() {
		this.values = new SavingThrowsValues(fortitude, reflex, will);
	}
	
	@Test
	public void testInitializationWithValues() {
		new SavingThrows(this.values);
	}
	
	@Test
	public void testInitializationWithoutValues() {
		new SavingThrows();
	}
	
	@Test(expected=NullSavingThrowsException.class)
	public void testNullSavingThrowsValueInitialization() {
		new SavingThrows(null);
	}
	
	@Test
	public void getSavingThrowValueTest() {
		SavingThrows savings = new SavingThrows(values);
		
		assertEquals(will, savings.getSavingThrowTotal(SavingThrowsNames.WILL));
	}
	
	@Test
	public void setSavingThrowValueTest() {
		SavingThrows savings = new SavingThrows(values);
		
		savings.setSavingThrowTotalValue(SavingThrowsNames.WILL, 4);
		assertEquals(4, savings.getSavingThrowTotal(SavingThrowsNames.WILL));
	}
}
