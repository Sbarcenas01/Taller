  
package facturar.Controlador;

import facturar.Modelo.Cliente;
import facturar.Modelo.Consecutivos;
import facturar.Modelo.EstArticulos;
import facturar.Modelo.EstClientes;
import facturar.Modelo.Parametros;
import facturar.Modelo.Repositorio;
import facturar.Modelo.Validar;
import facturar.Vista.ViewCliente;
import facturar.Vista.ViewParametros;
import java.util.List;
import javax.swing.JOptionPane;

public class EstArticulosControlador {
     Repositorio<Parametros> regEstArticulos;
     Repositorio<Consecutivos> regConsecutivos;
      List<Consecutivos> List;
        Consecutivos a;

    public EstArticulosControlador() {
        regEstArticulos = new Repositorio<>();
        regEstArticulos.cargar("EstArticulos");
        regConsecutivos = new Repositorio<>();
        regConsecutivos.cargar("Consecutivos");

    }
       
       public void  crear(ViewParametros  vPram){
       
        /*   if (ExisteId(Integer.parseInt(vcli.txtId.getText()))){
           JOptionPane.showMessageDialog(null,"Id existe intente otro");
           return;
           }
               */
         List= regConsecutivos.getLista();
         EstArticulos param = new EstArticulos(); 
           try {
               for (int i = 0; i < List.size(); i++) {
               
             a =  regConsecutivos.getLista().get(i);
             param.setId(a.getnEstArticulos());
           }
           } catch (Exception e) {
                param.setId(0);
               
           }
  
         
         
       
           
          
      
       param.setDeterminante(vPram.txtDeterminante.getText());
       param.setDisponibilidad(vPram.cboEstado.getSelectedItem().toString());
      
       
      regEstArticulos.adicionar(param);
      regEstArticulos.guardar("EstArticulos");
       JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
      
      }
    
       public  boolean ExisteId(int id){
       
       
           return false;
       }
       
       
       
}
