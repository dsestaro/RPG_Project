package br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Constituion subdivion. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class Toughness implements ISpecialization {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
	private int health;
	private static final String NAME = "Toughness";
	
	/**
   * @param value                              - Toughness value
   */
  public Toughness(final int value) {
		setValue(value);
	}
	
  /**
   * @return                                   - Toughness value
   */
  public final int getValue() {
		return this.health;
	}

  /**
   * @param value                              - Toughness value
   */
  public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.health = value;
	}

  /**
   * @return                                   - Return the specialization name
   */
  public final String getName() {
		return NAME;
	}
}
