package br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.Specialization;

/**
 * Class to define common attributes methods.
 *  
 * @author davidson.sestaro
 */
public abstract class Attribute {
  
  /**
   * @param spec1                                - First specialization value
   * @param spec2                                - Second specialization value 
   */
  public Attribute(final Specialization spec1, final Specialization spec2) {
    AttributesUtils.initialValidations(spec1, spec2);
  }
}