package br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.interfaces.Specialization;

/**
 * Strength subdivision. 
 * 
 * @author davidson.sestaro
 */
public class Endurance implements Specialization {

	private int endurance;
	private static final String NAME = "Endurance";
	
	/**
   * @param value                              - Endurance value
   */
	public Endurance(final int value) {
		setValue(value);
	}

	/**
   * @return                                   - Return endurance value
   */
	public final int getValue() {
		return this.endurance;
	}
	
	/**
   * @param value                              - Endurance value
   */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.endurance = value;
	}
	
	/**
   * @return                                   - Return the specialization name
   */
	public final String getName() {
		return NAME;
	}
}
