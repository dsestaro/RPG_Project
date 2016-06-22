package br.com.sestaro.characters.commons.info.model.exceptions;

/**
 * Exception to handle invalid character information. 
 * 
 * @author davidson.sestaro
 */
public class InvalidInformationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
   * Default constructor.
   */
	public InvalidInformationException() {
		super("Invalid information, the variable cannot be null or empty!");
	}
}
