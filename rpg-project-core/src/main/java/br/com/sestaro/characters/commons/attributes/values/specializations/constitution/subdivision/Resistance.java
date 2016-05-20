package br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.interfaces.Specialization;

/**
 * Constituion subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Resistance implements Specialization {

	private int resistance;
	private static final String NAME = "Resistance";
	
	/**
	 * @param value                              - Resistence value
	 */
	public Resistance(final int value) {
		setValue(value);
	}
	
	/**
	 * @return                                   - Return resistence value
	 */
	public final int getValue() {
		return this.resistance;
	}

	/**
	 * @param value                              - Resistence value
	 */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.resistance = value;
	}

	/**
	 * @return                                   - Return the specialization name
	 */
	public final String getName() {
		return NAME;
	}
}
