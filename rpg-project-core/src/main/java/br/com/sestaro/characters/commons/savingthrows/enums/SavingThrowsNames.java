package br.com.sestaro.characters.commons.savingthrows.enums;

public enum SavingThrowsNames {
	FORTITUDE(1),
	REFLEX(2),
	WILL(3);
	
	private final int position;
	
	SavingThrowsNames(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return this.position;
	}
}
