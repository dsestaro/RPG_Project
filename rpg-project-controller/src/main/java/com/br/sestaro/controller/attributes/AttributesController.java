package com.br.sestaro.controller.attributes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.sestaro.endpoint.EndpointConfiguration;
import com.br.sestaro.service.attributes.AttributesService;

/**
 * Class to control attributes related REST methods.
 * 
 * @author davidson.sestaro
 */
@RestController
@RequestMapping(value = EndpointConfiguration.ATTRIBUTE_ROOT)
public class AttributesController {

    @Autowired
    private AttributesService attributesService;
    
    /**
     * Get attributes names.
     * 
     * @return						- List with attributes names
     */
    @RequestMapping(value = "/getAttributeNames", method = RequestMethod.GET, produces = "application/json")
    @CrossOrigin(origins = "http://localhost:9080")
    public final List<String> getAttributeNames() {
	return attributesService.getAttributeNames();
    }
}
