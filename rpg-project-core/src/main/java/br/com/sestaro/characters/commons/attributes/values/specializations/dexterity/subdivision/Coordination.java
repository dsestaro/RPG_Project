package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

/**
 * Dexterity subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Coordination implements Specialization {

	private int coordination;
	private final String name = "Coordination";
	
	/**
   * @param value                              - Coordination value
   */
	public Coordination(final int value) {
		setValue(value);
	}
	
	/**
   * @return                                   - Coordination value
   */
	public final int getValue() {
		return this.coordination;
	}

	/**
   * @param value                              - Coordination value
   */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.coordination = value;
	}

	/**
   * @return                                   - Return the specialization name
   */
	public final String getName() {
		return this.name;
	}
}
