package br.com.sestaro.characters.commons.attributes.exceptions;

public class InvalidAttributeValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAttributeValueException(String specialization1, String specialization2) {
		super("The " + specialization1 + " the value can not be 4 higher points than " + specialization2 + ".");
	}
	
	public InvalidAttributeValueException(String specialization) {
		super("The " + specialization + "can not be higher points than 18 points.");
	}
}
