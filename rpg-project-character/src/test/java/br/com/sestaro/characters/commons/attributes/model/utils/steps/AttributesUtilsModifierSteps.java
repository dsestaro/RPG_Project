package br.com.sestaro.characters.commons.attributes.model.utils.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;

/**
 * Steps to test attribute modifiers.
 * 
 * @author davidson.sestaro
 */
public class AttributesUtilsModifierSteps {

    private int attribute;
    private int modifier;

    /**
     * Method to receive the test value.
     * 
     * @param value
     *            - Value to use
     */
    @Given("an attribute with value $value")
    public final void givenAttributeValue(@Named("value") final int value) {
	this.attribute = value;
    }

    /**
     * Method to calculate the modifier.
     * 
     * @param value
     *            - Value calculate
     */
    @When("I get the modifier from $value")
    public final void whenModifierCalculated(@Named("value") final int value) {
	this.modifier = AttributesUtils.calculateModifier(value);
    }

    /**
     * Method that check if the condition is valid.
     * 
     * @param value
     *            - Value to test
     */
    @Then("modifier should be $value")
    public final void thenModifierShouldBe(@Named("value") final int value) {
	if (value != modifier) {
	    throw new RuntimeException("x is " + attribute + ", but should be " + value);
	}
    }
}
