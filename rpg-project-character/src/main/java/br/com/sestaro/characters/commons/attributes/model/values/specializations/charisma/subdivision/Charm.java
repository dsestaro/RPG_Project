package br.com.sestaro.characters.commons.attributes.model.values.specializations.charisma.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Charisma subdivision. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class Charm implements ISpecialization {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
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
