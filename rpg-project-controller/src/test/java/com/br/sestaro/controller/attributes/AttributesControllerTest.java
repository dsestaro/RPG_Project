package com.br.sestaro.controller.attributes;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.br.sestaro.configuration.start.SpringInit;
import com.jayway.restassured.RestAssured;

/**
 * Class to test {@link AttributesController}.
 * 
 * @author davidson.sestaro
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringInit.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class AttributesControllerTest {
	@Value("${local.server.port}")
	private int port;
	
	/**
	 * Initial configuration of test class.
	 */
	@Before
	public final void setUp() {
		RestAssured.port = port;
	}
	
	/**
	 * Attributes names test.
	 */
	@Test
	public final void getAttributesNamesTest() {
		given().
		expect().
		         body(is("[\"STR\",\"DEX\",\"CON\",\"INT\",\"WIS\",\"CHA\"]")).
		when().
		         get("/attributes/getAttributeNames");
	}
}
