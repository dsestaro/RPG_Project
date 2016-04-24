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
				values.setStrength(values.getStrength() + value);
				return;
			case DEXTERITY:
				values.setDexterity(values.getDexterity() + value);
				return;
			case CONSTITUTION:
				values.setConstitution(values.getConstitution() + value);
				return;
			case INTELLIGENCE:
				values.setIntelligence(values.getIntelligence() + value);
				return;
			case WISDOM:
				values.setWisdom(values.getWisdom() + value);
				return;
			case CHARISMA:
				values.setCharisma(values.getCharisma() + value);
				return;
		}
		
		throw new InvalidAttributeNameException();
	}
}
