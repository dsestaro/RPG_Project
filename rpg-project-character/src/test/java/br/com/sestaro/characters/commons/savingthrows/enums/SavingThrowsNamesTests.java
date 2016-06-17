package br.com.sestaro.characters.commons.savingthrows.enums;

import static br.com.sestaro.characters.commons.savingthrows.enums.constants.SavingThrowsNamesPosition.FORTITUDE;
import static br.com.sestaro.characters.commons.savingthrows.enums.constants.SavingThrowsNamesPosition.REFLEX;
import static br.com.sestaro.characters.commons.savingthrows.enums.constants.SavingThrowsNamesPosition.WILL;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Class to test {@link SavingThrowsNames}.
 * 
 * @author davidson.sestaro
 */
public class SavingThrowsNamesTests {

    /**
     * Test enum position.
     */
    @Test
    public final void testShouldValidateEnumPosition() {
	assertEquals(FORTITUDE, SavingThrowsNames.FORTITUDE.getPosition());
	assertEquals(REFLEX, SavingThrowsNames.REFLEX.getPosition());
	assertEquals(WILL, SavingThrowsNames.WILL.getPosition());
    }
}
