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
	
	public static void addAttributeByPosition(AttributesValues values, AttributesNames attributeName, int value) {
		switch(attributeName) {
			case STRENGTH:
				values.setStrength(getAttributeByPosition(values, attributeName) + value);
				return;
			case DEXTERITY:
				values.setDexterity(getAttributeByPosition(values, attributeName) + value);
				return;
			case CONSTITUTION:
				values.setConstitution(getAttributeByPosition(values, attributeName) + value);
				return;
			case INTELLIGENCE:
				values.setIntelligence(getAttributeByPosition(values, attributeName) + value);
				return;
			case WISDOM:
				values.setWisdom(getAttributeByPosition(values, attributeName) + value);
				return;
			case CHARISMA:
				values.setCharisma(getAttributeByPosition(values, attributeName) + value);
				return;
		}
		
		throw new InvalidAttributeNameException();
	}
}
