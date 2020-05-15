/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import ec.edu.ups.idao.IUsuarioDAO;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author linar
 */
public class UsuarioDAO implements IUsuarioDAO {
    
    private List<Usuario> listaUsuario;
    
    public UsuarioDAO(){
        listaUsuario=new ArrayList<>();
    }
    
    @Override 
    public void create(Usuario usuario){
        listaUsuario.add(usuario);
    }
    
    @Override
    public Usuario read(String cedula){
        for (Usuario usuario : listaUsuario){
            if(usuario.getCedula()== cedula){
                return usuario;
            }
        }
        return null;
    }
    
    @Override
    public void update(Usuario usuario){
        for(int i=0; i<listaUsuario.size(); i++){
            Usuario u=listaUsuario.get(i);
            if (u.getCedula()== usuario.getCedula()){
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }
    
    @Override
    public void delete(Usuario usuario){
        
    }
    
    @Override
    public List<Usuario> findAll(){
        return listaUsuario;
    }
}
