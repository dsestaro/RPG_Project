package br.com.sestaro.characters.commons.attributes.values.specializations.strength.subdivision;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;

public class PhysicalStrength implements StrengthSpecialization {

	private int physicalStrength;
	public static final String NAME = "Physical Strength";
	
	public PhysicalStrength(int physicalStrength) {
		setValue(physicalStrength);
	}

	public int getValue() {
		return this.physicalStrength;
	}

	public void setValue(int physicalStrength) {
		AttributesUtils.validateAttributeValue(physicalStrength);
		this.physicalStrength = physicalStrength;
	}
}
