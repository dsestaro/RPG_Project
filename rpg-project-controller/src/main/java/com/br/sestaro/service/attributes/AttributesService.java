package com.br.sestaro.service.attributes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

@Service
public class AttributesService {
    
    private Gson gson;
    
    public AttributesService() {
	this.gson = new Gson();
    }
    
    public final String getAttributeNames() {
	List<String> attributeNames = new ArrayList<String>();

	attributeNames.add(Strength.getName());
	attributeNames.add(Dexterity.getName());
	attributeNames.add(Constitution.getName());
	attributeNames.add(Intelligence.getName());
	attributeNames.add(Wisdom.getName());
	attributeNames.add(Charisma.getName());

	return this.gson.toJson(attributeNames);
    }
}
