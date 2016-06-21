package br.com.sestaro.characters.commons.attributes.model.values.specializations.intelligence.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Intelligence subdivion.
 * 
 * @author davidson.sestaro
 */
@Entity
public class Knowledge implements ISpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int knowledge;
    private static final String NAME = "Knowledge";

    /**
     * @param value
     *            - Knowledge value
     */
    public Knowledge(final int value) {
	setValue(value);
    }

    /**
     * Constructor for hibernate use.
     */
    public Knowledge() {
	setValue(0);
    }

    /**
     * @return - Return knowledge value
     */
    public final int getValue() {
	return this.knowledge;
    }

    /**
     * @param value
     *            - Knowledge value
     */
    public final void setValue(final int value) {
	AttributesUtils.validateAttributeValue(value);
	this.knowledge = value;
    }

    /**
     * @return - Return the specialization name
     */
    public final String getName() {
	return NAME;
    }
}