package br.com.sestaro.character.commons.info.utils;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.utils.CharacterInformationUtils;

public class CharacterInformationUtilsTest {

	@Test(expected=InvalidInformationException.class)
	public void emptyInformationTest() {
		CharacterInformationUtils.validateInformation("");
	}
	
	@Test(expected=InvalidInformationException.class)
	public void nullInformationTest() {
		CharacterInformationUtils.validateInformation(null);
	}
}
