package br.com.sestaro.characters.commons.info.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.sestaro.characters.commons.attributes.dao.AttributesDAO;
import br.com.sestaro.characters.commons.info.model.CharacterInformations;
import br.com.sestaro.characters.commons.rules.SessionRules;
import br.com.sestaro.characters.commons.rules.info.values.CharacterInformationsRules;

/**
 * Class to test {@link AttributesDAO}.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationsDAOTests extends SessionRules {

    private CharacterInformationsDAO characterInformationsDAO;
    private CharacterInformations characterInformations;
    private CharacterInformationsRules characterInformationsRules = new CharacterInformationsRules();

    /**
     * Initialize variables.
     */
    @Before
    public final void initialTestConfiguration() {
	characterInformationsDAO = new CharacterInformationsDAO();
	characterInformations = new CharacterInformations(characterInformationsRules.getCharacter());
    }
    
    /**
     * Save an attribute and verify if the insertion was done correctly.
     */
    @Test
    public final void saveAnAttributeSuccessfully() {
	characterInformationsDAO.saveOrUpdate(characterInformations);
	
	Assert.assertEquals(characterInformationsDAO.getById(characterInformations.getId()).getId(), characterInformations.getId());
    }
    
    /**
     * Delete an attribute and verify if the deletion was done correctly.
     */
    @Test
    public final void deleteAnAttributeSuccessfully() {
	characterInformationsDAO.saveOrUpdate(characterInformations);
	
	Long id = characterInformations.getId();
	
	characterInformationsDAO.delete(characterInformations);
	
	Assert.assertNull(characterInformationsDAO.getById(id));
    }
    
    /**
     * Get all the attributes.
     */
    @Test
    public final void getAllAttributesSuccessfully() {
	Assert.assertNotNull(characterInformationsDAO.getAll());
    }
}
