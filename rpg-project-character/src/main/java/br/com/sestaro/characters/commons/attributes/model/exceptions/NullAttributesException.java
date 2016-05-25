package br.com.sestaro.characters.commons.attributes.model.exceptions;

/**
 * Exception to handle null value to attributes.
 * 
 * @author davidson.sestaro
 */
public class NullAttributesException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public NullAttributesException() {
		super("The attribute variable cannot be null!");
	}
}
