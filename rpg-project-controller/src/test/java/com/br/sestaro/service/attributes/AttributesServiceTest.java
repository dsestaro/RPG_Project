package com.br.sestaro.service.attributes;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Class to test {@link AttributesService}.
 * 
 * @author davidson.sestaro
 */
public class AttributesServiceTest {

    private AttributesService attributesService;
    private static final boolean EXIST = true;

    /**
     * Initial configuration of test class.
     */
    @Before
    public final void initialization() {
	this.attributesService = new AttributesService();
    }

    /**
     * Attributes names test.
     */
    @Test
    public final void getNamesTest() {
	List<String> names = attributesService.getAttributeNames();
	
	assertEquals(EXIST, names.contains("STR"));
	assertEquals(EXIST, names.contains("DEX"));
	assertEquals(EXIST, names.contains("CON"));
	assertEquals(EXIST, names.contains("INT"));
	assertEquals(EXIST, names.contains("WIS"));
	assertEquals(EXIST, names.contains("CHA"));
    }
}
