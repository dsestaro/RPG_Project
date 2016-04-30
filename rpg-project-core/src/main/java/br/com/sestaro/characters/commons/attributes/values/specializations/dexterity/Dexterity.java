package br.com.sestaro.characters.commons.attributes.values.specializations.dexterity;

import br.com.sestaro.characters.commons.attributes.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Coordination;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.subdivision.Speed;

public class Dexterity {
	private Speed speed;
	private Coordination coordination;
	
	public Dexterity(int speed, int coordination) {
		AttributesUtils.initialValidations(speed, coordination, Speed.NAME, Coordination.NAME);
		
		this.speed = new Speed(speed);
		this.coordination = new Coordination(coordination);
	}
	
	public int getDexterity() {
		return (speed.getValue() + coordination.getValue()) / 2;
	}

	public void addSpeed(int value) {
		this.speed.setValue(speed.getValue() + value);
	}
	
	public void addCoordination(int value) {
		this.coordination.setValue(coordination.getValue() + value);
	}

	public int getSpeed() {
		return speed.getValue();
	}

	public int getCoordination() {
		return coordination.getValue();
	}
}
