package com.br.sestaro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.sestaro.characters.commons.attributes.values.specializations.charisma.Charisma;
import br.com.sestaro.characters.commons.attributes.values.specializations.constitution.Constitution;
import br.com.sestaro.characters.commons.attributes.values.specializations.dexterity.Dexterity;
import br.com.sestaro.characters.commons.attributes.values.specializations.intelligence.Intelligence;
import br.com.sestaro.characters.commons.attributes.values.specializations.strength.Strength;
import br.com.sestaro.characters.commons.attributes.values.specializations.wisdom.Wisdom;

@RestController
public class ApplicationStatusController {

	@RequestMapping(value="/getNames", method=RequestMethod.GET)
	public String showStatus() {
		List<String> attributeNames = new ArrayList<String>();
		
		attributeNames.add(Strength.getName());
		attributeNames.add(Dexterity.getName());
		attributeNames.add(Constitution.getName());
		attributeNames.add(Intelligence.getName());
		attributeNames.add(Wisdom.getName());
		attributeNames.add(Charisma.getName());
		
		return new Gson().toJson(attributeNames);
	}
}
