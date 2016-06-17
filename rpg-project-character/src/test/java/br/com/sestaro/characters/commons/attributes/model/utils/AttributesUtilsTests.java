package br.com.sestaro.characters.commons.attributes.model.utils;

import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHTEEN_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FIVE_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.NINETEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SEVENTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.model.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.model.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity.subdivision.Speed;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Class to test {@link AttributesUtils}.
 * 
 * @author davidson.sestaro
 */
public class AttributesUtilsTests {

    /**
     * Validate attributes with null value.
     */
    @Test(expected = NegativeAttributeValueException.class)
    public final void testShouldFailWhenAttributeIsNegative() {
	AttributesUtils.validateAttributeValue(-1);
    }

    /**
     * Validate positive modifier calc.
     */
    @Test
    public final void testShouldCalculateAttributeModifier() {
	assertEquals(EIGHTEEN_MODIFIER, AttributesUtils.calculateModifier(EIGHTEEN));
    }

    /**
     * Validate negative modifier calc.
     */
    @Test
    public final void testShouldCalculateNegativeAttributeModifier() {
	assertEquals(FIVE_MODIFIER, AttributesUtils.calculateModifier(FIVE));
    }

    /**
     * Validate difference between attributes.
     */
    @Test(expected = InvalidAttributeValueException.class)
    public final void testShouldFailWhenAttributeDifferenceIsGreaterThanFourPathOne() {
	ISpecialization spec1 = new Speed(TWELVE);
	ISpecialization spec2 = new Speed(SEVENTEEN);

	AttributesUtils.initialValidations(spec1, spec2);
    }

    /**
     * Validate difference between attributes.
     */
    @Test(expected = InvalidAttributeValueException.class)
    public final void testShouldFailWhenAttributeDifferenceIsGreaterThanFourPathTwo() {
	ISpecialization spec1 = new Speed(SEVENTEEN);
	ISpecialization spec2 = new Speed(TWELVE);

	AttributesUtils.initialValidations(spec1, spec2);
    }

    /**
     * Validate difference between attributes with an attribute greater then 18.
     */
    @Test(expected = InvalidAttributeValueException.class)
    public final void testShouldFailWhenAttributesAreDifferentAndBiggerThanEighteenPathOne() {
	ISpecialization spec1 = new Speed(NINETEEN);
	ISpecialization spec2 = new Speed(FOURTEEN);

	AttributesUtils.initialValidations(spec1, spec2);
    }

    /**
     * Validate difference between attributes with an attribute greater then 18.
     */
    @Test(expected = InvalidAttributeValueException.class)
    public final void testShouldFailWhenAttributesAreDifferentAndBiggerThanEighteenPathTwo() {
	ISpecialization spec1 = new Speed(FOURTEEN);
	ISpecialization spec2 = new Speed(NINETEEN);

	AttributesUtils.initialValidations(spec1, spec2);
    }

    /**
     * Validate difference between attributes with an attribute greater then 18.
     */
    @Test
    public final void testShouldValidateAttributesEqualsAndBiggerThanEighteen() {
	ISpecialization spec1 = new Speed(NINETEEN);
	ISpecialization spec2 = new Speed(NINETEEN);

	AttributesUtils.initialValidations(spec1, spec2);
    }

    /**
     * Validate initial configuration.
     */
    @Test
    public final void testShouldValidateAttributesSmallerThanEighteen() {
	ISpecialization spec1 = new Speed(FOURTEEN);
	ISpecialization spec2 = new Speed(SIXTEEN);

	AttributesUtils.initialValidations(spec1, spec2);
    }
}
