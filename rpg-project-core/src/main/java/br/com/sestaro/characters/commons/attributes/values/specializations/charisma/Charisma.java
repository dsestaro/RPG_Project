package br.com.sestaro.characters.commons.attributes.values.specializations.charisma;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.subdivision.Appearance;
import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.subdivision.Charm;

/**
 * Attribute charisma class.
 *  
 * @author davidson.sestaro
 */
public class Charisma {
  
  private Appearance appearance;
  private Charm charm;
  private static final String NAME = "CHA";
  
  /**
   * @param value1                                - Appearance value
   * @param value2                                - Charm value 
   */
  public Charisma(final int value1, final int value2) {
    this.appearance = new Appearance(value1);
    this.charm = new Charm(value2);

    AttributesUtils.initialValidations(this.appearance, this.charm);
  }
  
  /**
   * Calculate the charisma based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the charisma value
   */
  public final int getCharisma() {
    return (appearance.getValue() + charm.getValue()) / 2;
  }

  /**
   * Add the param value to the existing appearance.
   * 
   * @param value                                 - Increment value
   */
  public final void addAppearance(final int value) {
    this.appearance.setValue(appearance.getValue() + value);
  }
  
  /**
   * Add the param value to the existing charm.
   * 
   * @param value                                 - Increment value
   */
  public final void addCharm(final int value) {
    this.charm.setValue(charm.getValue() + value);
  }

  /**
   * @return                                      - Appearance value
   */
  public final int getAppearance() {
    return appearance.getValue();
  }

  /**
   * @return                                      - Charm value
   */
  public final int getCharm() {
    return charm.getValue();
  }
  
  /**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}

