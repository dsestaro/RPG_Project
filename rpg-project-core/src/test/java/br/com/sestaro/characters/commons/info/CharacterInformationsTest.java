package br.com.sestaro.characters.commons.info;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.info.enums.CharacterAlignNames;
import br.com.sestaro.characters.commons.info.enums.GenderNames;
import br.com.sestaro.characters.commons.info.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.values.CharacterInformationsValues;

/**
 * Class to test {@link CharacterInformations}.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationsTest {

  private static final String NAME = "Dahlion";
  private static final CharacterAlignNames ALIGN = CharacterAlignNames.NEUTRAL;
  private static final String DEITY = "Va'al";
  private static final String HOMELAND = "Kazzad";
  private static final GenderNames GENDER = GenderNames.MAN;
  private static final int AGE = 180;
  private static final int HEIGHT = 90;
  private static final int WEIGHT = 190;
  private static final String HAIR_COLOR = "black";
  private static final String EYES_COLOR = "green";
	private CharacterInformationsValues values;
	
	/**
   * Initial configuration.
   */
	@Before
  public final void initialization() {
		values = new CharacterInformationsValues(NAME, ALIGN, DEITY, HOMELAND, GENDER, AGE, HEIGHT, WEIGHT, HAIR_COLOR, EYES_COLOR);
	}
	
	/**
   * Validate initial configuration.
   */
	@Test
  public final void initializationWithValueTest() {
		new CharacterInformations(this.values);
	}
	
	/**
   * Validate null initial configuration.
   */
	@Test(expected = InvalidInformationException.class)
  public final void initializationWithoutValueTest() {
		new CharacterInformations(null);
	}
	
	/**
   * Validate if a retrieved informantion was not changed.
   */
	@Test
  public final void retreaveInformationTest() {
		CharacterInformations character = new CharacterInformations(this.values);
		
		assertEquals(AGE, character.getValues().getAge());
	}
}
