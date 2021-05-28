/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.practica.crud_practica.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author cristo
 */
@Entity
@Table(name = "datos")

@NamedQueries(value = {
    @NamedQuery(name = "Datos.getAll", query = "SELECT obj FROM Datos obj"),})

public class Datos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dato")
    private String dato;

    @Column(name = "dato2")
    private String dato2;

    @Column(name = "borrado_log")
    private String borrado_log;

//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

//</editor-fold>
    public String getBorrado_log() {
        return borrado_log;
    }

    public void setBorrado_log(String borrado_log) {
        this.borrado_log = borrado_log;
    }

}
