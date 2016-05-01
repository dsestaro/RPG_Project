package br.com.sestaro.characters.commons.attributes.exceptions;

/**
 * Exception to handle invalid attribute names. 
 * 
 * @author davidson.sestaro
 */
public class InvalidAttributeNameException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public InvalidAttributeNameException() {
		super("The attribute name dont exist!");
	}
}