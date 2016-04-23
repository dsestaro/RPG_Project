package test.java.br.com.sestaro.character.commons.attributes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.br.com.sestaro.characters.commons.attributes.Attributes;
import main.java.br.com.sestaro.characters.commons.attributes.exceptions.NullAttributesException;
import main.java.br.com.sestaro.characters.commons.attributes.values.AttributesValues;

public class AttributesTests {

	@Test
	public void testInitializationWithValues() {
		new Attributes(new AttributesValues());
	}
	
	@Test(expected=NullAttributesException.class)
	public void testNullAttributesValueInitialization() {
		new Attributes(null);
	}
}
