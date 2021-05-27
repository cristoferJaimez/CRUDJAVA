/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.practica.crud_practica.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import static javax.swing.UIManager.getInt;

/**
 *
 * @author cristo
 * @param <T>
 * @param <PK>
 */
public abstract class GenericDAO<T, PK> implements DAO<T, PK> {

    // 50% restante del crud estandar
    public static final String PU = "CRUD_PRACTICA";
    @PersistenceContext(unitName = PU)
    protected EntityManager em;

    protected Class<T> className;

    public GenericDAO(Class<T> classname) {
        this.className = classname;

    }
    
    
     @Override
    public T crear(T obj) {
        T newObj = em.merge(obj);
        em.persist(newObj);
        return newObj;
    }

    @Override
    public T obtenerXId(PK id) {
        return em.find(this.className, id);
    }

    @Override
    public List<T> obtenerAll() {

        em.getEntityManagerFactory().getCache().evictAll();
        TypedQuery<T> tq = (TypedQuery<T>) em.createNamedQuery(className.getSimpleName() + ".getAll", className);

        return tq.getResultList();
    }

    @Override
    public void eliminar(PK id) {
        em.remove(getInt(id));
    }

    @Override
    public T actualizar(T obj) {
        return crear(obj);
    }


}
