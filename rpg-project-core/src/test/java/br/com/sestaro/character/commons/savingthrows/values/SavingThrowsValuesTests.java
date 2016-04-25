package br.com.sestaro.character.commons.savingthrows.values;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.savingthrows.values.SavingThrowsValues;

public class SavingThrowsValuesTests {
	
	@Test
	public void savingThrowConstructorTest() {
		SavingThrowsValues values = new SavingThrowsValues();
		
		assertEquals(0, values.getFortitude());
	}
}
