package br.com.sestaro.characters.commons.info.utils;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;

/**
 * Class to test {@link CharacterInformationUtils}.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationUtilsTest {

  /**
   * Validate if a information is empty.
   */
	@Test(expected = InvalidInformationException.class)
  public final void emptyInformationTest() {
		CharacterInformationUtils.validateInformation("");
	}
	
	/**
   * Validate if a information is null.
   */
	@Test(expected = InvalidInformationException.class)
  public final void nullInformationTest() {
		CharacterInformationUtils.validateInformation(null);
	}
}
