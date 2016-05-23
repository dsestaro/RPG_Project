package br.com.sestaro.characters.commons.attributes.values.specializations.wisdom;

import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations.AttributeAbstract;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.subdivision.Instinct;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.subdivision.Intuition;

/**
 * Attribute wisdom class.
 *  
 * @author davidson.sestaro
 */
public class Wisdom extends AttributeAbstract {

  private static final String NAME = "WIS";
  
  /**
   * @param value1                                - Instinct value
   * @param value2                                - Intuition value 
   */
  public Wisdom(final int value1, final int value2) {
    super(new Instinct(value1), new Intuition(value2));
  }
  
  /**
   * Calculate the wisdom based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the wisdom value
   */
  public final int getWisdom() {
    return this.getAttributeValue();
  }

  /**
   * Add the param value to the existing instinct.
   * 
   * @param value                                 - Increment value
   */
  public final void addInstinct(final int value) {
    this.addValueSpecialization(getSpecialization1(), value);
  }
  
  /**
   * Add the param value to the existing untuition.
   * 
   * @param value                                 - Increment value
   */
  public final void addIntuition(final int value) {
    this.addValueSpecialization(getSpecialization2(), value);
  }

  /**
   * @return                                      - Instinct value
   */
  public final int getInstinct() {
    return this.getSpecialization1().getValue();
  }

  /**
   * @return                                      - Intuition value
   */
  public final int getIntuition() {
    return this.getSpecialization2().getValue();
  }
  
  /**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}

