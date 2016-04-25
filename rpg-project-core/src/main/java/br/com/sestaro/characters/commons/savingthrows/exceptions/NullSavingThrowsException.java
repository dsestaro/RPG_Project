package br.com.sestaro.characters.commons.savingthrows.exceptions;

public class NullSavingThrowsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NullSavingThrowsException() {
		super("The savings throws variable cannot be null!");
	}
}
