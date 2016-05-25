package br.com.sestaro.characters.commons.attributes.exceptions;

/**
 * Exception to handle invalid attribute values. 
 * 
 * @author davidson.sestaro
 */
public class NullAttributeValueException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   * 
   * @param name                                - Name of the attribute.
   */
  public NullAttributeValueException(final String name) {
    super("The following attributes cannot be null: " + name);
  }
}
