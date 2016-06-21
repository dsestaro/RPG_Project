package br.com.sestaro.characters.commons.attributes.model;

import javax.persistence.Entity;

import br.com.sestaro.characters.commons.attributes.model.enums.AttributesNames;
import br.com.sestaro.characters.commons.attributes.model.exceptions.NullAttributesException;
import br.com.sestaro.characters.commons.attributes.model.generalization.AttributesAbstract;
import br.com.sestaro.characters.commons.attributes.model.utils.AttributesUtils;
import br.com.sestaro.characters.commons.attributes.model.values.AttributesValueHandler;
import br.com.sestaro.characters.commons.attributes.model.values.AttributesValues;

/**
 * Class to interact and manipulate the attribute values. 
 * 
 * @author davidson.sestaro
 */
@Entity
public class Attributes extends AttributesAbstract {
  
	/**
	 * @param value                              - Attribute values
	 */
	public Attributes(final AttributesValues value) {
		if (value == null) {
			throw new NullAttributesException();
		}
		
		this.setValues(value);
	}
	
	/**
	 * Constructor for hibernate use.
	 */
	public Attributes() {
	    this.setValues(new AttributesValues());
	}

	/**
	 * Given a attribute name returns its modifier.
	 * 
	 * @param value                              - Attribute name
	 * @return                                   - Attribute modifier
	 */
	public final int getAttributeModifier(final AttributesNames value) {
		return AttributesUtils.calculateModifier(AttributesValueHandler.getAttributeByPosition(this.getValues(), value));
	}
	
	/**
	 * Given a attribute name and a value, the method sums this value to the attribute.
	 * 
	 * @param value1                             - Attribute name
	 * @param value2                             - Value
	 */
	public final void addAttributeValue(final AttributesNames value1, final int value2) {
		AttributesValueHandler.addAttributeByPosition(this.getValues(), value1, value2);
	}
}
