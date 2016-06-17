package br.com.sestaro.characters.commons.attributes.model.values;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHT;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWELVE;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.model.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.rules.attributes.values.AttributesValuesRules;

/**
 * Class to test {@link AttributesValues}.
 * 
 * @author davidson.sestaro
 */
public class AttributesValuesTests extends AttributesValuesRules {

    /**
     * Validate if the method get is returning the correct value.
     */
    @Test
    public final void testShouldValidateRetrieveOfAttributesAndSpecializarionsValues() {
	assertEquals(FOURTEEN, getAttributes().getStrength().getStrength());
	assertEquals(TWELVE, getAttributes().getStrength().getPhysicalStrength());
	assertEquals(SIXTEEN, getAttributes().getStrength().getEndurance());

	assertEquals(FOURTEEN, getAttributes().getDexterity().getDexterity());
	assertEquals(SIXTEEN, getAttributes().getDexterity().getSpeed());
	assertEquals(THIRTEEN, getAttributes().getDexterity().getCoordination());

	assertEquals(FOURTEEN, getAttributes().getConstitution().getConstitution());
	assertEquals(THIRTEEN, getAttributes().getConstitution().getToughness());
	assertEquals(FIFTEEN, getAttributes().getConstitution().getResistance());

	assertEquals(FOURTEEN, getAttributes().getIntelligence().getIntelligence());
	assertEquals(TWELVE, getAttributes().getIntelligence().getKnowledge());
	assertEquals(SIXTEEN, getAttributes().getIntelligence().getLogic());

	assertEquals(TEN, getAttributes().getWisdom().getWisdom());
	assertEquals(EIGHT, getAttributes().getWisdom().getInstinct());
	assertEquals(TWELVE, getAttributes().getWisdom().getIntuition());

	assertEquals(TWELVE, getAttributes().getCharisma().getCharisma());
	assertEquals(TWELVE, getAttributes().getCharisma().getAppearance());
	assertEquals(TWELVE, getAttributes().getCharisma().getCharm());

	assertEquals(getCharisma(), getAttributes().getCharisma());
    }

    /**
     * Validate negative input.
     */
    @Test(expected = NegativeAttributeValueException.class)
    public final void testShouldFailWhenAttributeSpecializationBecameNegativePathOne() {
	getAttributes().getConstitution().addToughness(-FOURTEEN);
    }

    /**
     * Validate negative input.
     */
    @Test(expected = NegativeAttributeValueException.class)
    public final void testShouldFailWhenAttributeSpecializationBecameNegativePathTwo() {
	getAttributes().getWisdom().addIntuition(-SIXTEEN);
    }

    /**
     * Validate negative input.
     */
    @Test(expected = NegativeAttributeValueException.class)
    public final void testShouldFailWhenAttributeSpecializationBecameNegativePathThree() {
	getAttributes().getCharisma().addCharm(-SIXTEEN);
    }
}
