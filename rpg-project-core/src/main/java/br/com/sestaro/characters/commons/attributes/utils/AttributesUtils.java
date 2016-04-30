package br.com.sestaro.characters.commons.attributes.utils;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision.Endurance;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision.PhysicalStrength;

public class AttributesUtils {

	public static void validateAttributeValue(int value) {
		if(value < 0) {
			throw new NegativeAttributeValueException();
		}
	}
	
	public static int calculateModifier(int value) {
		return (value - 10) / 2;
	}
	
	public static void initialValidations(int specializationValue1, int specializationValue2, String specializationName1, String specializationName2) {
		if(specializationValue1 > 18 && specializationValue1 != specializationValue2) {
			throw new InvalidAttributeValueException(specializationName1);
		}
		
		if(specializationValue1 > 18 && specializationValue1 != specializationValue2) {
			throw new InvalidAttributeValueException(specializationName2);
		}
		
		if(specializationValue1 - 4 > specializationValue2) {
			throw new InvalidAttributeValueException(specializationName1, specializationName2);
		}
		
		if(specializationValue2 - 4 > specializationValue1) {
			throw new InvalidAttributeValueException(specializationName2, specializationName1);
		}
	}
}
