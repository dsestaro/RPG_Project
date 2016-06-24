package br.com.sestaro.characters.commons.savingthrows.model.values;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FOUR;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWO;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.ZERO;

import org.junit.Test;

/**
 * Class to test {@link SavingThrowsValues}.
 * 
 * @author davidson.sestaro
 */
public class SavingThrowsValuesTests {

    /**
     * Testing instantiation and information retrieve.
     */
    @Test
    public final void testShouldValidateInformationRetrieve() {
	SavingThrowsValues values = new SavingThrowsValues(ZERO, TWO, FOUR);

	assertEquals(0, values.getFortitude());
    }
}
