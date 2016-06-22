package br.com.sestaro.characters.dao.factory;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.reflections.Reflections;

/**
 * Class to create hibernate sessions in a factory way.
 * 
 * @author davidson.sestaro
 */
public final class SessionFactory {

    private static org.hibernate.SessionFactory sf;

    /**
     * Private constructor to prevent instantiation.
     */
    private SessionFactory() {
    }

    /**
     * @return - Hibernate Session
     */
    public static Session getSession() {
	if (sf == null) {
	    Configuration configuration = new Configuration();

	    configuration.configure();

	    Reflections reflections = new Reflections("br.com.sestaro.characters.commons");

	    Set<Class<?>> classes = reflections.getTypesAnnotatedWith(javax.persistence.Entity.class);

	    for (Class<?> clazz : classes) {
		configuration.addAnnotatedClass(clazz);
	    }

	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
		    .applySettings(configuration.getProperties()).build();
	    sf = configuration.buildSessionFactory(serviceRegistry);
	}

	return sf.openSession();
    }
}
