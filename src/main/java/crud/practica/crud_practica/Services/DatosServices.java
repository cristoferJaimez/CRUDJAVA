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
    
    // obtenemos todo los datos
    public List<Datos>listartodo(){
       return iDatos.obtenerAll();
    }
    
    
}
