package br.com.sestaro.characters.commons.attributes.exceptions;

public class NegativeAttributeValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NegativeAttributeValueException() {
		super("The attribute value cannot be negative!");
	}
}