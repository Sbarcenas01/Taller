  
package facturar.Controlador;

import facturar.Modelo.Cliente;
import facturar.Modelo.Consecutivos;
import facturar.Modelo.Repositorio;
import facturar.Modelo.Validar;
import facturar.Vista.ViewCliente;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteControlador {
     Repositorio<Cliente> regCliente;
      Repositorio<Consecutivos> regConsecutivos;
       List<Consecutivos> List;
        Consecutivos a;
    public ClienteControlador() {
        regCliente = new Repositorio<>();
        regCliente.cargar("Cliente");
        regConsecutivos = new Repositorio<>();
        regConsecutivos.cargar("Consecutivos");
    }
       
       public void  crear(ViewCliente  vcli){
       
   
        Cliente cli = new Cliente(); 
           try {
                List= regConsecutivos.getLista();
           for (int i = 0; i < List.size(); i++) {
               
             a =  regConsecutivos.getLista().get(i);
           }
               cli.setId(a.getnClientes());
           } catch (Exception e) {
               cli.setId(0);
           }
           
           
           
           if (!Validar.email(vcli.txtCorreo.getText()))
        {
            JOptionPane.showMessageDialog(null,"Email esta errado. Verifique");
            
            return;
        } 
          
      
         
        
       cli.setNit(vcli.txtNit.getText());
       cli.setRazonSocial(vcli.txtRazonSocial.getText());
       cli.setCorreo(vcli.txtCorreo.getText());
       cli.setDireccion(vcli.txtDireccion.getText());
       cli.setTelefono(vcli.txtTelefono.getText());
       cli.setEstado(vcli.cboEstado.getSelectedItem().toString());
       
      regCliente.adicionar(cli);
      regCliente.guardar("Cliente");
       JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
       vcli.dispose();
      }
    
       public  boolean ExisteId(int id){
       
       
           return false;
       }
       
       
       
}
