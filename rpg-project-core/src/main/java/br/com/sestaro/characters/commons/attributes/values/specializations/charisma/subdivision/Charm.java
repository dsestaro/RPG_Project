package br.com.sestaro.characters.commons.attributes.values.specializations.charisma.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.Specialization;

/**
 * Charisma subdivision. 
 * 
 * @author davidson.sestaro
 */
public class Charm implements Specialization {
  
  private int charm;
  private static final String NAME = "Charm";
  
  /**
   * @param value                              - Instinct value
   */
  public Charm(final int value) {
    setValue(value);
  }

  /**
   * @return                                   - Return charm value
   */
  public final int getValue() {
    return this.charm;
  }
  
  /**
   * @param value                              - Charm value
   */
  public final void setValue(final int value) {
    AttributesUtils.validateAttributeValue(value);
    this.charm = value;
  }
  
  /**
   * @return                                   - Return the specialization name
   */
  public final String getName() {
    return NAME;
  }
}
