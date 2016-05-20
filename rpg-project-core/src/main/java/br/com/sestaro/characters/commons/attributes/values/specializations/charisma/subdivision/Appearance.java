package br.com.sestaro.characters.commons.attributes.values.specializations.charisma.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.interfaces.Specialization;

/**
 * Charisma subdivision. 
 * 
 * @author davidson.sestaro
 */
public class Appearance implements Specialization {
  
  private int appearance;
  private static final String NAME = "Appearance";
  
  /**
   * @param value                              - Appearance value
   */
  public Appearance(final int value) {
    setValue(value);
  }

  /**
   * @return                                   - Return appearance value
   */
  public final int getValue() {
    return this.appearance;
  }
  
  /**
   * @param value                              - Appearance value
   */
  public final void setValue(final int value) {
    AttributesUtils.validateAttributeValue(value);
    this.appearance = value;
  }
  
  /**
   * @return                                   - Return the specialization name
   */
  public final String getName() {
    return NAME;
  }
}
