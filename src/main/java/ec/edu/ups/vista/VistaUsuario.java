/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import java.util.Scanner;
import java.util.List;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author linar
 */
public class VistaUsuario {
    
    private Scanner e;

    public VistaUsuario() {
        e=new Scanner(System.in);
    }
    
    public Usuario registrarUsuario(){
        e=new Scanner(System.in);
        System.out.println("Registre Datos De Usuario");
        String cedula=e.next();
        String nombre=e.next();
        String apellido=e.next();
        String correo=e.next();
        String contrasena=e.next(); 
        return new Usuario(cedula, nombre, apellido, correo, contrasena);
    }
    
    public Usuario actualizarUsuario() {
        e=new Scanner(System.in);
        System.out.println("Ingrese cedula de ususrio a actualizar");
        String cedula=e.next();
        System.out.println("Ingrese nombre a actualizar");
        String nombre=e.next();
        System.out.println("Ingrese apellido a actualizar");
        String apellido=e.next();
        System.out.println("Ingrese correo a actualizar");
        String correo=e.next();
        System.out.println("Ingrese contaseña a actualizar");
        String contrasena=e.next();
        return new Usuario(cedula, nombre, apellido, correo, contrasena);
    }
    
    public Usuario eliminarUsuario(){
        e=new Scanner(System.in);
        System.out.println("Ingrese cliente a eliminar");
        String cedula=e.next();
        return new Usuario(cedula, null, null, null, null);
    }
    
    public String buscarUsuario(){
        e=new Scanner(System.in);
        System.out.println("Ingrese cedula de Usuario");
        String cedula=e.next();
        return cedula;
    }
    
    public void verUsuario(Usuario usuario){
        e=new Scanner(System.in);
        System.out.println("Datos de Usuario: "+usuario);
    }
    
    public void listarUsuarios(List<Usuario> usuarios){
        for (Usuario usuario : usuarios){
            System.out.println("Datos de usuario: "+usuario);
        }
    }
    
}

