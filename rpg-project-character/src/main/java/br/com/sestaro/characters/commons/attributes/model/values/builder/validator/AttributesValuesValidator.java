package br.com.sestaro.characters.commons.attributes.model.values.builder.validator;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.util.ValidatorUtils;

/**
 * Class to validate attributes informations using Apache Validator.
 * 
 * @author davidson.sestaro
 */
public final class AttributesValuesValidator {
  
  /**
   * Default constructor to prevent class instantiation.
   */
  private AttributesValuesValidator() {
    
  }
  
  /**
   * Validate if a parameter is null or empty.
   * 
   * @param bean                                      - Object to be tested
   * @param field                                     - Field that will be tested
   * 
   * @return                                          - Result of the validation
   */
  public static boolean validateRequired(final Object bean, final Field field) {
    String value = ValidatorUtils.getValueAsString(bean, field.getProperty());
    return GenericValidator.isBlankOrNull(value);
  }
}
