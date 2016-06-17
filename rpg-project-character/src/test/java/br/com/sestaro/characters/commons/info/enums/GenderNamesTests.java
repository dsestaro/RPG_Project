package br.com.sestaro.characters.commons.info.enums;

import static br.com.sestaro.characters.commons.info.enums.constants.GenderNamesPositionConstants.MAN;
import static br.com.sestaro.characters.commons.info.enums.constants.GenderNamesPositionConstants.WOMAN;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Class to test {@link GenderNames}.
 * 
 * @author davidson.sestaro
 */
public class GenderNamesTests {

    /**
     * Test enum position.
     */
    @Test
    public final void testShouldValidateEnumPosition() {
	assertEquals(MAN, GenderNames.MAN.getPosition());
	assertEquals(WOMAN, GenderNames.WOMAN.getPosition());
    }
}
