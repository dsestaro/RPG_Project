package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Coordination;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Speed;

/**
 * Attribute dexterity class.
 *  
 * @author davidson.sestaro
 */
public class Dexterity {
	private Speed speed;
	private Coordination coordination;
	private static final String NAME = "DEX"; 
	
	/**
   * @param value1                                - Speed value
   * @param value2                                - Coordination value 
   */
	public Dexterity(final int value1, final int value2) {
		this.speed = new Speed(value1);
		this.coordination = new Coordination(value2);

		AttributesUtils.initialValidations(this.speed, this.coordination);
	}
	
	/**
   * Calculate the dexterity based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the dexterity value
   */
	public final int getDexterity() {
		return (speed.getValue() + coordination.getValue()) / 2;
	}

	/**
   * Add the param value to the existing speed.
   * 
   * @param value                                 - Increment value
   */
	public final void addSpeed(final int value) {
		this.speed.setValue(speed.getValue() + value);
	}
	
	/**
   * Add the param value to the existing coordination.
   * 
   * @param value                                 - Increment value
   */
	public final void addCoordination(final int value) {
		this.coordination.setValue(coordination.getValue() + value);
	}

	/**
   * @return                                     - Speed value
   */
	public final int getSpeed() {
		return speed.getValue();
	}

	/**
   * @return                                     - Coordination value
   */
	public final int getCoordination() {
		return coordination.getValue();
	}
	
	/**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}
