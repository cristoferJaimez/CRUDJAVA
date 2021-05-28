/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.practica.crud_practica.Controllers;

import crud.practica.crud_practica.Model.Datos;
import crud.practica.crud_practica.Services.DatosServices;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@Named("controladorDeDatos")
@SessionScoped
public class DatosController implements Serializable {

    @EJB
    private DatosServices datosServicios;
    private Datos datos;

    @PostConstruct
    public void init() {
        this.datos = new Datos();

    }

    private String dato;
    private String dato2;
    private String borrado_log;

    private int editarDato;

    public void crear() {
        try {
//            datosServicios.crear(datos);

            datosServicios.crearDAtos(dato, dato2, borrado_log);
            System.out.println("se guardo el registro");
        } catch (Exception e) {
            System.out.println("Error al guardar" + e.getMessage());
        }
    }

    //eliminar
    public void eliminar(int id) {
        try {
            datosServicios.eliminar(id, borrado_log);
        } catch (Exception e) {
        }

    }

    public List<Datos> listarDatos() {
        return datosServicios.listartodo();
    }
//<editor-fold defaultstate="collapsed" desc="Setter and Getter">

    public DatosServices getDatosServicios() {
        return datosServicios;
    }

    public void setDatosServicios(DatosServices datosServicios) {
        this.datosServicios = datosServicios;
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
//</editor-fold>

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public String getBorrado_log() {
        return borrado_log;
    }

    public void setBorrado_log(String borrado_log) {
        this.borrado_log = borrado_log;
    }

   
    

    public int getEditarDato() {
        return editarDato;
    }

    public void setEditarDato(int editarDato) {
        this.editarDato = editarDato;
    }

}
