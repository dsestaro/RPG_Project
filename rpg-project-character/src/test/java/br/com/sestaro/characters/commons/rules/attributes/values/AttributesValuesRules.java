package br.com.sestaro.characters.commons.rules.attributes.values;

import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.EIGHT;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.FIFTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.SIXTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.THIRTEEN;
import static br.com.sestaro.characters.commons.attributes.model.utils.NumericValuesConstantValues.TWELVE;

import org.junit.Before;
import org.junit.rules.ExternalResource;

import br.com.sestaro.characters.commons.attributes.model.values.AttributesValues;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.wisdom.Wisdom;

/**
 * Class to handle attributes values inside test cases. 
 * 
 * @author davidson.sestaro
 */
public class AttributesValuesRules extends ExternalResource {

    private AttributesValues attributes;
    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;
    private Wisdom wisdom;
    private Charisma charisma;

    /**
     * Default constructor to initialize the variables.
     */
    public AttributesValuesRules() {
	beforeInitialTestsConfiguration();
    }

    /**
     * Initial configuration.
     */
    @Before
    public final void beforeInitialTestsConfiguration() {
	this.strength = new Strength(TWELVE, SIXTEEN);
	this.dexterity = new Dexterity(SIXTEEN, THIRTEEN);
	this.constitution = new Constitution(THIRTEEN, FIFTEEN);
	this.intelligence = new Intelligence(TWELVE, SIXTEEN);
	this.wisdom = new Wisdom(EIGHT, TWELVE);
	this.charisma = new Charisma(TWELVE, TWELVE);

	this.attributes = new AttributesValues(strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    /**
     * @return					- Get attributes values
     */
    public final AttributesValues getAttributes() {
	return attributes;
    }

    /**
     * @return					- Get Strength
     */
    public final Strength getStrength() {
	return strength;
    }

    /**
     * @return					- Get Dexterity
     */
    public final Dexterity getDexterity() {
	return dexterity;
    }

    /**
     * @return					- Get Constitution
     */
    public final Constitution getConstitution() {
	return constitution;
    }

    /**
     * @return					- Get Intelligence
     */
    public final Intelligence getIntelligence() {
	return intelligence;
    }

    /**
     * @return					- Get Wisdom
     */
    public final Wisdom getWisdom() {
	return wisdom;
    }

    /**
     * @return					- Get Charisma
     */
    public final Charisma getCharisma() {
	return charisma;
    }
}
