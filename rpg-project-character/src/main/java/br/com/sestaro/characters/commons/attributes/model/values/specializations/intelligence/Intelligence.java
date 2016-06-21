package br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence;

import javax.persistence.Entity;

import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.abstracts.AttributeAbstract;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence.subdivision.Knowledge;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence.subdivision.Logic;

/**
 * Attribute intelligence class.
 * 
 * @author davidson.sestaro
 */
@Entity
public class Intelligence extends AttributeAbstract {

    private static final String NAME = "INT";

    /**
     * @param value1
     *            - Knowledge value
     * @param value2
     *            - Logic value
     */
    public Intelligence(final int value1, final int value2) {
	super(new Knowledge(value1), new Logic(value2));
    }

    /**
     * Constructor for hibernate use.
     */
    public Intelligence() {
	super(new Knowledge(), new Logic());
    }

    /**
     * Calculate the intelligence based on the mean of the 2 specializations.
     * 
     * @return - Returns the intelligence value
     */
    public final int getIntelligence() {
	return this.getAttributeValue();
    }

    /**
     * Add the param value to the existing knowledge.
     * 
     * @param value
     *            - Increment value
     */
    public final void addKnowledge(final int value) {
	this.addValueSpecialization(getSpecialization1(), value);
    }

    /**
     * Add the param value to the existing logic.
     * 
     * @param value
     *            - Increment value
     */
    public final void addLogic(final int value) {
	this.addValueSpecialization(getSpecialization2(), value);
    }

    /**
     * @return - Knowledge value
     */
    public final int getKnowledge() {
	return this.getSpecialization1().getValue();
    }

    /**
     * @return - Logic value
     */
    public final int getLogic() {
	return this.getSpecialization2().getValue();
    }

    /**
     * @return - Return the specialization name
     */
    public static final String getName() {
	return NAME;
    }
}
