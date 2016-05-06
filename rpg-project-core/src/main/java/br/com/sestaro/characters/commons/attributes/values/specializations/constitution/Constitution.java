package br.com.sestaro.characters.commons.attributes.values.specializations.constitution;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Toughness;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Resistance;

/**
 * Attribute constitution class.
 *  
 * @author davidson.sestaro
 */
public class Constitution {
	private Toughness toughness;
	private Resistance resistance;
	private static final String NAME = "CON";
	
	/**
	 * @param value1                               - Thoughness value
	 * @param value2                               - Resistence value 
	 */
	public Constitution(final int value1, final int value2) {
		this.toughness = new Toughness(value1);
		this.resistance = new Resistance(value2);

		AttributesUtils.initialValidations(this.toughness, this.resistance);
	}
	
	/**
	 * Calculate the constution based on the mean of the 2 specializations.
	 * 
	 * @return                                     - Returns the constitution value
	 */
	public final int getConstitution() {
		return (toughness.getValue() + resistance.getValue()) / 2;
	}

	/**
	 * Add the param value to the existing toughness.
	 * 
	 * @param value                                 - Increment value
	 */
	public final void addToughness(final int value) {
		this.toughness.setValue(toughness.getValue() + value);
	}
	
	/**
   * Add the param value to the existing resistence.
   * 
   * @param value                                 - Increment value
   */
	public final void addResistance(final int value) {
		this.resistance.setValue(resistance.getValue() + value);
	}

	/**
	 * @return                                     - Toughness value
	 */
	public final int getToughness() {
		return toughness.getValue();
	}

	/**
	 * @return                                     - Resistence value
	 */
	public final int getResistance() {
		return resistance.getValue();
	}
	
	/**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}
