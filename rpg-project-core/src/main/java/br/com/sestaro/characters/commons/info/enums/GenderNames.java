package br.com.sestaro.characters.commons.info.enums;

public enum GenderNames {
	MAN(1),
	WOMAN(2);
	
	private final int position;
	
	GenderNames(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return this.position;
	}
}
