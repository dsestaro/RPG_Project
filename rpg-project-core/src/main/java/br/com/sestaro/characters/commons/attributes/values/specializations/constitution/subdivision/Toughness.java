package br.com.sestaro.characters.commons.attributes.values.specializations.constitution.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.interfaces.Specialization;

/**
 * Constituion subdivion. 
 * 
 * @author davidson.sestaro
 */
public class Toughness implements Specialization {

	private int health;
	private static final String NAME = "Toughness";
	
	/**
   * @param value                              - Toughness value
   */
  public Toughness(final int value) {
		setValue(value);
	}
	
  /**
   * @return                                   - Toughness value
   */
  public final int getValue() {
		return this.health;
	}

  /**
   * @param value                              - Toughness value
   */
  public final void setValue(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.health = value;
	}

  /**
   * @return                                   - Return the specialization name
   */
  public final String getName() {
		return NAME;
	}
}
