  
package facturar.Controlador;

import facturar.Modelo.Cliente;
import facturar.Modelo.Consecutivos;
import facturar.Modelo.EstClientes;
import facturar.Modelo.Parametros;
import facturar.Modelo.Repositorio;
import facturar.Modelo.Validar;
import facturar.Vista.ViewCliente;
import facturar.Vista.ViewParametros;
import java.util.List;
import javax.swing.JOptionPane;

public class EstClientesControlador {
     Repositorio<Parametros> regEstCLientes;
     Repositorio<Consecutivos> regConsecutivos;
      List<Consecutivos> List;
        Consecutivos a;
        
    public EstClientesControlador() {
        regEstCLientes = new Repositorio<>();
        regEstCLientes.cargar("EstClientes");
        regConsecutivos = new Repositorio<>();
        regConsecutivos.cargar("Consecutivos");

    }
       
       public void  crear(ViewParametros  vPram){
           EstClientes param = new EstClientes(); 
           try {
               List= regConsecutivos.getLista();
           for (int i = 0; i < List.size(); i++) {
               
             a =  regConsecutivos.getLista().get(i);
             param.setId(a.getnEstClientes());

           }
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "");
               param.setId(0);
           }
            

       
       
       param.setDeterminante(vPram.txtDeterminante.getText());
       param.setAcceso(vPram.cboEstado.getSelectedItem().toString());
      
       
      regEstCLientes.adicionar(param);
      regEstCLientes.guardar("EstClientes");
       JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
      
      }
    
       public  boolean ExisteId(int id){
       
       
           return false;
       }
       
       
       
}
