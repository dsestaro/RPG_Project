package br.com.sestaro.characters.commons.attributes.values.specializations.strength;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision.Endurance;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision.PhysicalStrength;

public class Strength {
	private PhysicalStrength physicalStrength;
	private Endurance endurance;
	
	public Strength(int physicalStrength, int endurance) {
		AttributesUtils.initialValidations(physicalStrength, endurance, PhysicalStrength.NAME, Endurance.NAME);
		
		this.physicalStrength = new PhysicalStrength(physicalStrength);
		this.endurance = new Endurance(endurance);
	}
	
	public int getStrength() {
		return (physicalStrength.getValue() + endurance.getValue()) / 2;
	}

	public void addPhysicalStrength(int value) {
		this.physicalStrength.setValue(physicalStrength.getValue() + value);
	}
	
	public void addEndurance(int value) {
		this.endurance.setValue(endurance.getValue() + value);
	}

	public int getPhysicalStrength() {
		return physicalStrength.getValue();
	}

	public int getEndurance() {
		return endurance.getValue();
	}
}
