package br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces;

import javax.persistence.MappedSuperclass;

/**
 * Interface to attributes specialization.
 * 
 * @author davidson.sestaro
 */
@MappedSuperclass
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
