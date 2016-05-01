package br.com.sestaro.characters.commons.attributes.utils;

import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.ATTRIBUTE_DEFAULT;
import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.NEGATIVE_LIMIAR;
import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.MAX_INITIAL_VALUE;
import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.MAX_INITIAL_DIF;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;

/**
 * Class with generic methods to hadle attributes values.
 * 
 * @author davidson.sestaro
 */
public final class AttributesUtils {
  
  /**
   * Constructor to prevent class instantiation.
   */
	private AttributesUtils() {
  }

	/**
	 * Method that validate if a given attribute value is not negative.
	 * 
	 * @param value                                    - Attribute value
	 */
  public static void validateAttributeValue(final int value) {
		if (value < NEGATIVE_LIMIAR) {
			throw new NegativeAttributeValueException();
		}
	}
	
  /**
   * Method that given attribute value return it's modifier.
   * 
   * @param value                                    - Attribute value
   * 
   * @return                                         - Attribute modifier
   */
	public static int calculateModifier(final int value) {
		return (value - ATTRIBUTE_DEFAULT) / 2;
	}
	
	/**
	 * Validate the initial configurations of specializations of an attribute.
	 * 
	 * @param specialization1                          - Attribute specialization
	 * @param specialization2                          - Attribute specialization
	 */
	public static void initialValidations(final Specialization specialization1, final Specialization specialization2) {
		
		if (specialization1.getValue() > MAX_INITIAL_VALUE && specialization1.getValue() != specialization2.getValue()) {
			throw new InvalidAttributeValueException(specialization1.getName());
		}
		
		if (specialization2.getValue() > MAX_INITIAL_VALUE && specialization2.getValue() != specialization1.getValue()) {
			throw new InvalidAttributeValueException(specialization2.getName());
		}
		
		if (specialization1.getValue() - MAX_INITIAL_DIF > specialization2.getValue()) {
			throw new InvalidAttributeValueException(specialization1.getName(), specialization2.getName());
		}
		
		if (specialization2.getValue() - MAX_INITIAL_DIF > specialization1.getValue()) {
			throw new InvalidAttributeValueException(specialization2.getName(), specialization1.getName());
		}
	}
}
