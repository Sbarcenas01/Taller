  
package facturar.Controlador;

import facturar.Modelo.Cliente;
import facturar.Modelo.Parametros;
import facturar.Modelo.Repositorio;
import facturar.Modelo.Validar;
import facturar.Vista.ViewCliente;
import facturar.Vista.ViewParametros;
import javax.swing.JOptionPane;

public class ParametrosControlador {
     Repositorio<Parametros> regParametros;
    public ParametrosControlador() {
        regParametros = new Repositorio<>();
        regParametros.cargar("Parametros");
    }
       
       public void  crear(ViewParametros  vPram){
       
        /*   if (ExisteId(Integer.parseInt(vcli.txtId.getText()))){
           JOptionPane.showMessageDialog(null,"Id existe intente otro");
           return;
           }
               */
        
       Parametros param = new Parametros(); 
       param.setId(Integer.parseInt(vPram.txtId.getText()));
       param.setDeterminante(vPram.txtDeterminante.getText());
       param.setAcceso(vPram.cboEstado.getToolTipText());
      
       
      regParametros.adicionar(param);
      regParametros.guardar("Parametros");
       JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
      
      }
    
       public  boolean ExisteId(int id){
       
       
           return false;
       }
       
       
       
}
