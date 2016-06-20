package br.com.sestaro.characters.commons.rules.attributes.dao;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.rules.ExternalResource;

import br.com.sestaro.characters.dao.factory.SessionFactory;

/**
 * Rules to instantiate a session in tests class.
 * 
 * @author davidson.sestaro
 *
 */
public class SessionRules extends ExternalResource {
    private Session session;

    /**
     * Initialize all the necessary variables.
     */
    public SessionRules() {
	initialConfiguration();
    }
    
    /**
     * Initialize all the necessary variables.
     */
    @Before
    public final void initialConfiguration() {
	session = SessionFactory.getSession();
	session.beginTransaction();
    }

    /**
     * @return					- Session
     */
    public final Session getSession() {
	return session;
    }
}
