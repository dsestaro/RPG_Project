package br.com.sestaro.characters.commons.savingthrows.model.enums;

/**
 * Class that contain all saving throws names.
 * 
 * @author davidson.sestaro
 */
public enum SavingThrowsNames {
	FORTITUDE(1),
	REFLEX(2),
	WILL(3);
	
	private final int position;
	
	/**
   * Enum constructor.
   * 
   * @param value                                    - Enum position
   */
	SavingThrowsNames(final int value) {
		this.position = value;
	}
	
	/**
   * @return                                         - Enum position
   */
	public int getPosition() {
		return this.position;
	}
}
