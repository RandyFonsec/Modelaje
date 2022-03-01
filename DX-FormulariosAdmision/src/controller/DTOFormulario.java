/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import java.util.List;
import model.Carrera;
import model.Formulario;

/**
 *
 * @author Randy
 */
public class DTOFormulario {
    private int identificador;
    private String estado;
    private String carreraSolicitada;
    private int identificacion;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int edad;
    private String correoElectronico;
    private String numeroTelefonico;
    private String direccionResidencia;
    private String institucion;
    
    private List<Formulario> formularios;
    public DTOFormulario(){
        
    }
    
    public DTOFormulario(int identificador, String estado, String carreraSolicitada, int puntajeObtenido, int identificacion, String nombre, String apellido, Date fechaNacimiento, int edad, String correoElectronico, String numeroTelefonico, String direccionResidencia, String institucion) {
        this.identificador = identificador;
        this.estado = estado;
        this.carreraSolicitada = carreraSolicitada;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
        this.direccionResidencia = direccionResidencia;
        this.institucion = institucion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCarreraSolicitada() {
        return carreraSolicitada;
    }

    public void setCarreraSolicitada(String carreraSolicitada) {
        this.carreraSolicitada = carreraSolicitada;
    }


    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    
    
}
