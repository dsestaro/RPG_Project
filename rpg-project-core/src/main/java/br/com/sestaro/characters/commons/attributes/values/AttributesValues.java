package main.java.br.com.sestaro.characters.commons.attributes.values;

import main.java.br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import main.java.br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class AttributesValues {
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	public AttributesValues(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		this.setStrength(strength);
		this.setDexterity(dexterity);
		this.setConstitution(constitution);
		this.setIntelligence(intelligence);
		this.setWisdom(wisdom);
		this.setCharisma(charisma);
	}
	
	public AttributesValues() {
		this.strength = 0;
		this.dexterity = 0;
		this.constitution = 0;
		this.intelligence = 0;
		this.wisdom = 0;
		this.charisma = 0;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		AttributesUtils.validateAttributeValue(strength);
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		AttributesUtils.validateAttributeValue(dexterity);
		this.dexterity = dexterity;
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
