package br.com.sestaro.characters.commons.rules.info.values;

import org.junit.Before;
import org.junit.rules.ExternalResource;

import br.com.sestaro.characters.commons.info.model.enums.CharacterAlignNames;
import br.com.sestaro.characters.commons.info.model.enums.GenderNames;
import br.com.sestaro.characters.commons.info.model.values.CharacterInformationsValues;

/**
 * Class to handle attributes values inside test cases.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationsRules extends ExternalResource {

    protected static final String NAME = "Dahlion";
    protected static final CharacterAlignNames ALIGN = CharacterAlignNames.NEUTRAL;
    protected static final String DEITY = "Va'al";
    protected static final String HOMELAND = "Kazzad";
    protected static final GenderNames GENDER = GenderNames.MAN;
    protected static final int AGE = 180;
    protected static final int HEIGHT = 90;
    protected static final int WEIGHT = 190;
    protected static final String HAIR_COLOR = "black";
    protected static final String EYES_COLOR = "green";

    private CharacterInformationsValues character;

    /**
     * Default constructor to initialize the variables.
     */
    public CharacterInformationsRules() {
	beforeInitialTestsConfiguration();
    }

    /**
     * Initial configuration.
     */
    @Before
    public final void beforeInitialTestsConfiguration() {
	character = new CharacterInformationsValues(NAME, ALIGN, DEITY, HOMELAND, GENDER, AGE, HEIGHT, WEIGHT,
		HAIR_COLOR, EYES_COLOR);
    }

    /**
     * @return							- Values of the character information
     */
    public final CharacterInformationsValues getCharacter() {
        return character;
    }
}
