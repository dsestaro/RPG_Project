package br.com.sestaro.characters.commons.attributes.values;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;

public class AttributesValues {
	private Strength strength;
	private Dexterity dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	public AttributesValues(Strength strength, Dexterity dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		this.strength = strength;
		this.dexterity = dexterity;
		this.setConstitution(constitution);
		this.setIntelligence(intelligence);
		this.setWisdom(wisdom);
		this.setCharisma(charisma);
	}
	
	public Strength getStrength() {
		return strength;
	}
	
	public Dexterity getDexterity() {
		return dexterity;
	}
	
	public int getConstitution() {
		return constitution;
	}
	
	public void setConstitution(int constitution) {
		AttributesUtils.validateAttributeValue(constitution);
		this.constitution = constitution;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		AttributesUtils.validateAttributeValue(intelligence);
		this.intelligence = intelligence;
	}
	
	public int getWisdom() {
		return wisdom;
	}
	
	public void setWisdom(int wisdom) {
		AttributesUtils.validateAttributeValue(wisdom);
		this.wisdom = wisdom;
	}
	
	public int getCharisma() {
		return charisma;
	}
	
	public void setCharisma(int charisma) {
		AttributesUtils.validateAttributeValue(charisma);
		this.charisma = charisma;
	}
}
