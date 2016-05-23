package br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces.Specialization;

/**
 * Intelligence subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Knowledge implements Specialization {

	private int knowledge;
	private static final String NAME = "Knowledge";
	
	/**
   * @param value                              - Knowledge value
   */
	public Knowledge(final int value) {
		setValue(value);
	}
	
	/**
   * @return                                   - Return knowledge value
   */
	public final int getValue() {
		return this.knowledge;
	}

	/**
   * @param value                              - Knowledge value
   */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.knowledge = value;
	}

	/**
   * @return                                   - Return the specialization name
   */
	public final String getName() {
		return NAME;
	}
}