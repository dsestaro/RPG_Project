package br.com.sestaro.characters.commons.info;

import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.values.CharacterInformationsValues;

/**
 * Class to interact and manipulate the character information. 
 * 
 * @author davidson.sestaro
 */
public class CharacterInformations {
	private CharacterInformationsValues values;

	/**
	 * @param value                                          - Character infomration values
	 */
	public CharacterInformations(final CharacterInformationsValues value) {
		if (value == null) {
			throw new InvalidInformationException();
		}
		
		this.values = value;
	}

	/**
	 * @return                                                - Character information values
	 */
	public final CharacterInformationsValues getValues() {
		return values;
	}
}
