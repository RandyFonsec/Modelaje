/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DAO;

import java.util.ArrayList;
import java.util.List;
import model.Formulario;
/**
 *
 * @author Randy
 */
public class DAOFormulariosImpl implements DAOTrasaccional{
    // instancia autorreferenciada para el uso de Singleton
    private static DAOFormulariosImpl accesoFormularios;

    // atributo de acceso controlado:
    private List<Formulario> tablaFormularios = new ArrayList<Formulario>();
    
    private DAOFormulariosImpl(){
        
    }
    
    public static DAOFormulariosImpl getInstance(){
        if (accesoFormularios == null)
            accesoFormularios = new DAOFormulariosImpl();
        return accesoFormularios;
    }
    @Override
    public boolean create(Object obj) {
        Formulario formulario = (Formulario)obj;
        for (int i = 0; i < tablaFormularios.size(); i++) {
            Formulario formularioActual = tablaFormularios.get(i);
            
            if (formularioActual.equals(formulario))
                return false;   // no se puede registrar formulario con el mismo código o nombre
        }
        return tablaFormularios.add(formulario);
    }

    @Override
    public boolean update(Object obj) {
        Formulario formulario = (Formulario)obj;
        for (int i = 0; i < tablaFormularios.size(); i++) {
            Formulario formularioActual = tablaFormularios.get(i);
            if (formularioActual.equals(formulario)){
                tablaFormularios.set(i, formulario);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        int codigoALocalizar = (int) key;
        for (int i = 0; i < tablaFormularios.size(); i++) {
            Formulario formularioActual = tablaFormularios.get(i);
            if (formularioActual.getIdentificador() == codigoALocalizar) {
                return formularioActual;
            }
        }
        return null;  // no apareció el formulario solicitado
    }

    @Override
    public List getAll() {
        return tablaFormularios;
    }
    
}
