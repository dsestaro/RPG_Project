package br.com.sestaro.characters.dao.specialization.abstracts;

import java.util.List;

import org.hibernate.Session;

import br.com.sestaro.characters.dao.factory.SessionFactory;
import br.com.sestaro.characters.dao.specialization.interfaces.IObjectDAO;

/**
 * Class to implement the basic methods of the DAO classes.
 * 
 * @author davidson.sestaro
 *
 * @param <T>
 */
public abstract class ObjectDAOAbstract<T> implements IObjectDAO<T> {
    
    /**
     * Saves if the record didn't exist or update if it's already in the database.
     * 
     * @param value				- Record
     */
    public final void saveOrUpdate(final T value) {
	Session session = SessionFactory.getSession();
        
	session.beginTransaction();
        session.saveOrUpdate(value);  
        
        session.flush();
        session.getTransaction().commit();
    }
    
    /**
     * @param value				- Record to be deleted
     */
    public final void delete(final T value) {
	Session session = SessionFactory.getSession();
        
	session.beginTransaction();
        session.delete(value);  
        
        session.flush();
        session.getTransaction().commit();
    }
    
    /**
     * @param value				- ID of the record
     * @return					- Record of the class T with ID equals value
     */
    public abstract T getById(final Long value);
    
    /**
     * @return					- Return all registers of the table T
     */
    public abstract List<T> getAll();
}
