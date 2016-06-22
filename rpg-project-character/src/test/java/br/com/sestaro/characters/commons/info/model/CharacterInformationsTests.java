package br.com.sestaro.characters.commons.info.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.model.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.rules.info.values.CharacterInformationsRules;

/**
 * Class to test {@link CharacterInformations}.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationsTests extends CharacterInformationsRules {

    /**
     * Validate initial configuration.
     */
    @Test
    public final void testShouldValidateInstantiationWithValidParameter() {
	new CharacterInformations(getCharacter());
    }

    /**
     * Validate null initial configuration.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShouldFailWithNullParameter() {
	new CharacterInformations(null);
    }

    /**
     * Validate if a retrieved informantion was not changed.
     */
    @Test
    public final void testShouldValidateInformationRetrieve() {
	CharacterInformations character = new CharacterInformations(getCharacter());

	assertEquals(AGE, character.getValues().getAge());
    }
}
