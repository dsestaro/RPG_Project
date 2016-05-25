package br.com.sestaro.characters.commons.attributes.model.utils.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import br.com.sestaro.characters.commons.attributes.model.exceptions.InvalidAttributeValueException;
import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.subdivision.Resistance;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.subdivision.Toughness;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Steps to test attributes initials configurations.
 * 
 * @author davidson.sestaro
 */
public class AttributesUtilsInitialConfigurationSteps {
  
  private ISpecialization attribute1;
  private ISpecialization attribute2;
  private String result; 
  
  /**
   * Method to receive the test value.
   * 
   * @param value1                        - Value of the frist attribute
   * @param value2                        - Value of the second attribute
   */
  @Given("the attributes $value1 and $value2")
  public final void givenAttributesValues(@Named("value1") final int value1, @Named("value2") final int value2) {
    this.attribute1 = new Resistance(value1);
    this.attribute2 = new Toughness(value2);
  }
  
  /**
   * Method to compare the values.
   */
  @When("comparing the attributes values")
  public final void whenComparingTheValues() {
    try {
      AttributesUtils.initialValidations(attribute1, attribute2);
      result = "OK";
    } catch (InvalidAttributeValueException e) {
      result = "NOK";
    }
  }
  
  /**
   * Method that check if the condition is valid.
   * 
   * @param value                         - Value to test
   */
  @Then("the attribute result should be $value")
  public final void thenResultShouldBe(@Named("value") final String value) {
    if (!value.equals(result)) {
      throw new RuntimeException("The value should be " + value + ", but it was " + result);
    }
  }
}
