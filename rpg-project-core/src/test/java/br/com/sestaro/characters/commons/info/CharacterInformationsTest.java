package br.com.sestaro.characters.commons.info;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.info.CharacterInformations;
import br.com.sestaro.characters.commons.info.enums.CharacterAlignNames;
import br.com.sestaro.characters.commons.info.enums.GenderNames;
import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.values.CharacterInformationsValues;

public class CharacterInformationsTest {

	String name = "Dahlion";
	CharacterAlignNames align = CharacterAlignNames.NEUTRAL;
	String deity = "Va'al";
	String homeland = "Kazzad";
	GenderNames gender = GenderNames.MAN;
	int age = 180;
	int height = 90;
	int weight = 190;
	String hairColor = "black";
	String eyesColor = "green";
	CharacterInformationsValues values;
	
	@Before
	public void initialization() {
		values = new CharacterInformationsValues(name, align, deity, homeland, gender, age, height, weight, hairColor, eyesColor);
	}
	
	@Test
	public void initializationWithValueTest() {
		CharacterInformations character = new CharacterInformations(this.values);
	}
	
	@Test(expected=InvalidInformationException.class)
	public void initializationWithoutValueTest() {
		CharacterInformations character = new CharacterInformations(null);
	}
	
	@Test
	public void retreaveInformationTest() {
		CharacterInformations character = new CharacterInformations(this.values);
		
		assertEquals(age, character.getValues().getAge());
	}
}
