package br.com.sestaro.characters.commons.info.enums;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.LAWFUL_GOOD;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.NEUTRAL_GOOD;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.CHAOTIC_GOOD;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.LAWFUL_NEUTRAL;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.NEUTRAL;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.CHAOTIC_NEUTRAL;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.LAWFUL_EVIL;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.NEUTRAL_EVIL;
import static br.com.sestaro.characters.commons.info.enums.constants.CharacterAlignNamesPositionConstants.CHAOTIC_EVIL;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.model.enums.CharacterAlignNames;

/**
 * Class to test {@link CharacterAlignNames}.
 * 
 * @author davidson.sestaro
 */
public class CharacterAlignNamesTests {

    /**
     * Test enum position.
     */
    @Test
    public final void testShouldValidateEnumPosition() {
	assertEquals(LAWFUL_GOOD, CharacterAlignNames.LAWFUL_GOOD.getPosition());
	assertEquals(NEUTRAL_GOOD, CharacterAlignNames.NEUTRAL_GOOD.getPosition());
	assertEquals(CHAOTIC_GOOD, CharacterAlignNames.CHAOTIC_GOOD.getPosition());
	assertEquals(LAWFUL_NEUTRAL, CharacterAlignNames.LAWFUL_NEUTRAL.getPosition());
	assertEquals(NEUTRAL, CharacterAlignNames.NEUTRAL.getPosition());
	assertEquals(CHAOTIC_NEUTRAL, CharacterAlignNames.CHAOTIC_NEUTRAL.getPosition());
	assertEquals(LAWFUL_EVIL, CharacterAlignNames.LAWFUL_EVIL.getPosition());
	assertEquals(NEUTRAL_EVIL, CharacterAlignNames.NEUTRAL_EVIL.getPosition());
	assertEquals(CHAOTIC_EVIL, CharacterAlignNames.CHAOTIC_EVIL.getPosition());
    }
}
