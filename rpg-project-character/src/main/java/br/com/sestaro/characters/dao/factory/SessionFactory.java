package br.com.sestaro.characters.dao.factory;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

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
     * @return					- Hibernate Session
     */
    public static Session getSession() {
	if (sf == null) {
	    sf = new Configuration().configure().buildSessionFactory();
	}
	
	return sf.openSession();
    }
}
