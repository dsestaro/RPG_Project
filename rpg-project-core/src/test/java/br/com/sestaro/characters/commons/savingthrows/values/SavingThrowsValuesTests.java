package br.com.sestaro.characters.commons.savingthrows.values;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FOUR;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TWO;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.ZERO;

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
  public final void savingThrowConstructorTest() {
		SavingThrowsValues values = new SavingThrowsValues(ZERO, TWO, FOUR);
		
		assertEquals(0, values.getFortitude());
	}
}
