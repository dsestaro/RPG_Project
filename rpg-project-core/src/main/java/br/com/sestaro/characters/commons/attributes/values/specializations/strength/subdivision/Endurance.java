package br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

/**
 * Strength subdivision. 
 * 
 * @author davidson.sestaro
 */
public class Endurance implements Specialization {

	private int endurance;
	private final String name = "Endurance";
	
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
		return this.name;
	}
}
