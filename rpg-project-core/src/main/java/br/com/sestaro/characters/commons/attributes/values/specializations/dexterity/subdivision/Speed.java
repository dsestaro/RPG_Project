package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision;

import br.com.sestaro.characters.commons.attributes.interfaces.Specialization;
import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

/**
 * Dexterity subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Speed implements Specialization {

	private int speed;
	private final String name = "Speed";
	
	/**
   * @param value                              - Speed value
   */
	public Speed(final int value) {
		setValue(value);
	}
	
	/**
   * @return                                   - Speed value
   */
	public final int getValue() {
		return this.speed;
	}

	/**
   * @param value                              - Speed value
   */
	public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.speed = value;
	}
	
	/**
   * @return                                   - Return the specialization name
   */
	public final String getName() {
		return this.name;
	}
}
