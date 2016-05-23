package br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Intelligence subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Logic implements ISpecialization {

	private int logic;
	private static final String NAME = "Logic";
	
	/**
   * @param value                              - Logic value
   */
	public Logic(final int value) {
		setValue(value);
	}
	
	/**
   * @return                                   - Return logic value
   */
	public final int getValue() {
		return this.logic;
	}

	/**
   * @param value                              - Logic value
   */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.logic = value;
	}

	/**
   * @return                                   - Return the specialization name
   */
	public final String getName() {
		return NAME;
	}
}
