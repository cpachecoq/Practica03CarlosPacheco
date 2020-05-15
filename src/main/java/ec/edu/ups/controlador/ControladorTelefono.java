/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import java.util.List;

/**
 *
 * @author linar
 */
public class ControladorTelefono {
    
    private Telefono telefono;
    private VistaTelefono vista;
    private ITelefonoDAO telefonoDao;
    
    public ControladorTelefono(VistaTelefono vista){
        this.vista=vista;
        this.telefonoDao=new TelefonoDAO();
    }
    
     public void registrar(){
        telefono=vista.registrarTelefono();
        telefonoDao.create(telefono);
    }
     
     public void ver(){
        int codigo=vista.buscarTelefono();
        telefono=telefonoDao.read(codigo);
        vista.verTelefono(telefono);
    }
     
    public void modificar(){
        telefono=vista.modificarTelefono();
        telefonoDao.update(telefono);
    }
    
    public void eliminar(){
        telefono=vista.eliminarTelefono();
        telefonoDao.delete(telefono);
    }
    
     public void listarTelefono(){
        List<Telefono> telefonos;
        telefonos=telefonoDao.findAll();
        vista.listarTelefono(telefonos);
    }
}
