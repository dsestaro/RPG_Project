package br.com.sestaro.characters.commons.attributes.utils;

import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.ATTRIBUTE_DEFAULT;
import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.MAX_INITIAL_DIF;
import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.MAX_INITIAL_VALUE;
import static br.com.sestaro.characters.commons.attributes.utils.AttributesUtilsConstantValues.NEGATIVE_LIMIAR;

import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.values.specializations.interfaces.Specialization;

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
	 * @param value1                                   - Attribute specialization
	 * @param value2                                   - Attribute specialization
	 */
	public static void initialValidations(final Specialization value1, final Specialization value2) {
		
		if (value1.getValue() > MAX_INITIAL_VALUE && value1.getValue() != value2.getValue()) {
			throw new InvalidAttributeValueException(value1.getName());
		}
		
		if (value2.getValue() > MAX_INITIAL_VALUE && value2.getValue() != value1.getValue()) {
			throw new InvalidAttributeValueException(value2.getName());
		}
		
		if (value1.getValue() - MAX_INITIAL_DIF > value2.getValue()) {
			throw new InvalidAttributeValueException(value1.getName(), value2.getName());
		}
		
		if (value2.getValue() - MAX_INITIAL_DIF > value1.getValue()) {
			throw new InvalidAttributeValueException(value2.getName(), value1.getName());
		}
	}
}
