package br.com.sestaro.characters.commons.attributes;

import static org.junit.Assert.assertEquals;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.TEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.TWELVE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FIVE;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIX;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.FIVE_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.values.constants.NumericValuesConstantValues.SIXTEEN;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;

/**
 * Class to test {@link Attributes}.
 * 
 * @author davidson.sestaro
 */
public class AttributesTests {
	
	private AttributesValues attributesValues;
	
	/**
   * Initial configuration.
   */
	@Before
  public final void initialContext() {
		Strength strength = new Strength(TEN, FOURTEEN);
		Dexterity dexterity = new Dexterity(TWELVE, FOURTEEN);
		Constitution constitution = new Constitution(THIRTEEN, THIRTEEN);
		int intelligence = FOURTEEN;
		int wisdom = FIVE;
		int charisma = SIXTEEN;
		
		this.attributesValues = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}

	/**
   * Validate initial configuration.
   */
	@Test
  public final void testInitializationWithValues() {
		new Attributes(this.attributesValues);
	}
	
	/**
   * Validate null values.
   */
	@Test(expected = NullAttributesException.class)
  public final void testNullAttributesValueInitialization() {
		new Attributes(null);
	}
	
	/**
   * Validate blank values.
   */
	@Test
  public final void testInitializationWithoutValues() {
		new Attributes(this.attributesValues).getValues();
	}
	
	/**
	 * Validate positive attributes.
	 */
	@Test
  public final void positiveAttributeModifierTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(1, attributes.getAttributeModifier(AttributesNames.CONSTITUTION));
	}
	
	/**
   * Validate negative attributes.
   */
	@Test
  public final void negativeAttributeModifierTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(FIVE_MODIFIER, attributes.getAttributeModifier(AttributesNames.WISDOM));
	}
	
	/**
	 * Validate addiction of value.
	 */
	@Test
  public final void addAttributeValueTest() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		attributes.addAttributeValue(AttributesNames.INTELLIGENCE, SIX);
		
		assertEquals(FIVE, attributes.getAttributeModifier(AttributesNames.INTELLIGENCE));
	}
}
