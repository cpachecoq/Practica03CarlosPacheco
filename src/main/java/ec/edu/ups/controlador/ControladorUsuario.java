/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.idao.IUsuarioDAO;
import java.util.List;

/**
 *
 * @author linar
 */
public class ControladorUsuario {
    
    private Usuario usuario;
    private VistaUsuario vista;
    private IUsuarioDAO usuarioDao;
    
    public ControladorUsuario(VistaUsuario vista){
        this.vista=vista;
        this.usuarioDao=new UsuarioDAO();
    }
    
    public void registrar(){
        usuario=vista.registrarUsuario();
        usuarioDao.create(usuario);
    }
    
    public void ver(){
        String cedula=vista.buscarUsuario();
        usuario=usuarioDao.read(cedula);
        vista.verUsuario(usuario);
    }
    
    public void actualizar(){
        usuario=vista.actualizarUsuario();
        usuarioDao.update(usuario);
    }
    
    public void eliminar(){
        usuario=vista.eliminarUsuario();
        usuarioDao.delete(usuario);
    }
    
    public void listarUsuario(){
        List<Usuario> usuarios;
        usuarios=usuarioDao.findAll();
        vista.listarUsuarios(usuarios);
    }
}
