package com.br.sestaro.service.attributes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

/**
 * Class service to handle with atributtes values.
 * 
 * @author davidson.sestaro
 */
@Service
public class AttributesService {
    
    /**
     * Get all the attributes names.
     * 
     * @return						- List of attributes names
     */
    public final List<String> getAttributeNames() {
	List<String> attributeNames = new ArrayList<String>();

	attributeNames.add(Strength.getName());
	attributeNames.add(Dexterity.getName());
	attributeNames.add(Constitution.getName());
	attributeNames.add(Intelligence.getName());
	attributeNames.add(Wisdom.getName());
	attributeNames.add(Charisma.getName());

	return attributeNames;
    }
}
