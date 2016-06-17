package br.com.sestaro.characters.commons.rules.attributes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.rules.ExternalResource;

public class SessionRules extends ExternalResource {
    private SessionFactory sessionFactory;
    private Session session;

    @Before
    public final void initialConfiguration() {
	sessionFactory = new Configuration().configure().buildSessionFactory();
	session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
    }

    public final SessionFactory getSessionFactory() {
	return sessionFactory;
    }

    public final Session getSession() {
	return session;
    }
}
