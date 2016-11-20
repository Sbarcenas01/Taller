
package facturar.Controlador;

import facturar.Modelo.Consecutivos;
import facturar.Modelo.Factura;
import facturar.Modelo.Helper;
import facturar.Modelo.Repositorio;
import facturar.Vista.ViewFactura;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FacturaControlador {
      Repositorio <Factura> regFactura;
      Repositorio<Consecutivos> regConsecutivos;
      List<Consecutivos> List;
        Consecutivos a;

    public FacturaControlador() {
        regFactura = new Repositorio<>();
        regFactura.cargar("Factura");
        regConsecutivos = new Repositorio<>();
        regConsecutivos.cargar("Consecutivos");

    }
    public void  crear(ViewFactura  vfact){
                 Factura fact = new Factura();
         List= regConsecutivos.getLista();
         try {
            for (int i = 0; i < List.size(); i++) {
               
             a =  regConsecutivos.getLista().get(i);
           }
            fact.setId(a.getnFacturas());
        } catch (Exception e) {
            fact.setId(0);
        }
         
         
        
        int idf =Integer.parseInt(""+a.getnFacturas());
        if (!(this.traer(idf)== null)){
            JOptionPane.showMessageDialog(null,"Factura Existe.Verifique");
            return;
        }
       
        
        Date xfecha = vfact.txtFecha.getDate();
        fact.setFecha(xfecha);
        String  ele =vfact.cboClientes.getSelectedItem().toString();
        String  idCli =Helper.getKeyByValue(vfact.mapCli, ele);
        fact.setIdCliente(Integer.parseInt(idCli));
        
        fact.setNum(vfact.txtNum.getText());
        fact.setDireccion(vfact.txtDireccion.getText());
        regFactura.adicionar(fact);
        regFactura.guardar("Factura");
        JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
        vfact.btnAddProd.setEnabled(true);
      }
    
    public Factura traer(int id){         
        return (Factura)regFactura.traer(id);
     } 
}
