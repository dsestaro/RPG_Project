package br.com.sestaro.characters.commons.savingthrows.values;

import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.THREE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TWO;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;

/**
 * Class to test {@link SavingThrowsValueHandler}.
 * 
 * @author davidson.sestaro
 */
public class SavingThorwsValueHandlerTest {

	private SavingThrowsValues values;
	private static final int FORTITUDE = TWO;
	private static final int REFLEX = THREE;
	private static final int WILL = TWO;

	/**
   * Initialization of variables that will be used in this class.
   */
	@Before
  public final void initialContext() {
		this.values = new SavingThrowsValues(FORTITUDE, REFLEX, WILL);
	}
	
	/**
	 * Retrieve saving throws information.
	 */
	@Test
  public final void getSavingThrowByPositionTest() {
		int attributeValue = 0;
		
		SavingThrowsNames name = SavingThrowsNames.FORTITUDE;
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(FORTITUDE, attributeValue);
		
		name = SavingThrowsNames.REFLEX;
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(REFLEX, attributeValue);
		
		name = SavingThrowsNames.WILL;
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(WILL, attributeValue);
	}
	
	/**
   * Adding saving throws information.
   */
	@Test
	public final void addSavingThrowByPositionTest() {
		int attributeValue = 0;
		
		SavingThrowsNames name = SavingThrowsNames.FORTITUDE;
		SavingThrowsValueHandler.setSavingThrowByPosition(values, name, TWO);
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(TWO, attributeValue);
		
		name = SavingThrowsNames.REFLEX;
		SavingThrowsValueHandler.setSavingThrowByPosition(values, name, THREE);
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(THREE, attributeValue);
		
		name = SavingThrowsNames.WILL;
		SavingThrowsValueHandler.setSavingThrowByPosition(values, name, -TWO);
		attributeValue = SavingThrowsValueHandler.getSavingThrowByPosition(values, name);
		assertEquals(-TWO, attributeValue);
	}
}
