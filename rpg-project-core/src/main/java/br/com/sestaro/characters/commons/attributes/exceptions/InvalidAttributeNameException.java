package br.com.sestaro.characters.commons.attributes.exceptions;

public class InvalidAttributeNameException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAttributeNameException() {
		super("The attribute name dont exist!");
	}
}