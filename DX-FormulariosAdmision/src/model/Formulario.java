/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Randy
 */
public class Formulario {
    private int identificador;
    private TEstado estado;
    private Carrera carreraSolicitada;
    private int puntajeObtenido;
    private int identificacion;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int edad;
    private String correoElectronico;
    private String numeroTelefonico;
    private String direccionResidencia;
    private String institucion;
    
    public Formulario(){
        
    }

    public Formulario(int identificador, TEstado estado, Carrera carreraSolicitada, int identificacion, String nombre, String apellido, Date fechaNacimiento, int edad, String correoElectronico, String numeroTelefonico, String direccionResidencia, String institucion) {
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

    public TEstado getEstado() {
        return estado;
    }

    public void setEstado(TEstado estado) {
        this.estado = estado;
    }

    public Carrera getCarreraSolicitada() {
        return carreraSolicitada;
    }

    public void setCarreraSolicitada(Carrera carreraSolicitada) {
        this.carreraSolicitada = carreraSolicitada;
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }

    @Override
    public String toString() {
        return "Formulario{" + "identificador=" + identificador + ", estado=" + estado + ", carreraSolicitada=" + carreraSolicitada + ", puntajeObtenido=" + puntajeObtenido + ", identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", correoElectronico=" + correoElectronico + ", numeroTelefonico=" + numeroTelefonico + ", direccionResidencia=" + direccionResidencia + ", institucion=" + institucion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Formulario other = (Formulario) obj;
        if (this.identificador != other.identificador) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
