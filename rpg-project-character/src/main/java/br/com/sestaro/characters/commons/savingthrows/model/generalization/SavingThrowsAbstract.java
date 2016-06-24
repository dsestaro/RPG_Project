package br.com.sestaro.characters.commons.savingthrows.model.generalization;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.com.sestaro.characters.commons.savingthrows.model.values.SavingThrowsValues;

/**
 * Abstract class to interact and manipulate the saving throws values. 
 * 
 * @author davidson.sestaro
 */
@MappedSuperclass
public abstract class SavingThrowsAbstract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(targetEntity = SavingThrowsValues.class)
    @Cascade(CascadeType.ALL)
    private SavingThrowsValues values;
    
    /**
     * @return                                   - Id value
     */
    public final Long getId() {
      return id;
    }

    /**
     * @return                                   - Saving Throws values
     */
    public final SavingThrowsValues getValues() {
      return values;
    }

    /**
     * Set the attributes values.
     * 
     * @param value                              - Saving Throws values
     */
    public final void setValues(final SavingThrowsValues value) {
      this.values = value;
    }
}
