/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Controlador;

import facturar.Modelo.Consecutivos;
import facturar.Modelo.EstArticulos;
import facturar.Modelo.Parametros;
import facturar.Modelo.Repositorio;
import facturar.Vista.ViewParametros;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SBarc
 */
public class ConsecutivoControlador<T> {
 Repositorio<Consecutivos> regConsecutivos;
    public ConsecutivoControlador() {
        regConsecutivos = new Repositorio<>();
        regConsecutivos.cargar("Consecutivos");
        }       
        
        List<Consecutivos> List;
        Consecutivos a;
       public void  crear(String e){
    Consecutivos cons = new Consecutivos(); 
           try {
                List= regConsecutivos.getLista();
           for (int i = 0; i < List.size(); i++) {
               
             a =  regConsecutivos.getLista().get(i);
               
           }
          if(e.equals("Cliente")){
          cons.setnClientes(a.getnClientes()+1);
          }
          if(e.equals("DetFactura")){
          cons.setnDetFacturas(a.getnDetFacturas()+1);
          }
          if(e.equals("EstArticulos")){
          cons.setnEstArticulos(a.getnEstArticulos()+1);
          }
          if(e.equals("EstClientes")){
          cons.setnEstClientes(a.getnEstClientes()+1);
          }
          if(e.equals("Factura")){
          cons.setnFacturas(a.getnFacturas()+1);
          }
          if(e.equals("Producto")){
          cons.setnProductos(a.getnProductos()+1);
          
          }
           } catch (Exception c) {
               if(e.equals("Cliente")){
          cons.setnClientes(0);
          }
          if(e.equals("DetFactura")){
          cons.setnDetFacturas(0);
          }
          if(e.equals("EstArticulos")){
          cons.setnEstArticulos(0);
          }
          if(e.equals("EstClientes")){
          cons.setnEstClientes(0);
          }
          if(e.equals("Factura")){
          cons.setnFacturas(0);
          }
          if(e.equals("Producto")){
          cons.setnProductos(0);
           }
         
            
          
       
      regConsecutivos.adicionar(cons);
      regConsecutivos.guardar("Consecutivos");
       JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
      
      }
    
       
       
       
       
       }}
    

