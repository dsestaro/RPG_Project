package br.com.sestaro.characters.commons.info.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.sestaro.characters.commons.info.model.CharacterInformations;
import br.com.sestaro.characters.dao.factory.SessionFactory;
import br.com.sestaro.characters.dao.specialization.abstracts.ObjectDAOAbstract;

/**
 * Class to implement the database access methods of the class CharacterInformations.
 * 
 * @author davidson.sestaro
 */
public class CharacterInformationsDAO extends ObjectDAOAbstract<CharacterInformations> {

    @Override
    public final CharacterInformations getById(final Long value) {
	Session session = SessionFactory.getSession();
        
	session.beginTransaction();
        
	CharacterInformations characterInformations = (CharacterInformations) session.get(CharacterInformations.class, value);
        
	session.getTransaction().commit();
        session.flush();
	
        return characterInformations;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final List<CharacterInformations> getAll() {
	
	Session session = SessionFactory.getSession();
        
	session.beginTransaction();
	
	List<CharacterInformations> characterInformationsList = session.createCriteria(CharacterInformations.class).list();  
        
	session.getTransaction().commit();
        session.flush();
        
        return characterInformationsList;
    }

}
