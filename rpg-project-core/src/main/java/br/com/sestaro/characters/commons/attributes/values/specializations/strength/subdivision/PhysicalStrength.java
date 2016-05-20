package br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.interfaces.Specialization;

/**
 * Strength subdivision. 
 * 
 * @author davidson.sestaro
 */
public class PhysicalStrength implements Specialization {

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
