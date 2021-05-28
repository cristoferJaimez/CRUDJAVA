/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.practica.crud_practica.Services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
import crud.practica.crud_practica.Interfaz.Idatos;
import crud.practica.crud_practica.Model.Datos;
import java.util.List;
@Stateless
public class DatosServices {
    
    @EJB
    private Idatos iDatos;
    
    
    //crear por obj 
     public void crear(Datos datos){
        iDatos.crear(datos);
        
    }
     
     
     
     
     
     
     // crear por query nativo
     public void crearDAtos(String dato, String dato2, String borrado_log){
         iDatos.guardarDato(dato, dato2,borrado_log);
     }
    
    
    
     // eliminar 
     public void eliminar(int id, String borrado_log){
         iDatos.eliminardato(id, borrado_log);
     } 
    
    
    
    // obtenemos todo los datos
    public List<Datos>listartodo(){
       return iDatos.obtenerAll();
    }
    
    
    
    
    
}
