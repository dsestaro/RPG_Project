package br.com.sestaro.characters.commons.attributes.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.enums.GenderNames;

public class GenderNamesTest {
	@Test
	public void enumTest() {
		assertEquals(1, GenderNames.MAN.getPosition());
		assertEquals(2, GenderNames.WOMAN.getPosition());
	}
}
