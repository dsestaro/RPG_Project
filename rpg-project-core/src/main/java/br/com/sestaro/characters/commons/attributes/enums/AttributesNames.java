package br.com.sestaro.characters.commons.attributes.enums;

public enum AttributesNames {
	STRENGTH(10),
	STRENGTH_PHYSICALSTRENGTH(11),
	STRENGTH_ENDURANCE(12),
	DEXTERITY(20),
	DEXTERITY_SPEED(21),
	DEXTERITY_COORDINATION(22),
	CONSTITUTION(3),
	INTELLIGENCE(4),
	WISDOM(5),
	CHARISMA(6);
	
	private final int position;
	
	AttributesNames(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return this.position;
	}
}
