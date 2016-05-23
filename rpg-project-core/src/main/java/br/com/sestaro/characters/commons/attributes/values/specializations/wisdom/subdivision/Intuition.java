package br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.Specialization;

/**
 * Wisdom subdivision. 
 * 
 * @author davidson.sestaro
 */
public class Intuition implements Specialization {
  
  private int intuition;
  private static final String NAME = "Intuition";
  
  /**
   * @param value                              - Intuition value
   */
  public Intuition(final int value) {
    setValue(value);
  }

  /**
   * @return                                   - Return intuition value
   */
  public final int getValue() {
    return this.intuition;
  }
  
  /**
   * @param value                              - Intuition value
   */
  public final void setValue(final int value) {
    AttributesUtils.validateAttributeValue(value);
    this.intuition = value;
  }
  
  /**
   * @return                                   - Return the specialization name
   */
  public final String getName() {
    return NAME;
  }
}

