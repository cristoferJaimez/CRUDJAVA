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
import javax.persistence.Query;

/**
 *
 * @author cristo
 */
@Stateless
public class DatosJPA extends GenericDAO<Datos, Integer> implements Idatos {

    public DatosJPA() {
        super(Datos.class);
    }

    // toda la logica de los metodos que nesecite
    @Override
    public void guardarDato(String dato, String dato2, String borrado_log) {
        // query nativo para guardar
        try {

            Query query = em.createNativeQuery("INSERT INTO datos(dato,dato2,borrado_log) VALUES(?,?,?)");
            query.setParameter(1, dato);
            query.setParameter(2, dato2);
            query.setParameter(3, "no");
            query.executeUpdate();

        } catch (Exception e) {

            System.out.println("Errro en el query nativo de guardar en tabla datos" + e.getMessage());
        }

    }

    @Override
    public void eliminardato(int id, String borrado_log) {
        try {

            Query query = em.createNativeQuery("UPDATE datos SET borrado_log = ? WHERE id = ?");
            query.setParameter(1, "si");
            query.setParameter(2, id);

            query.executeUpdate();

        } catch (Exception e) {

            System.out.println("Errro en el query nativo de guardar en tabla datos" + e.getMessage());
        }
    }

}
