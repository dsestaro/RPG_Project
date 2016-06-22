package br.com.sestaro.characters.commons.info.model.enums;

/**
 * Class that contain all character alignments names.
 * 
 * @author davidson.sestaro
 */
public enum CharacterAlignNames {
	LAWFUL_GOOD(1),
	NEUTRAL_GOOD(2),
	CHAOTIC_GOOD(3),
	LAWFUL_NEUTRAL(4),
	NEUTRAL(5),
	CHAOTIC_NEUTRAL(6),
	LAWFUL_EVIL(7),
	NEUTRAL_EVIL(8),
	CHAOTIC_EVIL(9);
	
	private final int position;
	
	/**
   * Enum constructor.
   * 
   * @param value                                    - Enum position
   */
	CharacterAlignNames(final int value) {
		this.position = value;
	}
	
	/**
   * @return                                         - Enum position
   */
	public int getPosition() {
		return this.position;
	}
}
