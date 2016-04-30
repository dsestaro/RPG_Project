package br.com.sestaro.characters.commons.info.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.enums.CharacterAlignNames;

public class CharacterAlignNamesTest {
	
	@Test
	public void enumTest() {
		assertEquals(1, CharacterAlignNames.LAWFUL_GOOD.getPosition());
		assertEquals(2, CharacterAlignNames.NEUTRAL_GOOD.getPosition());
		assertEquals(3, CharacterAlignNames.CHAOTIC_GOOD.getPosition());
		assertEquals(4, CharacterAlignNames.LAWFUL_NEUTRAL.getPosition());
		assertEquals(5, CharacterAlignNames.NEUTRAL.getPosition());
		assertEquals(6, CharacterAlignNames.CHAOTIC_NEUTRAL.getPosition());
		assertEquals(7, CharacterAlignNames.LAWFUL_EVIL.getPosition());
		assertEquals(8, CharacterAlignNames.NEUTRAL_EVIL.getPosition());
		assertEquals(9, CharacterAlignNames.CHAOTIC_EVIL.getPosition());
	}
}
