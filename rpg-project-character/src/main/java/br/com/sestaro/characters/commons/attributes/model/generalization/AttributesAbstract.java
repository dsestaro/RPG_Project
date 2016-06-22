package br.com.sestaro.characters.commons.attributes.model.generalization;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.com.sestaro.characters.commons.attributes.model.values.AttributesValues;

/**
 * Abstract class to interact and manipulate the attribute values. 
 * 
 * @author davidson.sestaro
 */
@MappedSuperclass
public abstract class AttributesAbstract {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @OneToOne(targetEntity = AttributesValues.class)
  @Cascade(CascadeType.ALL)
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
