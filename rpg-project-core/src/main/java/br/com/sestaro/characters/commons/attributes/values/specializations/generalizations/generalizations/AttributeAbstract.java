package br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Class to define common attributes methods.
 *  
 * @author davidson.sestaro
 */
public abstract class AttributeAbstract {
  
  /**
   * @param spec1                                - First specialization value
   * @param spec2                                - Second specialization value 
   */
  public AttributeAbstract(final ISpecialization spec1, final ISpecialization spec2) {
    AttributesUtils.initialValidations(spec1, spec2);
  }
}