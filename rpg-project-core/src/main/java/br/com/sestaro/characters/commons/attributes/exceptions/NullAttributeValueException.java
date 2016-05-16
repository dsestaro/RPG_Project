package br.com.sestaro.characters.commons.attributes.exceptions;

import java.util.Set;

import org.apache.commons.validator.ValidatorResults;

public class NullAttributeValueException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public NullAttributeValueException(final ValidatorResults results) {
    super(formatResult(results));
  }

  private static String formatResult(final ValidatorResults results) {
    Set<String> names = results.getPropertyNames();

    String error = "The following attributes cannot be null: ";

    for (String name : names) {
      error = error.concat(name + " ");
    }
    
    return error;
  }
}
