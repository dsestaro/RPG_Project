package br.com.sestaro.characters.commons.rules.attributes.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
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
    private Transaction transaction;

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
	transaction = session.beginTransaction();
    }

    /**
     * Finalize all the necessary variables.
     */
    @After
    public final void finalConfiguration() {
	transaction.rollback();
    }
    
    /**
     * @return					- Session
     */
    public final Session getSession() {
	return session;
    }
    
    /**
     * Commit the alterations made.
     */
    public final void commit() {
	transaction.commit();
    }
}
