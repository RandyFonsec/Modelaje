/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import controller.DAO.DAOFormulariosImpl;
import java.util.ArrayList;
import java.util.List;
import model.Carrera;
import model.Formulario;
import model.Sede;
import model.TEstado;
/**
 *
 * @author Randy
 */
public class GestorFormularios {
    
    public GestorFormularios(){
        
    }
    
    public boolean agregarFormulario(Formulario formulario){
        return DAOFormulariosImpl.getInstance().create(formulario);
    }
    
    public Formulario getFormulario(int identificador){
        Formulario formulario = null;
        
        formulario = (Formulario) DAOFormulariosImpl.getInstance().get(identificador);
        
        return formulario;
    }

    
    public boolean aplicarSimulacion() {
        List<Formulario> formularios = DAOFormulariosImpl.getInstance().getAll();
        for (Formulario formulario : formularios) {
            int random = (int)(Math.random()*(801));
            formulario.setPuntajeObtenido(random);
            boolean updated = DAOFormulariosImpl.getInstance().update(formulario);
        }
        return true;
    }
    
    public boolean definirResultados() {
        List<Formulario> formularios = DAOFormulariosImpl.getInstance().getAll();
        for (Formulario formulario : formularios) {
            Carrera carrera = formulario.getCarreraSolicitada();
            if (formulario.getPuntajeObtenido() >= carrera.getPuntajeAdmision() && carrera.getCapacidadMax()>0) {
                formulario.setEstado(TEstado.ACEPTADO);
                carrera.setCapacidadMax(carrera.getCapacidadMax()-1);
            }
            else if (formulario.getPuntajeObtenido() >= carrera.getPuntajeAdmision() && carrera.getCapacidadMax()<=0)
                formulario.setEstado(TEstado.EN_ESPERA);
            else
                formulario.setEstado(TEstado.RECHAZADO);  
            boolean updated = DAOFormulariosImpl.getInstance().update(formulario);
        }
        return true;
    }

    public List<Formulario> getSolicitudes() {
        return DAOFormulariosImpl.getInstance().getAll();
    }
    
    public int getCantidadSolicitudes(String codigoCarrera, String codigoSede, TEstado estado) {
        List<Formulario> formularios = DAOFormulariosImpl.getInstance().getAll();
        int cantidad = 0;
        for (Formulario formulario : formularios) {
            Carrera carrera = formulario.getCarreraSolicitada();
            Sede sede = carrera.getLaSede();
            if (carrera.getCodigo().equals(codigoCarrera) && sede.getCodigo().equals(codigoSede) && 
                    formulario.getEstado().equals(estado)) {
                cantidad++;
            }
        }
        return cantidad;
    }

}
