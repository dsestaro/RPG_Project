package br.com.sestaro.characters.commons.attributes.values;

import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.NEGATIVE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.SIX;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TWELVE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.EIGHT;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.exceptions.NegativeAttributeValueException;
import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

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
	private Intelligence intelligence;
	private Wisdom wisdom;
	private Charisma charisma;
	
	/**
   * Initial configuration.
   */
	@Before
  public final void initialization() {
		this.strength = new Strength(TWELVE, SIXTEEN);
		this.dexterity = new Dexterity(SIXTEEN, THIRTEEN);
		this.constitution = new Constitution(THIRTEEN, FIFTEEN);
		this.intelligence = new Intelligence(TWELVE, SIXTEEN);
		this.wisdom = new Wisdom(EIGHT, TWELVE);
		this.charisma = new Charisma(TWELVE, TWELVE);
		
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
		
		assertEquals(FOURTEEN, this.attributes.getIntelligence().getIntelligence());
		assertEquals(TWELVE, this.attributes.getIntelligence().getKnowledge());
		assertEquals(SIXTEEN, this.attributes.getIntelligence().getLogic());
		
		assertEquals(TEN, this.attributes.getWisdom().getWisdom());
		assertEquals(EIGHT, this.attributes.getWisdom().getInstinct());
		assertEquals(TWELVE, this.attributes.getWisdom().getIntuition());
		
		assertEquals(TWELVE, this.attributes.getCharisma().getCharisma());
    assertEquals(TWELVE, this.attributes.getCharisma().getAppearance());
    assertEquals(TWELVE, this.attributes.getCharisma().getCharm());
		
		assertEquals(this.charisma, this.attributes.getCharisma());
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeConstitutionValue() {
		attributes.getConstitution().addToughness(-FOURTEEN);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeWisdomValue() {
		attributes.getWisdom().addIntuition(-SIXTEEN);
	}
	
	/**
   * Validate negative input.
   */
	@Test(expected = NegativeAttributeValueException.class)
  public final void testNegativeCharismaValue() {
		attributes.getCharisma().addCharm(-SIXTEEN);
	}
}
