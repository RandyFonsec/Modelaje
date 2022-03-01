/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.DTOFormulario;
import controller.Control;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Randy
 */
public class PruebaFormularios {
    static DTOFormulario dtoFormulario;
    
    
    public static void main(String[] args) throws ParseException {
        
        //Cargando dto
        dtoFormulario = Control.getInstance().getDtoFormulario();
        
        
        //Creando formulario con ayuda del dto
        dtoFormulario.setIdentificador(1);
        dtoFormulario.setIdentificacion(1232233);
        dtoFormulario.setNombre("Randy");
        dtoFormulario.setApellido("Fonseca");
        dtoFormulario.setCarreraSolicitada("IC");
        dtoFormulario.setEstado("SOLICITANTE");
        String sDate1 = "10/02/2000";
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        Date date1=formatter1.parse(sDate1);
        dtoFormulario.setFechaNacimiento(date1);
        dtoFormulario.setEdad(21);
        dtoFormulario.setCorreoElectronico("sad@dsad.dsd");
        dtoFormulario.setNumeroTelefonico("12341234");
        dtoFormulario.setDireccionResidencia("De la plaza 2 km este");
        dtoFormulario.setInstitucion("Colegio Noseque");
        
        //Registrando formulario
        if(Control.getInstance().crearFormulario(dtoFormulario)) System.out.println("Agregado"); else System.out.println("No agregado");;
                
        
    }
}
