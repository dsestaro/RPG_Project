package br.com.sestaro.characters.commons.attributes.model.exceptions;

/**
 * Exception to handle negative value to attributes.
 * 
 * @author davidson.sestaro
 */
public class NegativeAttributeValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public NegativeAttributeValueException() {
		super("The attribute value cannot be negative!");
	}
}
