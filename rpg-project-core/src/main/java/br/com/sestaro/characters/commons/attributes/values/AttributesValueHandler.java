package br.com.sestaro.characters.commons.attributes.values;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeNameException;

public class AttributesValueHandler {
	public static int getAttributeByPosition(AttributesValues values, AttributesNames attributeName) {
		switch(attributeName) {
			case STRENGTH:
				return values.getStrength();
			case DEXTERITY:
				return values.getDexterity();
			case CONSTITUTION:
				return values.getConstitution();
			case INTELLIGENCE:
				return values.getIntelligence();
			case WISDOM:
				return values.getWisdom();
			case CHARISMA:
				return values.getCharisma();
		}
		
		throw new InvalidAttributeNameException();
	}
}
