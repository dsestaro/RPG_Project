package main.java.br.com.sestaro.characters.commons.attributes.exceptions;

public class NullAttributesException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NullAttributesException() {
		super("The attribute variable cannot be null!");
	}
}
