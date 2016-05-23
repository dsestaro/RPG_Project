package br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Class to define common attributes methods.
 *  
 * @author davidson.sestaro
 */
public abstract class AttributeAbstract {
  
  private ISpecialization specialization1;
  private ISpecialization specialization2;
  
  /**
   * @param spec1                                - First specialization value
   * @param spec2                                - Second specialization value 
   */
  public AttributeAbstract(final ISpecialization spec1, final ISpecialization spec2) {
    AttributesUtils.initialValidations(spec1, spec2);
    
    this.specialization1 = spec1;
    this.specialization2 = spec2;
  }

  /**
   * Get the first specialization of a given attribute.
   * 
   * @return                                     - Specialization instance.
   */
  protected final ISpecialization getSpecialization1() {
    return specialization1;
  }

  /**
   * Get the second specialization of a given attribute.
   * 
   * @return                                     - Specialization instance.
   */
  protected final ISpecialization getSpecialization2() {
    return specialization2;
  }
  
  /**
   * Get the attribute value based on the mean of the two specializations.
   * 
   * @return                                     - Attribute value.
   */
  protected final int getAttributeValue() {
    return (this.getSpecialization1().getValue() + this.getSpecialization2().getValue()) / 2;
  }
  
  /**
   * Add the given value to the given specializations.
   * 
   * @param spec                                 - Specialization
   * @param value                                - Value
   */
  protected final void addValueSpecialization(final ISpecialization spec, final int value) {
    spec.setValue(spec.getValue() + value);
  }
}