package br.com.sestaro.characters.commons.info.model.utils.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import br.com.sestaro.characters.commons.info.model.exceptions.InvalidInformationException;
import br.com.sestaro.characters.commons.info.model.utils.CharacterInformationUtils;

/**
 * Steps to test infomation inputs.
 * 
 * @author davidson.sestaro
 */
public class InfoStringAttributesValidationSteps {

    private String information;
    private String result;

    /**
     * Method to receive the test value.
     * 
     * @param value
     *            - Value to use
     */
    @Given("the string with value $value")
    public final void givenAttributeValue(@Named("value") final String value) {
	this.information = value;
    }

    /**
     * Method to receive the test null value.
     */
    @Given("the string with NULL value")
    public final void givenAttributeValue() {
	this.information = null;
    }

    /**
     * Method to validate the String.
     */
    @When("validating the given value")
    public final void whenModifierCalculated() {
	try {
	    CharacterInformationUtils.validateInformation(information);
	    this.result = "OK";
	} catch (InvalidInformationException e) {
	    this.result = "NOK";
	}
    }

    /**
     * Method that check if the condition is valid.
     * 
     * @param value
     *            - Value to test
     */
    @Then("the information result should be $value")
    public final void thenModifierShouldBe(@Named("value") final String value) {
	if (!this.result.equals(value)) {
	    throw new RuntimeException("The value should be " + value + ", but it was " + result);
	}
    }
}
