package br.com.sestaro.characters.commons.attributes;

import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.ELEVEN_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.SIXTEEN_MODIFIER;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.attributes.values.AttributesValues;
import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

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
  public final void beforeInitialTestsConfiguration() {
		Strength strength = new Strength(TEN, FOURTEEN);
		Dexterity dexterity = new Dexterity(TWELVE, FOURTEEN);
		Constitution constitution = new Constitution(THIRTEEN, THIRTEEN);
		Intelligence intelligence = new Intelligence(FOURTEEN, FOURTEEN);
		Wisdom wisdom = new Wisdom(TEN, THIRTEEN);
		Charisma charisma = new Charisma(TWELVE, TWELVE);
		
		this.attributesValues = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}

	/**
   * Validate initial configuration.
   */
	@Test
  public final void testShouldValidateInstantiationWithAllAttributes() {
		new Attributes(this.attributesValues);
	}
	
	/**
   * Validate null values.
   */
	@Test(expected = NullAttributesException.class)
  public final void testShouldFailWhenAttributesAreNull() {
		new Attributes(null);
	}
	
	/**
	 * Validate positive attributes.
	 */
	@Test
  public final void testShouldValidateGetPositiveAttributeModifier() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(1, attributes.getAttributeModifier(AttributesNames.CONSTITUTION));
	}
	
	/**
   * Validate negative attributes.
   */
	@Test
  public final void testShouldValidateGetNegativeAttributeModifier() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		assertEquals(ELEVEN_MODIFIER, attributes.getAttributeModifier(AttributesNames.WISDOM));
	}
	
	/**
	 * Validate addiction of value.
	 */
	@Test
  public final void testShouldValidateSumOfValueToAttributeSpecialization() {
		Attributes attributes = new Attributes(this.attributesValues);
		
		attributes.addAttributeValue(AttributesNames.INTELLIGENCE_LOGIC, POSITIVE);
		
		assertEquals(SIXTEEN_MODIFIER, attributes.getAttributeModifier(AttributesNames.INTELLIGENCE_LOGIC));
	}
}
