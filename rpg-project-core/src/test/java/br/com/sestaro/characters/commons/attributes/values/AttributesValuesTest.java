package br.com.sestaro.characters.commons.attributes.values;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FOUR;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FIVE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIX;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.TWELVE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.NEGATIVE;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;

/**
 * Class to test {@link AttributesValues}.
 * 
 * @author davidson.sestaro
 */
public class AttributesValuesTest {

	private AttributesValues attributes; 
	private Strength strength;
	private Dexterity dexterity;
	private Constitution constitution;
	private int intelligence = FOUR;
	private int wisdom = FIVE;
	private int charisma = SIX;
	
	/**
   * Validate initial configuration.
   */
	@Before
  public final void initialization() {
		this.strength = new Strength(TWELVE, SIXTEEN);
		this.dexterity = new Dexterity(SIXTEEN, THIRTEEN);
		this.constitution = new Constitution(THIRTEEN, FIFTEEN);
		this.attributes = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
   * Validate if the method get is returning the correct value.
   */
	@Test
  public final void testInitializationWithValues() {
		assertEquals(FOURTEEN, this.attributes.getStrength().getStrength());
		assertEquals(TWELVE, this.attributes.getStrength().getPhysicalStrength());
		assertEquals(SIXTEEN, this.attributes.getStrength().getEndurance());
		assertEquals(FOURTEEN, this.attributes.getDexterity().getDexterity());
		assertEquals(SIXTEEN, this.attributes.getDexterity().getSpeed());
		assertEquals(THIRTEEN, this.attributes.getDexterity().getCoordination());
		assertEquals(FOURTEEN, this.attributes.getConstitution().getConstitution());
		assertEquals(THIRTEEN, this.attributes.getConstitution().getToughness());
		assertEquals(FIFTEEN, this.attributes.getConstitution().getResistance());
		assertEquals(this.intelligence, this.attributes.getIntelligence());
		assertEquals(this.wisdom, this.attributes.getWisdom());
		assertEquals(this.charisma, this.attributes.getCharisma());
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeConstitutionValue() {
		attributes.getConstitution().addToughness(NEGATIVE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeIntelligenceValue() {
		attributes.setIntelligence(NEGATIVE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeWisdomValue() {
		attributes.setWisdom(NEGATIVE);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeCharismaValue() {
		attributes.setCharisma(NEGATIVE);
	}
}
