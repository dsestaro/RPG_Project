package br.com.sestaro.characters.commons.savingthrows.exceptions;

/**
 * Exception to handle null saving throw values. 
 * 
 * @author davidson.sestaro
 */
public class NullSavingThrowsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
   * Default constructor.
   */
	public NullSavingThrowsException() {
		super("The savings throws variable cannot be null!");
	}
}
