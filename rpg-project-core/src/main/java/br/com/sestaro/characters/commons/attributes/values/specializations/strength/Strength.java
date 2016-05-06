package br.com.sestaro.characters.commons.attributes.values.specializations.strength;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision.Endurance;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision.PhysicalStrength;

/**
 * Attribute strength class.
 *  
 * @author davidson.sestaro
 */
public class Strength {
	
  private PhysicalStrength physicalStrength;
	private Endurance endurance;
	
	/**
   * @param value1                                - Physical strength value
   * @param value2                                - Endurance value 
   */
	public Strength(final int value1, final int value2) {
		this.physicalStrength = new PhysicalStrength(value1);
		this.endurance = new Endurance(value2);

		AttributesUtils.initialValidations(this.physicalStrength, this.endurance);
	}
	
	/**
   * Calculate the strength based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the strength value
   */
	public final int getStrength() {
		return (physicalStrength.getValue() + endurance.getValue()) / 2;
	}

	/**
   * Add the param value to the existing physical strength.
   * 
   * @param value                                 - Increment value
   */
	public final void addPhysicalStrength(final int value) {
		this.physicalStrength.setValue(physicalStrength.getValue() + value);
	}
	
	/**
   * Add the param value to the existing endurance.
   * 
   * @param value                                 - Increment value
   */
	public final void addEndurance(final int value) {
		this.endurance.setValue(endurance.getValue() + value);
	}

	/**
   * @return                                     - Physical strength value
   */
	public final int getPhysicalStrength() {
		return physicalStrength.getValue();
	}

	/**
   * @return                                     - Endurance value
   */
	public final int getEndurance() {
		return endurance.getValue();
	}
}
