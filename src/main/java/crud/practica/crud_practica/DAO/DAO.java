/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.practica.crud_practica.DAO;

import java.util.List;

/**
 *
 * @author cristo
 * @param <T>
 * @param <PK>
 */
public interface DAO<T, PK> {
    
    
    // DAO mantienen los metodos del crud declara guardar, eliminar, actualizar, borrar, leer.
    
    // ya podemos crear 50%
    T crear(T obj);


    //dato por id
    T obtenerXId(PK id);
    
    
    //arreglo de tipo lista
    List<T> obtenerAll();
    
    
    
    //eliminar logico o fisico.
    void eliminar(PK id);
    
    
    //actualizar
    T actualizar(T obj);
    
    
    
    
}
