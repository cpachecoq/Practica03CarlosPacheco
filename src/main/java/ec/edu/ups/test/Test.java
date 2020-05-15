/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.controlador.ControladorTelefono;


/**
 *
 * @author linar
 */
public class Test {
    
    public static void main(String[] args){
        
        VistaUsuario vista=new VistaUsuario();
        VistaTelefono vTelefono= new VistaTelefono(); 
        
        
        ControladorUsuario controlador=new ControladorUsuario(vista);
        ControladorTelefono c=new ControladorTelefono(vTelefono);
        
       
        controlador.registrar();
        
        controlador.ver();
        controlador.actualizar();
        controlador.eliminar();
        controlador.listarUsuario();
        
        c.registrar();
        c.ver();
        c.listarTelefono();
        
       
        
    }
    
}
