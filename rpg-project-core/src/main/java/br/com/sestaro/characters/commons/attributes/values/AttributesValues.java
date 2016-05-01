package br.com.sestaro.characters.commons.attributes.values;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;

/**
 * Class that group all the attributes and give the methods to access their values.
 * 
 * @author davidson.sestaro
 */
public class AttributesValues {
	private Strength strength;
	private Dexterity dexterity;
	private Constitution constitution;
	private int intelligence;
	private int wisdom;
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
	    final int value4, final int value5, final int value6) {
		this.strength = value1;
		this.dexterity = value2;
		this.constitution = value3;
		this.setIntelligence(value4);
		this.setWisdom(value5);
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
	public final int getIntelligence() {
		return intelligence;
	}
	
	/**
	 * @param value                                          - Value to add
	 */
	public final void setIntelligence(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.intelligence = value;
	}
	
	/**
   * @return                                               - Return the wisdom
   */
	public final int getWisdom() {
		return wisdom;
	}
	
	/**
   * @param value                                          - Value to add
   */
	public final void setWisdom(final int value) {
		AttributesUtils.validateAttributeValue(value);
		this.wisdom = value;
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
