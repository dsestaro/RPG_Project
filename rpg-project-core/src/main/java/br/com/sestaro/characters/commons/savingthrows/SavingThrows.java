package br.com.sestaro.characters.commons.savingthrows;

import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.exceptions.NullSavingThrowsException;
import br.com.sestaro.characters.commons.savingthrows.values.SavingThrowsValueHandler;
import br.com.sestaro.characters.commons.savingthrows.values.SavingThrowsValues;

public class SavingThrows {
	private SavingThrowsValues values;

	public SavingThrows(SavingThrowsValues values) {
		if(values == null) {
			throw new NullSavingThrowsException();
		}
		
		this.values = values;
	}
	
	public SavingThrows() {
		this.values = new SavingThrowsValues();
	}
	
	public int getSavingThrowTotal(SavingThrowsNames savingThrowName) {
		return SavingThrowsValueHandler.getSavingThrowByPosition(this.values, savingThrowName);
	}
	
	public void setSavingThrowTotalValue (SavingThrowsNames savingThrowName, int value) {
		SavingThrowsValueHandler.setSavingThrowByPosition(this.values, savingThrowName, value);
	}
}
