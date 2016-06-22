package br.com.sestaro.characters.commons.info.model;

import br.com.sestaro.characters.commons.info.model.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.model.generalization.CharacterInformationsAbstract;
import br.com.sestaro.characters.commons.info.model.values.CharacterInformationsValues;

/**
 * Class to interact and manipulate the character information.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformations extends CharacterInformationsAbstract {
    
    /**
     * @param value
     *            - Character information values
     */
    public CharacterInformations(final CharacterInformationsValues value) {
	if (value == null) {
	    throw new InvalidInformationException();
	}

	setValues(value);
    }
}
