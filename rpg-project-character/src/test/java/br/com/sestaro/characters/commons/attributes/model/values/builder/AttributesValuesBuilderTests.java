package br.com.sestaro.characters.commons.attributes.model.values.builder;

import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHT;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.model.exceptions.NullAttributeValueException;

/**
 * Class to test {@link AttributesValuesBuilder}.
 * 
 * @author davidson.sestaro
 */
public class AttributesValuesBuilderTests {

    /**
     * Validate if the method setting the corrects strength values.
     */
    @Test
    public final void testShouldValidateStrengthValues() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setStrength(TWELVE, EIGHT);

	assertEquals(TWELVE, build.getStrength().getPhysicalStrength());
	assertEquals(EIGHT, build.getStrength().getEndurance());
    }

    /**
     * Validate if the method setting the corrects dexterity values.
     */
    @Test
    public final void testShouldValidateDexterityValues() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setDexterity(FOURTEEN, SIXTEEN);

	assertEquals(FOURTEEN, build.getDexterity().getSpeed());
	assertEquals(SIXTEEN, build.getDexterity().getCoordination());
    }

    /**
     * Validate if the method setting the corrects constitution values.
     */
    @Test
    public final void testShouldValidateConstitutionValues() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setConstitution(FOURTEEN, TWELVE);

	assertEquals(FOURTEEN, build.getConstitution().getToughness());
	assertEquals(TWELVE, build.getConstitution().getResistance());
    }

    /**
     * Validate if the method setting the corrects intelligence values.
     */
    @Test
    public final void testShouldValidateIntelligenceValues() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setIntelligence(FOURTEEN, FIFTEEN);

	assertEquals(FOURTEEN, build.getIntelligence().getKnowledge());
	assertEquals(FIFTEEN, build.getIntelligence().getLogic());
    }

    /**
     * Validate if the method setting the corrects wisdom values.
     */
    @Test
    public final void testShouldValidateWisdomValues() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setWisdom(FIFTEEN, FOURTEEN);

	assertEquals(FIFTEEN, build.getWisdom().getInstinct());
	assertEquals(FOURTEEN, build.getWisdom().getIntuition());
    }

    /**
     * Validate if the method setting the corrects charisma values.
     */
    @Test
    public final void testShouldValidateCharismaValues() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setCharisma(FIFTEEN, FOURTEEN);

	assertEquals(FIFTEEN, build.getCharisma().getAppearance());
	assertEquals(FOURTEEN, build.getCharisma().getCharm());
    }

    /**
     * Validate if the method setting creating the AttributesValues object.
     */
    @Test
    public final void testShouldValidateBuilderCreation() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setCharisma(FIFTEEN, FOURTEEN).setWisdom(FIFTEEN, FOURTEEN).setIntelligence(FOURTEEN, FIFTEEN)
		.setConstitution(FOURTEEN, TWELVE).setDexterity(FOURTEEN, SIXTEEN).setStrength(TWELVE, EIGHT);

	build.generateAttributesValues();
    }

    /**
     * Test should fail when an attribute is null.
     */
    @Test(expected = NullAttributeValueException.class)
    public final void testShouldFailWhenAttributeIsNull() {
	AttributesValuesBuilder build = new AttributesValuesBuilder();

	build.setCharisma(FIFTEEN, FOURTEEN).setIntelligence(FOURTEEN, FIFTEEN).setConstitution(FOURTEEN, TWELVE)
		.setDexterity(FOURTEEN, SIXTEEN).setStrength(TWELVE, EIGHT);

	build.generateAttributesValues();
    }
}
