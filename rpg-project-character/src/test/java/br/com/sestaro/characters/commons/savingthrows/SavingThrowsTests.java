package br.com.sestaro.characters.commons.savingthrows;

import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.THREE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TWO;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FOUR;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.exceptions.NullSavingThrowsException;
import br.com.sestaro.characters.commons.savingthrows.values.SavingThrowsValues;

/**
 * Class to test {@link SavingThrows}.
 * 
 * @author davidson.sestaro
 */
public class SavingThrowsTests {
	
	private SavingThrowsValues values;
	private static final int FORTITUDE = TWO;
  private static final int REFLEX = THREE;
  private static final int WILL = TWO;
	
  /**
   * Initialization of variables that will be used in this class.
   */
	@Before
  public final void beforeInitialTestsConfiguration() {
		this.values = new SavingThrowsValues(FORTITUDE, REFLEX, WILL);
	}
	
	/**
	 * Validate initial configuration.
	 */
	@Test
  public final void testShouldValidateInstantiationWithValues() {
		new SavingThrows(this.values);
	}
	
	/**
	 * Validate null configuration.
	 */
	@Test(expected = NullSavingThrowsException.class)
  public final void testShouldFailWhenInstantiationWithNull() {
		new SavingThrows(null);
	}
	
	/**
	 * Validate information retrieve.
	 */
	@Test
  public final void testShouldValidateRetrivingValue() {
		SavingThrows savings = new SavingThrows(values);
		
		assertEquals(WILL, savings.getSavingThrowTotal(SavingThrowsNames.WILL));
	}
	
	/**
   * Validate information input.
   */
	@Test
  public final void testShouldValidateSumOfValueToSavingThrow() {
		SavingThrows savings = new SavingThrows(values);
		
		savings.setSavingThrowTotalValue(SavingThrowsNames.WILL, FOUR);
		assertEquals(FOUR, savings.getSavingThrowTotal(SavingThrowsNames.WILL));
	}
}
