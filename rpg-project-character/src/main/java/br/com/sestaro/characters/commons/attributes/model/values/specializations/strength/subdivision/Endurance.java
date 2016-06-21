package br.com.sestaro.characters.commons.attributes.model.values.specializations.strength.subdivision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.specializations.generalizations.interfaces.ISpecialization;

/**
 * Strength subdivision.
 * 
 * @author davidson.sestaro
 */
@Entity
public class Endurance implements ISpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int endurance;
    private static final String NAME = "Endurance";

    /**
     * @param value
     *            - Endurance value
     */
    public Endurance(final int value) {
	setValue(value);
    }

    /**
     * Constructor for hibernate use.
     */
    public Endurance() {
	setValue(0);
    }

    /**
     * @return - Return endurance value
     */
    public final int getValue() {
	return this.endurance;
    }

    /**
     * @param value
     *            - Endurance value
     */
    public final void setValue(final int value) {
	AttributesUtils.validateAttributeValue(value);
	this.endurance = value;
    }

    /**
     * @return - Return the specialization name
     */
    public final String getName() {
	return NAME;
    }
}
