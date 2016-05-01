package br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

/**
 * Intelligence subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Logic implements Specialization {

	private int logic;
	private final String name = "Logic";
	
	/**
   * @param value                              - Knowledge value
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
		return this.name;
	}
}
