package br.com.sestaro.characters.commons.attributes.model.values.specializations.constitution.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Constituion subdivion.
 * 
 * @author davidson.sestaro
 */
@Entity
public class Resistance implements ISpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int resistance;
    private static final String NAME = "Resistance";

    /**
     * @param value
     *            - Resistence value
     */
    public Resistance(final int value) {
	setValue(value);
    }

    /**
     * Constructor for hibernate use.
     */
    public Resistance() {
	setValue(0);
    }

    /**
     * @return - Return resistence value
     */
    public final int getValue() {
	return this.resistance;
    }

    /**
     * @param value
     *            - Resistence value
     */
    public final void setValue(final int value) {
	AttributesUtils.validateAttributeValue(value);
	this.resistance = value;
    }

    /**
     * @return - Return the specialization name
     */
    public final String getName() {
	return NAME;
    }
}
