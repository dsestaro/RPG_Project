package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.Specialization;

/**
 * Dexterity subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Coordination implements Specialization {

	private int coordination;
	private static final String NAME = "Coordination";
	
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
		return NAME;
	}
}
