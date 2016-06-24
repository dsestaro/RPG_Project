package br.com.sestaro.characters.commons.info.model.enums;

/**
 * Class that contain all gender names.
 * 
 * @author davidson.sestaro
 */
public enum GenderNames {
	MAN(1),
	WOMAN(2),
	NULL(3);
	
	private final int position;
	
	/**
   * Enum constructor.
   * 
   * @param value                                    - Enum position
   */
	GenderNames(final int value) {
		this.position = value;
	}
	
	/**
   * @return                                         - Enum position
   */
	public int getPosition() {
		return this.position;
	}
}
