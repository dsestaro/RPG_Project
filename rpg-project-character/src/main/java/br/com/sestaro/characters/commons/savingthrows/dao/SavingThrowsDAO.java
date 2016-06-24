package br.com.sestaro.characters.commons.savingthrows.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.sestaro.characters.commons.savingthrows.model.SavingThrows;
import br.com.sestaro.characters.dao.factory.SessionFactory;
import br.com.sestaro.characters.dao.specialization.abstracts.ObjectDAOAbstract;

/**
 * Class to implement the database access methods of the class SavingThrows.
 * 
 * @author davidson.sestaro
 */
public class SavingThrowsDAO extends ObjectDAOAbstract<SavingThrows> {

    @Override
    public final SavingThrows getById(final Long value) {
	Session session = SessionFactory.getSession();
        
	session.beginTransaction();
        
	SavingThrows savingThrows = (SavingThrows) session.get(SavingThrows.class, value);
        
	session.getTransaction().commit();
        session.flush();
	
        return savingThrows;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final List<SavingThrows> getAll() {
	
	Session session = SessionFactory.getSession();
        
	session.beginTransaction();
	
	List<SavingThrows> savingThrowsList = session.createCriteria(SavingThrows.class).list();  
        
	session.getTransaction().commit();
        session.flush();
        
        return savingThrowsList;
    }

}
