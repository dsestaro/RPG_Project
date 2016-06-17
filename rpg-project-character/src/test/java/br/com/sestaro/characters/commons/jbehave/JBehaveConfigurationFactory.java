package br.com.sestaro.characters.commons.jbehave;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;

/**
 * Factory to return a {@link Configuration}.
 * 
 * @author davidson.sestaro
 */
public final class JBehaveConfigurationFactory {

    private static Configuration configuration;

    /**
     * Constructor to prevent class instantiation.
     */
    private JBehaveConfigurationFactory() {
    }

    /**
     * @return - An instance of the jbehave configuration.
     */
    public static Configuration getConfiguration() {
	if (configuration == null) {
	    configuration = new MostUsefulConfiguration();
	}

	return configuration;
    }
}
