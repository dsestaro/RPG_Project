package br.com.sestaro.characters.commons.attributes.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.sestaro.characters.commons.attributes.model.Attributes;
import br.com.sestaro.characters.dao.specialization.abstracts.ObjectDAOAbstract;

/**
 * Class to implement the database access methods of the class Attributes.
 * 
 * @author davidson.sestaro
 */
public class AttributesDAO extends ObjectDAOAbstract<Attributes> {

    @Override
    public final Attributes getById(final Long value) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	Session session = sf.openSession();
        
	session.beginTransaction();
        
	Attributes attributes = (Attributes) session.get(Attributes.class, value);
        
        session.flush();
        session.getTransaction().commit();
	
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final List<Attributes> getAll() {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	Session session = sf.openSession();
        
	session.beginTransaction();
	
	List<Attributes> attributesList = session.createCriteria(Attributes.class).list();  
        
        session.flush();
        session.getTransaction().commit();
        
        return attributesList;
    }

}
