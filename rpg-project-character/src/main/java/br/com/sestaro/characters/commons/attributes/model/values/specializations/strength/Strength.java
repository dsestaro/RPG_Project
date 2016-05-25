package br.com.sestaro.characters.commons.attributes.model.values.specializations.strength;

import javax.persistence.Entity;

import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.generalizations.AttributeAbstract;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.subdivision.Endurance;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.subdivision.PhysicalStrength;

/**
 * Attribute strength class.
 *  
 * @author davidson.sestaro
 */
@Entity
public class Strength extends AttributeAbstract {
	
	private static final String NAME = "STR";
	
	/**
   * @param value1                                - Physical strength value
   * @param value2                                - Endurance value 
   */
	public Strength(final int value1, final int value2) {
	  super(new PhysicalStrength(value1), new Endurance(value2));
	}
	
	/**
   * Calculate the strength based on the mean of the 2 specializations.
   * 
   * @return                                      - Returns the strength value
   */
	public final int getStrength() {
	  return this.getAttributeValue();
	}

	/**
   * Add the param value to the existing physical strength.
   * 
   * @param value                                 - Increment value
   */
	public final void addPhysicalStrength(final int value) {
	  this.addValueSpecialization(getSpecialization1(), value);
	}
	
	/**
   * Add the param value to the existing endurance.
   * 
   * @param value                                 - Increment value
   */
	public final void addEndurance(final int value) {
	  this.addValueSpecialization(getSpecialization2(), value);
	}

	/**
   * @return                                     - Physical strength value
   */
	public final int getPhysicalStrength() {
	  return this.getSpecialization1().getValue();
	}

	/**
   * @return                                     - Endurance value
   */
	public final int getEndurance() {
	  return this.getSpecialization2().getValue();
	}
	
	/**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}
