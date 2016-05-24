package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity;

import javax.persistence.Entity;

import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Coordination;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Speed;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations.AttributeAbstract;

/**
 * Attribute dexterity class.
 *  
 * @author davidson.sestaro
 */
@Entity
public class Dexterity extends AttributeAbstract {

  private static final String NAME = "DEX"; 
	
	/**
   * @param value1                                - Speed value
   * @param value2                                - Coordination value 
   */
	public Dexterity(final int value1, final int value2) {
	  super(new Speed(value1), new Coordination(value2));
	}
	
	/**
   * Calculate the dexterity based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the dexterity value
   */
	public final int getDexterity() {
	  return this.getAttributeValue();
	}

	/**
   * Add the param value to the existing speed.
   * 
   * @param value                                 - Increment value
   */
	public final void addSpeed(final int value) {
	  this.addValueSpecialization(getSpecialization1(), value);
	}
	
	/**
   * Add the param value to the existing coordination.
   * 
   * @param value                                 - Increment value
   */
	public final void addCoordination(final int value) {
	  this.addValueSpecialization(getSpecialization2(), value);
	}

	/**
   * @return                                     - Speed value
   */
	public final int getSpeed() {
	  return this.getSpecialization1().getValue();
	}

	/**
   * @return                                     - Coordination value
   */
	public final int getCoordination() {
	  return this.getSpecialization2().getValue();
	}
	
	/**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}
