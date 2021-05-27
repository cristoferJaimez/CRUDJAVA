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
}
