package br.com.sestaro.characters.commons.savingthrows.model.values;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class that group all the saving throws and give the methods to access their
 * values.
 * 
 * @author davidson.sestaro
 */
@Entity
public class SavingThrowsValues {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int fortitude;
    
    private int reflex;
    
    private int will;

    /**
     * @param value1
     *            - Fortitude
     * @param value2
     *            - Reflex
     * @param value3
     *            - Will
     */
    public SavingThrowsValues(final int value1, final int value2, final int value3) {
	this.fortitude = value1;
	this.reflex = value2;
	this.will = value3;
    }

    /**
     * Constructor for hibernate use.
     */
    public SavingThrowsValues() {
	this.fortitude = 0;
	this.reflex = 0;
	this.will = 0;
    }

    /**
     * @return - Fortitude
     */
    public final int getFortitude() {
	return fortitude;
    }

    /**
     * @param value
     *            - Fortitude
     */
    public final void setFortitude(final int value) {
	this.fortitude = value;
    }

    /**
     * @return - Reflex
     */
    public final int getReflex() {
	return reflex;
    }

    /**
     * @param value
     *            - Reflex
     */
    public final void setReflex(final int value) {
	this.reflex = value;
    }

    /**
     * @return - Will
     */
    public final int getWill() {
	return will;
    }

    /**
     * @param value
     *            - Will
     */
    public final void setWill(final int value) {
	this.will = value;
    }
}
