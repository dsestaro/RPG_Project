package br.com.sestaro.characters.commons.attributes.exceptions;

/**
 * Exception to handle invalid value to attributes.
 * 
 * @author davidson.sestaro
 */
public class InvalidAttributeValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * @param specialization1                      - Attribute specialization that violate the rule
	 * @param specialization2                      - The second attribute specialization
	 */
	public InvalidAttributeValueException(final String specialization1, final String specialization2) {
		super("The " + specialization1 + " the value can not be 4 higher points than " + specialization2 + ".");
	}
	
	/**
   * @param specialization                       - Attribute specialization that violate the rule
   */
	public InvalidAttributeValueException(final String specialization) {
		super("The " + specialization + "can not be higher points than 18 points.");
	}
}
