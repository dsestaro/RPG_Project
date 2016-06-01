package br.com.sestaro.characters.commons.attributes.dao.specialization.interfaces;

import java.util.List;

/**
 * Interface to connect to the database.
 * 
 * @author davidson.sestaro
 *
 * @param <T>					- Class to implement the DAO
 */
public interface IObjectDAO<T> {
    
    /**
     * @return					- Return all registers of the table T
     */
    List<T> getAll();
    
    /**
     * @param value				- ID of the record
     * @return					- Record of the class T with ID equals value
     */
    T getById(Long value);
    
    /**
     * @param value				- Record to be deleted
     */
    void delete(T value);
    
    /**
     * Saves if the record didn't exist or update if it's already in the database.
     * 
     * @param value				- Record
     * @return					- Record ID
     */
    Long saveOrUpdate(T value);
}
