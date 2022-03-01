/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.DAO.DAOCarrerasImpl;
import controller.DAO.DAOSedesImpl;
import java.util.List;
import model.Carrera;
import model.Formulario;
import model.Sede;
import model.TEstado;
import model.TGrado;

/**
 *
 * @author ersolano
 */
public class Control {

    //atributo autorreferenciado para el manejo del Singleton
    private static Control singletonControl;

    //Atributo DTO Utilitario para la transferencia de datos asociados a la entidad Carrera
    private DTOCarrera dto;
    //Atributo DTO Utilitario para la transferencia de datos asociados a la entidad Formulario
    private DTOFormulario dtoFormulario;

    //atributos de acceso controlado 
    private GestorCarreras gCarreras;
    private GestorFormularios gFormularios;

    public static Control getInstance() {
        if (singletonControl == null) {
            singletonControl = new Control();
        }
        return singletonControl;
    }

    private Control() {
        dto = new DTOCarrera();
        dtoFormulario = new DTOFormulario();
        gCarreras = new GestorCarreras();  // se habilita un gestor con carreras precreadas   
        gFormularios = new GestorFormularios();
    }

    public DTOCarrera getDto() {
        return dto;
    }

    public DTOFormulario getDtoFormulario() {
        return dtoFormulario;
    }

    public boolean crearCarrera(DTOCarrera dto) {
        // Paso 1: localizar todos los datos que están relacionados a la carrera 
        TGrado elGrado = TGrado.valueOf(dto.getGrado());
        Sede laSede = (Sede) DAOSedesImpl.getInstance().get(dto.getCodigoSede());

        //crea una instancia de acuerdo al modelo propuesto de una carrera
        Carrera unaCarrera = new Carrera(dto.getCodigo(), dto.getNombre(),
                dto.getPuntajeMaximo(), dto.getMaximoAdmitidos(),
                elGrado, laSede);
        // se solicita al gestor el registro de la carrera
        return gCarreras.agregarCarrera(unaCarrera);
    }

    public void mostrarCarreras() {
        // el gestor obtiene lo solicitado y lo deja en el dto.
        dto.setLasCarreras(gCarreras.buscarCarreras());
    }

    public void mostrarCarreras(String codigoSede) {
        dto.setLasCarreras(gCarreras.buscarCarreras(codigoSede));
    }

    public void consultarCarrera(String codSede, String codCarrera) {
        Carrera laCarrera = gCarreras.buscarCarrera(codSede, codCarrera);
        if (laCarrera != null) {
            dto.setCodigo(laCarrera.getCodigo());
            dto.setNombre(laCarrera.getNombre());
            dto.setGrado(laCarrera.getGrado().name());
            dto.setMaximoAdmitidos(laCarrera.getCapacidadMax());
            dto.setPuntajeMaximo(laCarrera.getPuntajeAdmision());
            dto.setCodigoSede(laCarrera.getLaSede().getCodigo());
        }
    }

    public boolean editarCarrera(DTOCarrera elDTO) {
        Carrera laCarrera = gCarreras.buscarCarrera(elDTO.getCodigoSede(), elDTO.getCodigoSede());
        if (laCarrera != null) {
            laCarrera.setPuntajeAdmision(elDTO.getPuntajeMaximo());
            laCarrera.setCapacidadMax(elDTO.getMaximoAdmitidos());
            return gCarreras.modificarCarrera(laCarrera);
        }
        return false;
    }

    public boolean crearFormulario(DTOFormulario dtoFormulario) {
        //Recupera datos del dto
        TEstado estado = TEstado.valueOf(dtoFormulario.getEstado());
        Carrera carrera = (Carrera) DAOCarrerasImpl.getInstance().get(dtoFormulario.getCarreraSolicitada());
        
        //Crea el formulario
        Formulario formulario = new Formulario(dtoFormulario.getIdentificador(), estado, carrera, dtoFormulario.getIdentificacion(),
                dtoFormulario.getNombre(), dtoFormulario.getApellido(), dtoFormulario.getFechaNacimiento(), dtoFormulario.getEdad(),
                dtoFormulario.getCorreoElectronico(), dtoFormulario.getNumeroTelefonico(), dtoFormulario.getDireccionResidencia(),
                dtoFormulario.getInstitucion());
        
        //Lo crea en caso de ser correcto
        return gFormularios.agregarFormulario(formulario);

    }
    
    public Formulario verFormulario(int identificador){
        Formulario formulario = null;
        formulario= gFormularios.getFormulario(identificador);
        return formulario;
    }
    
<<<<<<< Updated upstream
    public List<Formulario> visualizarSolicitudes(){
        List<Formulario> formularios = null;
        
        formularios = gFormularios.getSolicitudes();
        
        return formularios;
    }
=======
    public boolean simularAplicacionExamen() {
        return gFormularios.aplicarSimulacion();
    }
    
    public boolean procesarResultados() {
        return gFormularios.definirResultados();
    }
    
    
>>>>>>> Stashed changes
}
