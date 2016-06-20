package br.com.sestaro.characters.commons.attributes.model;

import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHTEEN_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.ELEVEN_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWO;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.model.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.model.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.rules.attributes.values.AttributesValuesRules;

/**
 * Class to test {@link Attributes}.
 * 
 * @author davidson.sestaro
 */
public class AttributesTests extends AttributesValuesRules {

    /**
     * Validate initial configuration.
     */
    @Test
    public final void testShouldValidateInstantiationWithAllAttributes() {
	new Attributes(getAttributes());
    }

    /**
     * Validate null values.
     */
    @Test(expected = NullAttributesException.class)
    public final void testShouldFailWhenAttributesAreNull() {
	new Attributes(null);
    }

    /**
     * Validate positive attributes.
     */
    @Test
    public final void testShouldValidateGetPositiveAttributeModifier() {
	Attributes attributes = new Attributes(getAttributes());

	assertEquals(TWO, attributes.getAttributeModifier(AttributesNames.CONSTITUTION));
    }

    /**
     * Validate negative attributes.
     */
    @Test
    public final void testShouldValidateGetNegativeAttributeModifier() {
	Attributes attributes = new Attributes(getAttributes());

	assertEquals(ELEVEN_MODIFIER, attributes.getAttributeModifier(AttributesNames.WISDOM));
    }

    /**
     * Validate addiction of value.
     */
    @Test
    public final void testShouldValidateSumOfValueToAttributeSpecialization() {
	Attributes attributes = new Attributes(getAttributes());

	attributes.addAttributeValue(AttributesNames.INTELLIGENCE_LOGIC, POSITIVE);

	assertEquals(EIGHTEEN_MODIFIER, attributes.getAttributeModifier(AttributesNames.INTELLIGENCE_LOGIC));
    }
}
