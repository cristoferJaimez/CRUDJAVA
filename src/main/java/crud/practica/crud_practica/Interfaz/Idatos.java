/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.practica.crud_practica.Interfaz;

import crud.practica.crud_practica.DAO.DAO;
import crud.practica.crud_practica.Model.Datos;
import java.util.List;

import javax.ejb.Local;

/**
 *
 * @author cristo
 */
@Local
public interface Idatos extends DAO<Datos,Integer>{
    
    
    // se declaran metoso especiales que nesecite solo para la clase dato
    //List<Datos> listaApellidos();
    
    
    
}
