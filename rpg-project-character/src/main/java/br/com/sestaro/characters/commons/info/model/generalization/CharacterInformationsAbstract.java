package br.com.sestaro.characters.commons.info.model.generalization;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.com.sestaro.characters.commons.info.model.values.CharacterInformationsValues;

/**
 * Abstract class to interact and manipulate the character information values. 
 * 
 * @author davidson.sestaro
 */
@MappedSuperclass
public abstract class CharacterInformationsAbstract {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @OneToOne(targetEntity = CharacterInformationsValues.class)
  @Cascade(CascadeType.ALL)
  private CharacterInformationsValues values;
  
  /**
   * @return                                   - Id value
   */
  public final Long getId() {
    return id;
  }

  /**
   * @return                                   - Character information values
   */
  public final CharacterInformationsValues getValues() {
    return values;
  }

  /**
   * Set the attributes values.
   * 
   * @param value                               - Character information values
   */
  public final void setValues(final CharacterInformationsValues value) {
    this.values = value;
  }
}
