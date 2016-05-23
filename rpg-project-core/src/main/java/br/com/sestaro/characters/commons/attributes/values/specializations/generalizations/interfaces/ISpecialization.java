package br.com.sestaro.characters.commons.attributes.values.specializations.generalizations.interfaces;

/**
 * Interface to attributes specialization.
 * 
 * @author davidson.sestaro
 */
public interface ISpecialization {
  /**
   * @return                                  - Specialization value
   */
	int getValue();
	
	/**
	 * @param value                             - Specialization value
	 */
	void setValue(int value);
	
	/**
	 * @return                                   - Specialization name
	 */
	String getName();
}