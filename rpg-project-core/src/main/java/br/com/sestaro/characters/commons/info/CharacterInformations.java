package br.com.sestaro.characters.commons.info;

import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.values.CharacterInformationsValues;

public class CharacterInformations {
	private CharacterInformationsValues values;

	public CharacterInformations(CharacterInformationsValues values) {
		if(values == null) {
			throw new InvalidInformationException();
		}
		
		this.values = values;
	}

	public CharacterInformationsValues getValues() {
		return values;
	}
}
