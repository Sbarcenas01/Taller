package facturar.Controlador;

import facturar.Modelo.Consecutivos;
import facturar.Modelo.DetFactura;
import facturar.Modelo.Repositorio;
import facturar.Vista.ViewFactura;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetFacturaControlador {

     Repositorio <DetFactura> regDetFactura;
     Repositorio<Consecutivos> regConsecutivos;
      List<Consecutivos> Lista;
        Consecutivos a;

    public DetFacturaControlador() {
        regDetFactura = new Repositorio<>();
        regDetFactura.cargar("DetFactura");
        regConsecutivos = new Repositorio<>();
        regConsecutivos.cargar("Consecutivos");

    }
    public void  crear(ViewFactura  vfact){       
        
         Lista= regConsecutivos.getLista();
          
   

             List<DetFactura> xlist=new ArrayList<>();       
            int n=vfact.TablaDet.getRowCount();
             for (int i=0;i<n ;i++){
              DetFactura dfact = new DetFactura();  
              dfact.setId(i+1);              
              String xcodigo =vfact.TablaDet.getValueAt(i, 0).toString();             
              dfact.setCodigo(xcodigo);
              
              int xcant=Integer.parseInt(vfact.TablaDet.getValueAt(i, 2).toString());
              dfact.setCant(xcant);
                           
              double xprecio=Double.parseDouble(vfact.TablaDet.getValueAt(i, 3).toString());
              dfact.setPrecio(xprecio);
              
             double xiva=Double.parseDouble(vfact.TablaDet.getValueAt(i, 4).toString());
              dfact.setIva(xiva);
             
              
              int xidfact=Integer.parseInt(vfact.TablaDet.getValueAt(i, 6).toString());
              dfact.setIdFactura(xidfact);
                   try {
             for (int b = 0; b < Lista.size(); b++) {
               
             a =  regConsecutivos.getLista().get(b);
           }
             dfact.setId(a.getnDetFacturas());
        } catch (Exception e) {
             dfact.setId(0);
        }
        
              xlist.add(dfact);
               Consecutivos cs = new Consecutivos();
               cs.setnDetFacturas(cs.getnDetFacturas()+1);
              
               
          }
              
               regDetFactura.setLista(xlist);
               regDetFactura.guardar("DetFactura");
               JOptionPane.showMessageDialog(null,"Registros Han sido Guardados");
                vfact.dispose();
                     
      }
    public DetFactura traer(int id){         
        return (DetFactura)regDetFactura.traer(id);
     } 
}
    

