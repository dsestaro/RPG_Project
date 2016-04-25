package br.com.sestaro.characters.commons.info.utils;

import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;

public class CharacterInformationUtils {
	
	public static void validateInformation(String name) {
		if(name == null || name.isEmpty()) {
			throw new InvalidInformationException();
		}
	}
}
