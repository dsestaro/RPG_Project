package br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Wisdom subdivision. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class Instinct implements ISpecialization {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
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