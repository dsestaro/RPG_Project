package br.com.sestaro.characters.commons.savingthrows.values;

import br.com.sestaro.characters.commons.attributes.model.exceptions.InvalidAttributeNameException;
import br.com.sestaro.characters.commons.savingthrows.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.exceptions.InvalidSavingThrowNameException;

/**
 * Class to handle the values in difference saving throws.
 * 
 * @author davidson.sestaro
 */
public final class SavingThrowsValueHandler {
	
  /**
   * Constructor to prevent class instantiation.
   */
  private SavingThrowsValueHandler() {
  }
  
  /**
   * Class that given a {@link SavingThrowsValues} will give the saving throw value corresponding to the name.
   * 
   * @param value1                                      - Class with the saving throw values  
   * @param value2                                      - Name of the desired saving throw
   * @return                                            - Attribute value
   */
  public static int getSavingThrowByPosition(final SavingThrowsValues value1, final SavingThrowsNames value2) {
		switch(value2) {
			case FORTITUDE:
				return value1.getFortitude();
			case REFLEX:
				return value1.getReflex();
			case WILL:
				return value1.getWill();
			default:
			  throw new InvalidSavingThrowNameException();
		}
	}
	
  /**
   * Class that given a {@link SavingThrowsValues} will add a value to the saving throw of corresponding name.
   * 
   * @param value1                                      - Class with the saving throws values  
   * @param value2                                      - Name of the desired saving throw
   * @param value3                                      - Value to add to the saving throw
   */
	public static void setSavingThrowByPosition(final SavingThrowsValues value1, 
	    final SavingThrowsNames value2, final int value3) {
		switch(value2) {
			case FORTITUDE:
				value1.setFortitude(value3);
				return;
			case REFLEX:
				value1.setReflex(value3);
				return;
			case WILL:
				value1.setWill(value3);
				return;
      default:
        throw new InvalidAttributeNameException();
  	}
	}
}
