package br.com.sestaro.characters.commons.info.model.values;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.model.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.rules.info.values.CharacterInformationsRules;

/**
 * Class to test {@link CharacterInformationsValues}.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationsValuesTests extends CharacterInformationsRules {

    /**
     * Test of instantiation.
     */
    @Test
    public final void testShouldValidateInstantiationWithAllParameters() {
	new CharacterInformationsValues(NAME, ALIGN, DEITY, HOMELAND, GENDER, AGE, HEIGHT, WEIGHT, HAIR_COLOR,
		EYES_COLOR);
    }

    /**
     * Retrieve configuration.
     */
    @Test
    public final void testShouldValidateInformationRetrieve() {
	assertEquals(NAME, getCharacter().getName());
	assertEquals(ALIGN, getCharacter().getAlignment());
	assertEquals(DEITY, getCharacter().getDeity());
	assertEquals(HOMELAND, getCharacter().getHomeland());
	assertEquals(GENDER, getCharacter().getGender());
	assertEquals(AGE, getCharacter().getAge());
	assertEquals(HEIGHT, getCharacter().getHeight());
	assertEquals(WEIGHT, getCharacter().getWeight());
	assertEquals(HAIR_COLOR, getCharacter().getHairColor());
	assertEquals(EYES_COLOR, getCharacter().getEyesColor());
    }

    /**
     * Validate initial configuration with null/empty name.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShoulValidateNullOrEmptyFristParameter() {
	new CharacterInformationsValues("", ALIGN, DEITY, HOMELAND, GENDER, AGE, HEIGHT, WEIGHT, HAIR_COLOR,
		EYES_COLOR);
    }

    /**
     * Validate initial configuration with null/empty deity.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShoulValidateNullOrEmptyThirdParameter() {
	new CharacterInformationsValues(NAME, ALIGN, null, HOMELAND, GENDER, AGE, HEIGHT, WEIGHT, HAIR_COLOR,
		EYES_COLOR);
    }

    /**
     * Validate initial configuration with null/empty deity.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShoulValidateNullOrEmptyFourthParameter() {
	new CharacterInformationsValues(NAME, ALIGN, DEITY, "", GENDER, AGE, HEIGHT, WEIGHT, HAIR_COLOR, EYES_COLOR);
    }

    /**
     * Validate initial configuration with null/empty homeland.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShoulValidateNullOrEmptyNinethParameter() {
	new CharacterInformationsValues(NAME, ALIGN, DEITY, HOMELAND, GENDER, AGE, HEIGHT, WEIGHT, "", EYES_COLOR);
    }

    /**
     * Validate initial configuration with null/empty eyes color.
     */
    @Test(expected = InvalidInformationException.class)
    public final void testShoulValidateNullOrEmptyTenthParameter() {
	new CharacterInformationsValues(NAME, ALIGN, DEITY, HOMELAND, GENDER, AGE, HEIGHT, WEIGHT, HAIR_COLOR, null);
    }
}
