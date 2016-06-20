package br.com.sestaro.characters.dao.factory;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionFactory {

    private static org.hibernate.SessionFactory sf;
    
    /**
     * Private constructor to prevent instantiation.
     */
    private SessionFactory() {
    }
    
    public static Session getSession() {
	if(sf == null) {
	    sf = new Configuration().configure().buildSessionFactory();
	}
	
	return sf.openSession();
    }
}
