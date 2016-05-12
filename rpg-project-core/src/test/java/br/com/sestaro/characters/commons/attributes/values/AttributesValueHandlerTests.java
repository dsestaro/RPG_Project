package br.com.sestaro.characters.commons.attributes.values;

import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.EIGHT;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.FOURTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.NEGATIVE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.POSITIVE;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.utils.NumericValuesConstantValues.TWELVE;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.exceptions.InvalidAttributeNameException;
import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

/**
 * Class to test {@link AttributesValueHandler}.
 * 
 * @author davidson.sestaro
 */
public class AttributesValueHandlerTests {

	private AttributesValues values; 
	private Strength strength;
	private Dexterity dexterity;
	private Constitution constitution;
	private Intelligence intelligence;
	private Wisdom wisdom;
	private Charisma charisma;
	
	/**
	 * Initialization of variables that will be used in this class.
	 */
	@Before
  public final void testShouldValidateInitialAttributesValues() {
		this.strength = new Strength(TWELVE, EIGHT);
		this.dexterity = new Dexterity(FOURTEEN, FOURTEEN);
		this.constitution = new Constitution(TWELVE, FOURTEEN);
		this.intelligence = new Intelligence(FOURTEEN, FOURTEEN);
		this.wisdom = new Wisdom(FIFTEEN, SIXTEEN);
		this.charisma = new Charisma(TWELVE, TWELVE);
		
		this.values = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Validate if the method get is returning the correct value.
	 */
	@Test
  public final void testShouldValidateRetrieveOfAttributesValues() {
		int attributeValue = 0;
		
		AttributesNames attributeName = AttributesNames.STRENGTH;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(TEN, attributeValue);
		
		attributeName = AttributesNames.DEXTERITY;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(FOURTEEN, attributeValue);
		
		attributeName = AttributesNames.CONSTITUTION;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(THIRTEEN, attributeValue);
		
		attributeName = AttributesNames.INTELLIGENCE;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(FOURTEEN, attributeValue);
		
		attributeName = AttributesNames.WISDOM;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(FIFTEEN, attributeValue);
		
		attributeName = AttributesNames.CHARISMA;
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(TWELVE, attributeValue);
	}
	
	/**
   * Validate if the method set is calculating the correct value.
   */
	@Test
  public final void testShouldValidateSumOfAValueWithAnAttributeSpecialization() {
		int attributeValue = 0;
		
		AttributesNames attributeName = AttributesNames.STRENGTH_PHYSICALSTRENGTH;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(FOURTEEN, attributeValue);
		
		attributeName = AttributesNames.STRENGTH_ENDURANCE;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(TEN, attributeValue);
		
		
		attributeName = AttributesNames.DEXTERITY_SPEED;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(SIXTEEN, attributeValue);
		
		attributeName = AttributesNames.DEXTERITY_COORDINATION;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(SIXTEEN, attributeValue);
		
		
		attributeName = AttributesNames.CONSTITUTION_TOUGHNESS;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, NEGATIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(TEN, attributeValue);
		
		attributeName = AttributesNames.CONSTITUTION_RESISTANCE;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(SIXTEEN, attributeValue);
		
		
		attributeName = AttributesNames.INTELLIGENCE_KNOWLEDGE;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(SIXTEEN, attributeValue);
		
		attributeName = AttributesNames.INTELLIGENCE_LOGIC;
    AttributesValueHandler.addAttributeByPosition(values, attributeName, NEGATIVE);
    attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
    assertEquals(TWELVE, attributeValue);
		
		
    attributeName = AttributesNames.WISDOM_INSTINCT;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, NEGATIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(THIRTEEN, attributeValue);

		attributeName = AttributesNames.WISDOM_INTUITION;
    AttributesValueHandler.addAttributeByPosition(values, attributeName, NEGATIVE);
    attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
    assertEquals(FOURTEEN, attributeValue);
		
		
    attributeName = AttributesNames.CHARISMA_APPEARANCE;
    AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
    attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
    assertEquals(FOURTEEN, attributeValue);
    
    attributeName = AttributesNames.CHARISMA_CHARM;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, POSITIVE);
		attributeValue = AttributesValueHandler.getAttributeByPosition(values, attributeName);
		assertEquals(FOURTEEN, attributeValue);
	}
	
	/**
   * Validate invalid name input.
   */
	@Test(expected = InvalidAttributeNameException.class)
  public final void testShouldFailWhenValidatingInvalidSpecializationNames() {
		AttributesNames attributeName = AttributesNames.STRENGTH;
		AttributesValueHandler.addAttributeByPosition(values, attributeName, 1);
	}
}
