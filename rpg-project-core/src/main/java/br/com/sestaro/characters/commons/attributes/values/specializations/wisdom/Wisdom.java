package br.com.sestaro.characters.commons.attributes.values.specializations.wisdom;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.subdivision.Instinct;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.subdivision.Intuition;

/**
 * Attribute wisdom class.
 *  
 * @author davidson.sestaro
 */
public class Wisdom {

  private Instinct instinct;
  private Intuition intuition;
  private static final String NAME = "WIS";
  
  /**
   * @param value1                                - Instinct value
   * @param value2                                - Intuition value 
   */
  public Wisdom(final int value1, final int value2) {
    this.instinct = new Instinct(value1);
    this.intuition = new Intuition(value2);

    AttributesUtils.initialValidations(this.instinct, this.intuition);
  }
  
  /**
   * Calculate the wisdom based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the wisdom value
   */
  public final int getWisdom() {
    return (instinct.getValue() + intuition.getValue()) / 2;
  }

  /**
   * Add the param value to the existing instinct.
   * 
   * @param value                                 - Increment value
   */
  public final void addInstinct(final int value) {
    this.instinct.setValue(instinct.getValue() + value);
  }
  
  /**
   * Add the param value to the existing untuition.
   * 
   * @param value                                 - Increment value
   */
  public final void addIntuition(final int value) {
    this.intuition.setValue(intuition.getValue() + value);
  }

  /**
   * @return                                     - Instinct value
   */
  public final int getInstinct() {
    return instinct.getValue();
  }

  /**
   * @return                                     - Intuition value
   */
  public final int getIntuition() {
    return intuition.getValue();
  }
  
  /**
   * @return                                      - Return the specialization name
   */
  public  static final String getName() {
    return NAME;
  }
}

