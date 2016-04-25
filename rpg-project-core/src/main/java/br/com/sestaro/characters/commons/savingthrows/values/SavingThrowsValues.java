package br.com.sestaro.characters.commons.savingthrows.values;

public class SavingThrowsValues {
	private int fortitude;
	private int reflex;
	private int will;
	
	public SavingThrowsValues(int fortitude, int reflex, int will) {
		this.fortitude = fortitude;
		this.reflex = reflex;
		this.will = will;
	}
	
	public SavingThrowsValues() {
		this.fortitude = 0;
		this.reflex = 0;
		this.will = 0;
	}
	
	public int getFortitude() {
		return fortitude;
	}
	public void setFortitude(int fortitude) {
		this.fortitude = fortitude;
	}
	public int getReflex() {
		return reflex;
	}
	public void setReflex(int reflex) {
		this.reflex = reflex;
	}
	public int getWill() {
		return will;
	}
	public void setWill(int will) {
		this.will = will;
	}
}
