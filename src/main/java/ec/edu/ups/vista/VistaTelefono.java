/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import java.util.Scanner;
import java.util.List;
import ec.edu.ups.modelo.Telefono;

/**
 *
 * @author linar
 */
public class VistaTelefono {
    
    private Scanner e;
    
    public VistaTelefono(){
        e=new Scanner(System.in);
    }
    
    public Telefono registrarTelefono(){
        System.out.println("Ingrese datos del telefono");
        int codigo=e.nextInt();
        String numero=e.next();
        String tipo=e.next();
        String operadora=e.next(); 
        return new Telefono(codigo ,numero ,tipo, operadora);
    }
    
    public Telefono modificarTelefono() {
        e=new Scanner(System.in);
        System.out.println("Ingrese datos a modifcar");
        int codigo=e.nextInt();
        System.out.println("Ingrese codigo a modificar");
        String numero=e.next();
        System.out.println("Ingrese tipo de telefono a modificar");
        String tipo=e.next();
        System.out.println("Ingrese operadora a modificar");
        String operadora=e.next();
        return new Telefono(codigo, numero, tipo, operadora);
    }
    
    public Telefono eliminarTelefono(){
        e=new Scanner(System.in);
        System.out.println("Ingrese telefono a eliminar");
        int codigo=e.nextInt();
        return new Telefono(codigo, null, null, null);
    }
    
    public int buscarTelefono(){
        e=new Scanner(System.in);
        System.out.println("Ingrese cedula de Usuario");
        int codigo=e.nextInt();
        return codigo;
    }
    
    public void verTelefono(Telefono telefono){
        e=new Scanner(System.in);
        System.out.println("Datos de Usuario: "+telefono);
    }
    
    public void listarTelefono(List<Telefono> telefonos){
        for (Telefono telefono : telefonos){
            System.out.println("Datos de usuario: "+telefono);
        }
    }
    
}
