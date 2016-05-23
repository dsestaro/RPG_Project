package br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.Specialization;

/**
 * Wisdom subdivision. 
 * 
 * @author davidson.sestaro
 */
public class Instinct implements Specialization {
  
  private int instinct;
  private static final String NAME = "Instinct";
  
  /**
   * @param value                              - Instinct value
   */
  public Instinct(final int value) {
    setValue(value);
  }

  /**
   * @return                                   - Return instinct value
   */
  public final int getValue() {
    return this.instinct;
  }
  
  /**
   * @param value                              - Instinct value
   */
  public final void setValue(final int value) {
    AttributesUtils.validateAttributeValue(value);
    this.instinct = value;
  }
  
  /**
   * @return                                   - Return the specialization name
   */
  public final String getName() {
    return NAME;
  }
}