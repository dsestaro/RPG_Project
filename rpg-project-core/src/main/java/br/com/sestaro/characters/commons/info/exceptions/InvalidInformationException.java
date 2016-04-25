package br.com.sestaro.characters.commons.info.exceptions;

public class InvalidInformationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidInformationException() {
		super("Invalid information, the variable cannot be null or empty!");
	}
}
