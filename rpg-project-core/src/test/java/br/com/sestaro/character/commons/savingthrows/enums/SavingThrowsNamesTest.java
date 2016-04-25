package br.com.sestaro.character.commons.savingthrows.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;

public class SavingThrowsNamesTest {
	@Test
	public void enumTest() {
		assertEquals(1, SavingThrowsNames.FORTITUDE.getPosition());
		assertEquals(2, SavingThrowsNames.REFLEX.getPosition());
		assertEquals(3, SavingThrowsNames.WILL.getPosition());
	}
}
