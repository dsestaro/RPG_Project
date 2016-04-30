package br.com.sestaro.characters.commons.attributes.utils;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
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
	
	public static void initialValidations(Specialization specialization1, Specialization specialization2) {
		
		if(specialization1.getValue() > 18 && specialization1.getValue() != specialization2.getValue()) {
			throw new InvalidAttributeValueException(specialization1.getName());
		}
		
		if(specialization2.getValue() > 18 && specialization2.getValue() != specialization1.getValue()) {
			throw new InvalidAttributeValueException(specialization2.getName());
		}
		
		if(specialization1.getValue() - 4 > specialization2.getValue()) {
			throw new InvalidAttributeValueException(specialization1.getName(), specialization2.getName());
		}
		
		if(specialization2.getValue() - 4 > specialization1.getValue()) {
			throw new InvalidAttributeValueException(specialization2.getName(), specialization1.getName());
		}
	}
}
