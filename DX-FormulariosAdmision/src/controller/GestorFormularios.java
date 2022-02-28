/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import controller.DAO.DAOFormulariosImpl;
import model.Formulario;
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
    
}
