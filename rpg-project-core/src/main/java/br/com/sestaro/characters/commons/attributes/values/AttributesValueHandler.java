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
				return values.getDexterity().getDexterity();
			case DEXTERITY_SPEED:
				return values.getDexterity().getSpeed();
			case DEXTERITY_COORDINATION:
				return values.getDexterity().getCoordination();
			case CONSTITUTION:
				return values.getConstitution().getConstitution();
			case CONSTITUTION_TOUGHNESS:
				return values.getConstitution().getToughness();
			case CONSTITUTION_RESISTANCE:
				return values.getConstitution().getResistance();
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
			case DEXTERITY_SPEED:
				values.getDexterity().addSpeed(value);
				return;
			case DEXTERITY_COORDINATION:
				values.getDexterity().addCoordination(value);
				return;
			case CONSTITUTION_TOUGHNESS:
				values.getConstitution().addToughness(value);
				return;
			case CONSTITUTION_RESISTANCE:
				values.getConstitution().addResistance(value);
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
