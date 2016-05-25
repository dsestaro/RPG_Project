package br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Dexterity subdivion. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class Speed implements ISpecialization {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
	private int speed;
	private static final String NAME = "Speed";
	
	/**
   * @param value                              - Speed value
   */
	public Speed(final int value) {
		setValue(value);
	}
	
	/**
   * @return                                   - Speed value
   */
	public final int getValue() {
		return this.speed;
	}

	/**
   * @param value                              - Speed value
   */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.speed = value;
	}
	
	/**
   * @return                                   - Return the specialization name
   */
	public final String getName() {
		return NAME;
	}
}
