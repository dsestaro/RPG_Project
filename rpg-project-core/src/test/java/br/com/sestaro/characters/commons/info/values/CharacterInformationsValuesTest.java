package br.com.sestaro.characters.commons.info.values;

import org.junit.Test;

import br.com.sestaro.characters.commons.info.enums.CharacterAlignNames;
import br.com.sestaro.characters.commons.info.enums.GenderNames;
import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.values.CharacterInformationsValues;

public class CharacterInformationsValuesTest {

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
	
	@Test
	public void initializationTest() {
		new CharacterInformationsValues(name, align, deity, homeland, gender, age, height, weight, hairColor, eyesColor);
	}
	
	@Test(expected=InvalidInformationException.class)
	public void nullOrEmptyName() {
		new CharacterInformationsValues("", align, deity, homeland, gender, age, height, weight, hairColor, eyesColor);
	}
	
	@Test(expected=InvalidInformationException.class)
	public void nullOrEmptyDeity() {
		new CharacterInformationsValues(name, align, null, homeland, gender, age, height, weight, hairColor, eyesColor);
	}
	
	@Test(expected=InvalidInformationException.class)
	public void nullOrEmptyHomeland() {
		new CharacterInformationsValues(name, align, deity, "", gender, age, height, weight, hairColor, eyesColor);
	}
	
	@Test(expected=InvalidInformationException.class)
	public void nullOrEmptyHairColor() {
		new CharacterInformationsValues(name, align, deity, homeland, gender, age, height, weight, "", eyesColor);
	}
	
	@Test(expected=InvalidInformationException.class)
	public void nullOrEmptyEyesColor() {
		new CharacterInformationsValues(name, align, deity, homeland, gender, age, height, weight, hairColor, null);
	}
}
