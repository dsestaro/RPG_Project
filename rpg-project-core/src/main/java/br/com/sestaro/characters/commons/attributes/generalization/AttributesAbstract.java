package br.com.sestaro.characters.commons.attributes.generalization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.sestaro.characters.commons.attributes.values.AttributesValues;

/**
 * Abstract class to interact and manipulate the attribute values. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class AttributesAbstract {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @ManyToOne(targetEntity = AttributesValues.class)
  private AttributesValues values;
  
  /**
   * @return                                   - Id value
   */
  public final Long getId() {
    return id;
  }

  /**
   * @return                                   - Attribute values
   */
  public final AttributesValues getValues() {
    return values;
  }

  /**
   * Set the attributes values.
   * 
   * @param value                               - Attribute values
   */
  public final void setValues(final AttributesValues value) {
    this.values = value;
  }
}
