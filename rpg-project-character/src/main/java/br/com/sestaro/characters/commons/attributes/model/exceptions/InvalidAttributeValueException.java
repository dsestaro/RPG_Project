package br.com.sestaro.characters.commons.attributes.model.exceptions;

/**
 * Exception to handle invalid value to attributes.
 * 
 * @author davidson.sestaro
 */
public class InvalidAttributeValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * @param value1                      - Attribute specialization that violate the rule
	 * @param value2                      - The second attribute specialization
	 */
	public InvalidAttributeValueException(final String value1, final String value2) {
		super("The " + value1 + " the value can not be 4 higher points than " + value2 + ".");
	}
	
	/**
   * @param value                       - Attribute specialization that violate the rule
   */
	public InvalidAttributeValueException(final String value) {
		super("The " + value + "can not be higher points than 18 points.");
	}
}
