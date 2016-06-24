package br.com.sestaro.characters.commons.savingthrows.model;

import br.com.sestaro.characters.commons.savingthrows.model.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.model.exceptions.NullSavingThrowsException;
import br.com.sestaro.characters.commons.savingthrows.model.values.SavingThrowsValueHandler;
import br.com.sestaro.characters.commons.savingthrows.model.values.SavingThrowsValues;

/**
 * Class to interact and manipulate the saving throws values. 
 * 
 * @author davidson.sestaro
 */
public class SavingThrows {
	private SavingThrowsValues values;

	/**
   * @param value                              - Saving throws values
   */
	public SavingThrows(final SavingThrowsValues value) {
		if (value == null) {
			throw new NullSavingThrowsException();
		}
		
		this.values = value;
	}
	
	/**
   * Given a saving throw name returns its value.
   * 
   * @param value                              - Saving throw name
   * @return                                   - Saving throw value
   */
	public final int getSavingThrowTotal(final SavingThrowsNames value) {
		return SavingThrowsValueHandler.getSavingThrowByPosition(this.values, value);
	}
	
	/**
   * Given a saving throw name and a value, the method sums this value to the saving throw.
   * 
   * @param value1                             - Saving throw name
   * @param value2                             - Value
   */
	public final void setSavingThrowTotalValue(final SavingThrowsNames value1, final int value2) {
		SavingThrowsValueHandler.setSavingThrowByPosition(this.values, value1, value2);
	}
}
