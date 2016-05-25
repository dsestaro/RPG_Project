package br.com.sestaro.characters.commons.attributes.model.values.builder;

import java.util.Set;

import org.apache.commons.validator.ValidatorException;
import org.apache.commons.validator.ValidatorResults;

import br.com.sestaro.characters.commons.attributes.model.exceptions.NullAttributeValueException;
import br.com.sestaro.characters.commons.attributes.model.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.attributes.model.values.AttributesValues;
import br.com.sestaro.characters.commons.attributes.model.values.builder.validator.AttributesValuesValidatorFactory;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.wisdom.Wisdom;

/**
 * Class to simplify the process of building a AttributesValue class.
 * 
 * @author davidson.sestaro
 */
public class AttributesValuesBuilder {
  
  private Strength strength;
  private Dexterity dexterity;
  private Constitution constitution;
  private Intelligence intelligence;
  private Wisdom wisdom;
  private Charisma charisma;
  
  /**
   * Default constructor.
   */
  public AttributesValuesBuilder() {
  
  }
  
  
  /**
   * Build the AttributesValues class.
   * 
   * @return                                      - Attributes Values instance
   * @throws ValidatorException 
   */
  public final AttributesValues generateAttributesValues() {
    try {
      ValidatorResults results = AttributesValuesValidatorFactory.buildValidator(this).validate();
      
      verifyValidationsErrors(results);
    } catch (ValidatorException e) {
      throw new NullAttributesException(); 
    }
    
    return new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
  }


  /**
   * Method to verify if a attribute returned from the validation with error.
   * 
   * @param results                               - Results from the validation
   */
  private void verifyValidationsErrors(final ValidatorResults results) {
    if (results.getPropertyNames().size() > 0) {
      @SuppressWarnings("unchecked")
      Set<String> names = results.getPropertyNames();

      for (String name : names) {
        if ((Boolean) results.getValidatorResult(name).getResult("required")) {
          throw new NullAttributeValueException(name);
        }
      }
    }
  }
  
  /**
   * Set the Strength values.
   * 
   * @param value1                                - Physical strength value
   * @param value2                                - Endurance value 
   * @return                                      - This class
   */
  public final AttributesValuesBuilder setStrength(final int value1, final int value2) {
    this.strength = new Strength(value1, value2);
    
    return this;
  }
  
  /**
   * Set the Dexterity values.
   * 
   * @param value1                                - Speed value
   * @param value2                                - Coordination value 
   * @return                                      - This class
   */
  public final AttributesValuesBuilder setDexterity(final int value1, final int value2) {
    this.dexterity = new Dexterity(value1, value2);
    
    return this;
  }
  
  /**
   * Set the Constitution values.
   * 
   * @param value1                                - Thoughness value
   * @param value2                                - Resistence value 
   * @return                                      - This class
   */
  public final AttributesValuesBuilder setConstitution(final int value1, final int value2) {
    this.constitution = new Constitution(value1, value2);
    
    return this;
  }
  
  /**
   * Set the Intelligence values.
   * 
   * @param value1                                - Knowledge value
   * @param value2                                - Logic value  
   * @return                                      - This class
   */
  public final AttributesValuesBuilder setIntelligence(final int value1, final int value2) {
    this.intelligence = new Intelligence(value1, value2);
    
    return this;
  }
  
  /**
   * Set the Wisdom values.
   * 
   * @param value1                                - Instinct value
   * @param value2                                - Intuition value   
   * @return                                      - This class
   */
  public final AttributesValuesBuilder setWisdom(final int value1, final int value2) {
    this.wisdom = new Wisdom(value1, value2);
    
    return this;
  }
  
  /**
   * Set the Charisma values.
   * 
   * @param value1                                - Appearance value
   * @param value2                                - Charm value 
   * @return                                      - This class
   */
  public final AttributesValuesBuilder setCharisma(final int value1, final int value2) {
    this.charisma = new Charisma(value1, value2);
    
    return this;
  }

  /**
   * Get the strength object.
   * 
   * @return                                          - Value
   */
  public final Strength getStrength() {
    return strength;
  }

  /**
   * Get the dexterity object.
   * 
   * @return                                          - Value
   */
  public final Dexterity getDexterity() {
    return dexterity;
  }

  /**
   * Get the constitution object.
   * 
   * @return                                          - Value
   */
  public final Constitution getConstitution() {
    return constitution;
  }

  /**
   * Get the intelligence object.
   * 
   * @return                                          - Value
   */
  public final Intelligence getIntelligence() {
    return intelligence;
  }

  /**
   * Get the wisdom object.
   * 
   * @return                                          - Value
   */
  public final Wisdom getWisdom() {
    return wisdom;
  }

  /**
   * Get the charisma object.
   * 
   * @return                                          - Value
   */
  public final Charisma getCharisma() {
    return charisma;
  }
}
