/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.practica.crud_practica.JPA;

import crud.practica.crud_practica.DAO.GenericDAO;
import crud.practica.crud_practica.Interfaz.Idatos;
import crud.practica.crud_practica.Model.Datos;

import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */

@Stateless
public class DatosJPA  extends GenericDAO<Datos, Integer> implements Idatos{

   
    
    public DatosJPA() {
        super(Datos.class);
    }
    
    // toda la logica de los metodos que nesecite
    
    
    
    
}
