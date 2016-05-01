package br.com.sestaro.characters.commons.attributes.values;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeNameException;

public class AttributesValueHandler {
	public static int getAttributeByPosition(AttributesValues values, AttributesNames attributeName) {
		switch(attributeName) {
			case STRENGTH:
				return values.getStrength().getStrength();
			case STRENGTH_PHYSICALSTRENGTH:
				return values.getStrength().getPhysicalStrength();
			case STRENGTH_ENDURANCE:
				return values.getStrength().getEndurance();
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
			case STRENGTH_PHYSICALSTRENGTH:
				values.getStrength().addPhysicalStrength(value);
				return;
			case STRENGTH_ENDURANCE:
				values.getStrength().addEndurance(value);
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
			default:
				throw new InvalidAttributeNameException();
		}
	}
}
