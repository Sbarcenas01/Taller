/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Controlador;


import facturar.Modelo.Consecutivos;
import facturar.Modelo.Producto;
import facturar.Modelo.Repositorio;
import facturar.Vista.ViewProducto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hpajaro
 */
public class ProductoControlador {
      Repositorio <Producto> regProducto;
      Repositorio<Consecutivos> regConsecutivos;
      List<Consecutivos> List;
        Consecutivos a;

    public ProductoControlador() {
        regProducto = new Repositorio<>();
        regProducto.cargar("Producto");
        regConsecutivos = new Repositorio<>();
        regConsecutivos.cargar("Consecutivos");


    }
    public void  crear(ViewProducto  vprod){
                List= regConsecutivos.getLista();
                Producto prod = new Producto();
                try {
             for (int i = 0; i < List.size(); i++) {
               
             a =  regConsecutivos.getLista().get(i);
           }
             prod.setId(a.getnProductos());
        } catch (Exception e) {
            prod.setId(0);
        }
          
        
        
       
       prod.setDescripcion(vprod.txtDescripcion.getText());
       prod.setPrecio(Double.parseDouble(vprod.txtPrecio.getText()));
       prod.setEstado(vprod.cboEstado.getSelectedItem().toString());
       
      regProducto.adicionar(prod);
      regProducto.guardar("Producto");
       JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
       vprod.dispose();
      }
    public Producto traer(int id){         
        return (Producto)regProducto.traer(id);
     } 
}
