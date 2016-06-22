package br.com.sestaro.characters.commons.info.values;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.model.enums.CharacterAlignNames;
import br.com.sestaro.characters.commons.info.model.enums.GenderNames;
import br.com.sestaro.characters.commons.info.model.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.model.values.CharacterInformationsValues;

import static org.junit.Assert.assertEquals;

/**
 * Class to test {@link CharacterInformationsValues}.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationsValuesTests {

    private static final String NAME = "Dahlion";
    private static final CharacterAlignNames ALIGN = CharacterAlignNames.NEUTRAL;
    private static final String DEITY = "Va'al";
    private static final String HOMELAND = "Kazzad";
    private static final GenderNames GENDER = GenderNames.MAN;
    private static final int AGE = 180;
    private static final int HEIGHT = 90;
    private static final int WEIGHT = 190;
    private static final String HAIR_COLOR = "black";
    private static final String EYES_COLOR = "green";

    /**
     * Initial configuration.
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
	CharacterInformationsValues character = new CharacterInformationsValues(NAME, ALIGN, DEITY, HOMELAND, GENDER,
		AGE, HEIGHT, WEIGHT, HAIR_COLOR, EYES_COLOR);

	assertEquals(NAME, character.getName());
	assertEquals(ALIGN, character.getAlignment());
	assertEquals(DEITY, character.getDeity());
	assertEquals(HOMELAND, character.getHomeland());
	assertEquals(GENDER, character.getGender());
	assertEquals(AGE, character.getAge());
	assertEquals(HEIGHT, character.getHeight());
	assertEquals(WEIGHT, character.getWeight());
	assertEquals(HAIR_COLOR, character.getHairColor());
	assertEquals(EYES_COLOR, character.getEyesColor());

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
