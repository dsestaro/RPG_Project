package br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Strength subdivision. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class PhysicalStrength implements ISpecialization {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column
	private int physicalStrength;
	private static final String NAME = "Physical Strength";
	
	/**
   * @param value                              - Physical strength value
   */
	public PhysicalStrength(final int value) {
		setValue(value);
	}

	/**
   * @return                                   - Return physical strength value
   */
	public final int getValue() {
		return this.physicalStrength;
	}

	/**
   * @param value                              - Physical Strength value
   */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.physicalStrength = value;
	}
	
	/**
   * @return                                   - Return the specialization name
   */
	public final String getName() {
		return NAME;
	}
}
