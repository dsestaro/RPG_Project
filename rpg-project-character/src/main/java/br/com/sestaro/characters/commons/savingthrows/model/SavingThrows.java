package br.com.sestaro.characters.commons.savingthrows.model;

import javax.persistence.Entity;

import br.com.sestaro.characters.commons.savingthrows.model.enums.SavingThrowsNames;
import br.com.sestaro.characters.commons.savingthrows.model.exceptions.NullSavingThrowsException;
import br.com.sestaro.characters.commons.savingthrows.model.generalization.SavingThrowsAbstract;
import br.com.sestaro.characters.commons.savingthrows.model.values.SavingThrowsValueHandler;
import br.com.sestaro.characters.commons.savingthrows.model.values.SavingThrowsValues;

/**
 * Class to interact and manipulate the saving throws values.
 * 
 * @author davidson.sestaro
 */
@Entity
public class SavingThrows extends SavingThrowsAbstract {

    /**
     * @param value
     *            - Saving throws values
     */
    public SavingThrows(final SavingThrowsValues value) {
	if (value == null) {
	    throw new NullSavingThrowsException();
	}

	setValues(value);
    }

    /**
     * Constructor for hibernate use.
     */
    public SavingThrows() {
	setValues(new SavingThrowsValues());
    }

    /**
     * Given a saving throw name returns its value.
     * 
     * @param value
     *            - Saving throw name
     * @return - Saving throw value
     */
    public final int getSavingThrowTotal(final SavingThrowsNames value) {
	return SavingThrowsValueHandler.getSavingThrowByPosition(getValues(), value);
    }

    /**
     * Given a saving throw name and a value, the method sums this value to the
     * saving throw.
     * 
     * @param value1
     *            - Saving throw name
     * @param value2
     *            - Value
     */
    public final void setSavingThrowTotalValue(final SavingThrowsNames value1, final int value2) {
	SavingThrowsValueHandler.setSavingThrowByPosition(getValues(), value1, value2);
    }
}
