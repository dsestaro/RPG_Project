package br.com.sestaro.characters.commons.attributes.values.specializations.constitution;

import javax.persistence.Entity;

import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Resistance;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision.Toughness;
import br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.generalizations.AttributeAbstract;

/**
 * Attribute constitution class.
 *  
 * @author davidson.sestaro
 */
@Entity
public class Constitution extends AttributeAbstract {

  private static final String NAME = "CON";
	
	/**
	 * @param value1                               - Thoughness value
	 * @param value2                               - Resistence value 
	 */
	public Constitution(final int value1, final int value2) {
	  super(new Toughness(value1), new Resistance(value2));
	}
	
	/**
	 * Calculate the constution based on the mean of the 2 specializations.
	 * 
	 * @return                                     - Returns the constitution value
	 */
	public final int getConstitution() {
	  return this.getAttributeValue();
	}

	/**
	 * Add the param value to the existing toughness.
	 * 
	 * @param value                                 - Increment value
	 */
	public final void addToughness(final int value) {
	  this.addValueSpecialization(getSpecialization1(), value);
	}
	
	/**
   * Add the param value to the existing resistence.
   * 
   * @param value                                 - Increment value
   */
	public final void addResistance(final int value) {
	  this.addValueSpecialization(getSpecialization2(), value);
	}

	/**
	 * @return                                     - Toughness value
	 */
	public final int getToughness() {
	  return this.getSpecialization1().getValue();
	}

	/**
	 * @return                                     - Resistence value
	 */
	public final int getResistance() {
	  return this.getSpecialization2().getValue();
	}
	
	/**
   * @return                                      - Return the specialization name
   */
  public static final String getName() {
    return NAME;
  }
}
