package br.com.sestaro.characters.commons.info.utils;

import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;

/**
* Class with methods to validate information.
* 
* @author davidson.sestaro
*/
public final class CharacterInformationUtils {

  /**
   * Constructor to prevent class instantiation.
   */
  private CharacterInformationUtils() {
  }
  
  /**
   * @param value                                         - validate if the value is null or empty
   */
	public static void validateInformation(final String value) {
		if (value == null || value.isEmpty()) {
			throw new InvalidInformationException();
		}
	}
}
