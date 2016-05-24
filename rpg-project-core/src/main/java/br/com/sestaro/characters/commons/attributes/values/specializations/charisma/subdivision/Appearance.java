package br.com.sestaro.characters.commons.attributes.values.specializations.charisma.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Charisma subdivision. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class Appearance implements ISpecialization {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
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
