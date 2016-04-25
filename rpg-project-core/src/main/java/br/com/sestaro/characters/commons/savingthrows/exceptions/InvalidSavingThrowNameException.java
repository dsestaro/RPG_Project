package br.com.sestaro.characters.commons.savingthrows.exceptions;

public class InvalidSavingThrowNameException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidSavingThrowNameException() {
		super("The saving throw name dont exist!");
	}
}