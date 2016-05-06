package br.com.sestaro.characters.commons.attributes.enums;

/**
 * Class that contain all attributes and subdividions names.
 * 
 * @author davidson.sestaro
 */
public enum AttributesNames {
	STRENGTH(10),
	STRENGTH_PHYSICALSTRENGTH(11),
	STRENGTH_ENDURANCE(12),
	DEXTERITY(20),
	DEXTERITY_SPEED(21),
	DEXTERITY_COORDINATION(22),
	CONSTITUTION(30),
	CONSTITUTION_TOUGHNESS(31),
	CONSTITUTION_RESISTANCE(32),
	INTELLIGENCE(40),
	INTELLIGENCE_KNOWLEDGE(41),
	INTELLIGENCE_LOGIC(42),
	WISDOM(50),
	WISDOM_INSTINCT(51),
	WISDOM_INTUITION(52),
	CHARISMA(6);
	
	private final int position;
	
	/**
	 * Enum constructor.
	 * 
	 * @param value                                    - Enum position
	 */
	AttributesNames(final int value) {
		this.position = value;
	}
	
	/**
	 * @return                                         - Enum position
	 */
	public int getPosition() {
		return this.position;
	}
}
