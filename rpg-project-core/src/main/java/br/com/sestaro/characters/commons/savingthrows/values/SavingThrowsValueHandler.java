package br.com.sestaro.characters.commons.savingthrows.values;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeNameException;
import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.exceptions.InvalidSavingThrowNameException;

public class SavingThrowsValueHandler {
	public static int getSavingThrowByPosition(SavingThrowsValues values, SavingThrowsNames savingThrowName) {
		switch(savingThrowName) {
			case FORTITUDE:
				return values.getFortitude();
			case REFLEX:
				return values.getReflex();
			case WILL:
				return values.getWill();
		}
		
		throw new InvalidSavingThrowNameException();
	}
	
	public static void setSavingThrowByPosition(SavingThrowsValues values, SavingThrowsNames savingThrowName, int value) {
		switch(savingThrowName) {
			case FORTITUDE:
				values.setFortitude(value);
				return;
			case REFLEX:
				values.setReflex(value);
				return;
			case WILL:
				values.setWill(value);
				return;
		}
		
		throw new InvalidAttributeNameException();
	}
}
