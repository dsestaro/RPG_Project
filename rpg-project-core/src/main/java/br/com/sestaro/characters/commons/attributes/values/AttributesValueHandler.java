package br.com.sestaro.characters.commons.attributes.values;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeNameException;

/**
 * Class to handle the values in difference attributes and specializations.
 * 
 * @author davidson.sestaro
 */
public final class AttributesValueHandler {
  
  /**
   * Constructor to prevent class instantiation.
   */
  private AttributesValueHandler() {
  }
  
  /**
   * Class that given a {@link AttributesValues} will give the attribute value corresponding to the name.
   * 
   * @param value1                                      - Class with the attribute values  
   * @param value2                                      - Name of the desired attribute
   * @return                                            - Attribute value
   */
	public static int getAttributeByPosition(final AttributesValues value1, final AttributesNames value2) {
		switch(value2) {
			case STRENGTH:
				return value1.getStrength().getStrength();
			case STRENGTH_PHYSICALSTRENGTH:
				return value1.getStrength().getPhysicalStrength();
			case STRENGTH_ENDURANCE:
				return value1.getStrength().getEndurance();
			case DEXTERITY:
				return value1.getDexterity().getDexterity();
			case DEXTERITY_SPEED:
				return value1.getDexterity().getSpeed();
			case DEXTERITY_COORDINATION:
				return value1.getDexterity().getCoordination();
			case CONSTITUTION:
				return value1.getConstitution().getConstitution();
			case CONSTITUTION_TOUGHNESS:
				return value1.getConstitution().getToughness();
			case CONSTITUTION_RESISTANCE:
				return value1.getConstitution().getResistance();
			case INTELLIGENCE:
				return value1.getIntelligence().getIntelligence();
			case INTELLIGENCE_KNOWLEDGE:
        return value1.getIntelligence().getKnowledge();
			case INTELLIGENCE_LOGIC:
        return value1.getIntelligence().getLogic();
			case WISDOM:
				return value1.getWisdom().getWisdom();
			case WISDOM_INSTINCT:
        return value1.getWisdom().getInstinct();
			case WISDOM_INTUITION:
        return value1.getWisdom().getIntuition();
			case CHARISMA:
				return value1.getCharisma();
			default:
			  throw new InvalidAttributeNameException();
		}
	}
	
	/**
   * Class that given a {@link AttributesValues} will add a value to the attribute of corresponding name.
   * 
   * @param value1                                      - Class with the attribute values  
   * @param value2                                      - Name of the desired attribute
   * @param value3                                      - Value to add to the attribute
   */
	public static void addAttributeByPosition(final AttributesValues value1, final AttributesNames value2, final int value3) {
		switch(value2) {
			case STRENGTH_PHYSICALSTRENGTH:
				value1.getStrength().addPhysicalStrength(value3);
				return;
			case STRENGTH_ENDURANCE:
				value1.getStrength().addEndurance(value3);
				return;
			case DEXTERITY_SPEED:
				value1.getDexterity().addSpeed(value3);
				return;
			case DEXTERITY_COORDINATION:
				value1.getDexterity().addCoordination(value3);
				return;
			case CONSTITUTION_TOUGHNESS:
				value1.getConstitution().addToughness(value3);
				return;
			case CONSTITUTION_RESISTANCE:
				value1.getConstitution().addResistance(value3);
				return;
			case INTELLIGENCE_KNOWLEDGE:
				value1.getIntelligence().addKnowledge(value3);
				return;
			case INTELLIGENCE_LOGIC:
			  value1.getIntelligence().addLogic(value3);
        return;
			case WISDOM_INSTINCT:
				value1.getWisdom().addInstinct(value3);
				return;
			case WISDOM_INTUITION:
			  value1.getWisdom().addIntuition(value3);
        return;
			case CHARISMA:
				value1.setCharisma(getAttributeByPosition(value1, value2) + value3);
				return;
			default:
				throw new InvalidAttributeNameException();
		}
	}
}
