package com.br.sestaro.controller.attributes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.sestaro.endpoint.EndpointConfiguration;
import com.br.sestaro.service.attributes.AttributesService;

@RestController
@RequestMapping(value = EndpointConfiguration.ATTRIBUTE_ROOT)
public class AttributesController {

    @Autowired
    AttributesService attributesService;
    
    @RequestMapping(value = "/getAttributeNames", method = RequestMethod.GET, produces="application/json")
    public List<String> showStatus() {
	return attributesService.getAttributeNames();
    }
}
