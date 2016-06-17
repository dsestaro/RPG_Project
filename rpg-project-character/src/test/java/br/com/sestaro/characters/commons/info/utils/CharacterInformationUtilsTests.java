package br.com.sestaro.characters.commons.info.utils;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;

/**
 * Class to test {@link CharacterInformationUtils}.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationUtilsTests {

    /**
     * Validate if a information is empty.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShouldFailWhenStringIsEmpty() {
	CharacterInformationUtils.validateInformation("");
    }

    /**
     * Validate if a information is null.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShouldFailWhenStringIsNull() {
	CharacterInformationUtils.validateInformation(null);
    }

    /**
     * Validate if a information is null.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShouldFailWhenStringIsTooShort() {
	CharacterInformationUtils.validateInformation("a");
    }
}
