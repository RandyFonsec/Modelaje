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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
