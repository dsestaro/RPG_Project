package br.com.sestaro.characters.commons.attributes.values.specializations.charisma;

import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.subdivision.Appearance;
import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.subdivision.Charm;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations.AttributeAbstract;

/**
 * Attribute charisma class.
 *  
 * @author davidson.sestaro
 */
public class Charisma extends AttributeAbstract {
  
  private static final String NAME = "CHA";
  
  /**
   * @param value1                                - Appearance value
   * @param value2                                - Charm value 
   */
  public Charisma(final int value1, final int value2) {
    super(new Appearance(value1), new Charm(value2));
  }
  
  /**
   * Calculate the charisma based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the charisma value
   */
  public final int getCharisma() {
    return this.getAttributeValue();
  }

  /**
   * Add the param value to the existing appearance.
   * 
   * @param value                                 - Increment value
   */
  public final void addAppearance(final int value) {
    this.addValueSpecialization(getSpecialization1(), value);
  }
  
  /**
   * Add the param value to the existing charm.
   * 
   * @param value                                 - Increment value
   */
  public final void addCharm(final int value) {
    this.addValueSpecialization(getSpecialization2(), value);
  }

  /**
   * @return                                      - Appearance value
   */
  public final int getAppearance() {
    return this.getSpecialization1().getValue();
  }

  /**
   * @return                                      - Charm value
   */
  public final int getCharm() {
    return this.getSpecialization2().getValue();
  }
  
  /**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}

