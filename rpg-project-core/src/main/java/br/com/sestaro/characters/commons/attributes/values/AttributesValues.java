package br.com.sestaro.characters.commons.attributes.values;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

/**
 * Class that group all the attributes and give the methods to access their values.
 * 
 * @author davidson.sestaro
 */
public class AttributesValues {
	private Strength strength;
	private Dexterity dexterity;
	private Constitution constitution;
	private Intelligence intelligence;
	private Wisdom wisdom;
	private int charisma;
	
	/**
	 * @param value1                                         - Strength
	 * @param value2                                         - Dexterity
	 * @param value3                                         - Constitution
	 * @param value4                                         - Intelligence
	 * @param value5                                         - Wisdom
	 * @param value6                                         - Charisma
	 */
	public AttributesValues(final Strength value1, final Dexterity value2, final Constitution value3, 
	    final Intelligence value4, final Wisdom value5, final int value6) {
		this.strength = value1;
		this.dexterity = value2;
		this.constitution = value3;
		this.intelligence = value4;
		this.wisdom = value5;
		this.setCharisma(value6);
	}
	
	/**
	 * @return                                               - Return the strength
	 */
	public final Strength getStrength() {
		return strength;
	}
	
	/**
   * @return                                               - Return the dexterity
   */
	public final Dexterity getDexterity() {
		return dexterity;
	}
	
	/**
   * @return                                               - Return the constitution
   */
	public final Constitution getConstitution() {
		return constitution;
	}
	
	/**
   * @return                                               - Return the intelligence
   */
	public final Intelligence getIntelligence() {
		return intelligence;
	}
	
	/**
   * @return                                               - Return the wisdom
   */
	public final Wisdom getWisdom() {
		return wisdom;
	}
	
	/**
   * @return                                               - Return the charisma
   */
	public final int getCharisma() {
		return charisma;
	}
	
	/**
   * @param value                                          - Value to add
   */
	public final void setCharisma(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.charisma = value;
	}
}
