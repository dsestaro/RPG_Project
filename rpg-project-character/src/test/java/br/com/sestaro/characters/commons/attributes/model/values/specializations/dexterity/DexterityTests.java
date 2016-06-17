package br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity;

import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.NEGATIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.model.exceptions.NegativeAttributeValueException;

/**
 * Class to test {@link Dexterity}.
 * 
 * @author davidson.sestaro
 */
public class DexterityTests {

    /**
     * Validate initial configuration.
     */
    @Test
    public final void testShouldValidateInitialSpecializationValues() {
	Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);

	assertEquals(FIFTEEN, dexterity.getDexterity());
	assertEquals(SIXTEEN, dexterity.getSpeed());
	assertEquals(FOURTEEN, dexterity.getCoordination());
    }

    /**
     * Validate negative input.
     */
    @Test(expected = NegativeAttributeValueException.class)
    public final void testShouldFailWhenValidatingNegativeValueSpecializationPathOne() {
	new Dexterity(NEGATIVE, POSITIVE);
    }

    /**
     * Validate negative input.
     */
    @Test(expected = NegativeAttributeValueException.class)
    public final void testShouldFailWhenValidatingNegativeValueSpecializationPathTwo() {
	new Dexterity(POSITIVE, NEGATIVE);
    }

    /**
     * Add a value to the speed.
     */
    @Test
    public final void testShouldValidateSumOfValueToTheSpeed() {
	Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);

	dexterity.addSpeed(POSITIVE);

	assertEquals(EIGHTEEN, dexterity.getSpeed());
    }

    /**
     * Remove a value to the speed.
     */
    @Test
    public final void testShouldValidateSubtractionOfValueToTheSpeed() {
	Dexterity dexterity = new Dexterity(SIXTEEN, SIXTEEN);

	dexterity.addSpeed(NEGATIVE);

	assertEquals(FOURTEEN, dexterity.getSpeed());
    }

    /**
     * Add a value to the coordination.
     */
    @Test
    public final void testShouldValidateSumOfValueToTheCoordination() {
	Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);

	dexterity.addCoordination(POSITIVE);

	assertEquals(SIXTEEN, dexterity.getCoordination());
    }

    /**
     * Remove a value to the coordination.
     */
    @Test
    public final void testShouldValidateSubtractionOfValueToTheCoordination() {
	Dexterity dexterity = new Dexterity(SIXTEEN, FOURTEEN);

	dexterity.addCoordination(NEGATIVE);

	assertEquals(TWELVE, dexterity.getCoordination());
    }

    /**
     * Test attribute name.
     */
    @Test
    public final void testShouldValidateClassName() {
	assertEquals("DEX", Dexterity.getName());
    }
}
