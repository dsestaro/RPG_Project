package br.com.sestaro.characters.commons.savingthrows.model.exceptions;

/**
 * Exception to handle invalid saving throw names. 
 * 
 * @author davidson.sestaro
 */
public class InvalidSavingThrowNameException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
   * Default constructor.
   */
	public InvalidSavingThrowNameException() {
		super("The saving throw name dont exist!");
	}
}