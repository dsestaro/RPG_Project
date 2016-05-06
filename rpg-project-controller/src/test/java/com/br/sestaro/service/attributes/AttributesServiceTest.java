package com.br.sestaro.service.attributes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AttributesServiceTest {
    
    private AttributesService attributesService;
    private static final boolean EXIST = true;
    
    @Before
    public final void initialization() {
	this.attributesService = new AttributesService();
    }
    
    @Test
    public final void getNamesTest() {
	assertEquals(EXIST, attributesService.getAttributeNames().contains("STR"));
	assertEquals(EXIST, attributesService.getAttributeNames().contains("DEX"));
	assertEquals(EXIST, attributesService.getAttributeNames().contains("CON"));
	assertEquals(EXIST, attributesService.getAttributeNames().contains("INT"));
	assertEquals(EXIST, attributesService.getAttributeNames().contains("WIS"));
	assertEquals(EXIST, attributesService.getAttributeNames().contains("CHA"));
    }
}
