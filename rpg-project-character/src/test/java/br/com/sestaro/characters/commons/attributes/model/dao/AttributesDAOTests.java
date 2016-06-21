package br.com.sestaro.characters.commons.attributes.model.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.rules.attributes.dao.SessionRules;
import br.com.sestaro.characters.commons.attributes.model.Attributes;
import br.com.sestaro.characters.commons.rules.attributes.values.AttributesValuesRules;

/**
 * Class to test {@link AttributesDAO}.
 * 
 * @author davidson.sestaro
 */
public class AttributesDAOTests extends SessionRules {

    private AttributesDAO attributesDAO;
    private Attributes attributes;
    private AttributesValuesRules attributesValues = new AttributesValuesRules();

    /**
     * Initialize variables.
     */
    @Before
    public final void initialTestConfiguration() {
	attributesDAO = new AttributesDAO();
	attributes = new Attributes(attributesValues.getAttributes());
    }
    
    @Test
    public final void saveAnAttributeSuccessfully() {
	attributesDAO.saveOrUpdate(attributes);
	
	Assert.assertEquals(attributesDAO.getById(attributes.getId()).getId(), attributes.getId());
    }
}
