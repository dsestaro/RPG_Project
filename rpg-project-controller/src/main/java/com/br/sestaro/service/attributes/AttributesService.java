package com.br.sestaro.service.attributes;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sestaro.characters.communication.facades.AttributesFacade;


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
	return AttributesFacade.getAttributesNames();
    }
}
