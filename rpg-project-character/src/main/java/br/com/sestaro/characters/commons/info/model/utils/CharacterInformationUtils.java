package br.com.sestaro.characters.commons.info.model.utils;

import br.com.sestaro.characters.commons.info.model.exceptions.InvalidInformationException;

/**
* Class with methods to validate information.
* 
* @author davidson.sestaro
*/
public final class CharacterInformationUtils {

  private static final int MIN_LENTH = 3;
  
  /**
   * Constructor to prevent class instantiation.
   */
  private CharacterInformationUtils() {
  }
  
  /**
   * @param value                                         - validate if the value is null or empty
   */
	public static void validateInformation(final String value) {
		if (value == null || value.isEmpty() || value.length() < MIN_LENTH) {
			throw new InvalidInformationException();
		}
	}
}
