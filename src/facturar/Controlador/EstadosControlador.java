/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Controlador;


import facturar.Modelo.Estado;
import facturar.Modelo.Parametros;
import facturar.Modelo.Repositorio;
import facturar.Modelo.Validar;

import facturar.Vista.ViewEstados;
import javax.swing.JOptionPane;

/**
 *
 * @author SBarc
 */
public class EstadosControlador {
     Repositorio <Estado> regEstados;
    public EstadosControlador() {
        regEstados = new Repositorio<>();
        regEstados.cargar("Estado");
    }
       
       public void  crear(ViewEstados  vEstado){
       
          Estado estado = new Estado(); 
       //Estado.setId(Integer.parseInt(vEstado.txt.getText()));
       estado.setId(Integer.parseInt(vEstado.txtId.getText()));
       estado.setDeterminante(vEstado.txtDeterminante.getText());
       estado.setAceso(vEstado.tgBtnAcces.isFocusOwner());
       estado.setCompras(vEstado.tgBtnCompras.isFocusOwner());
       
      regEstados.adicionar(estado);
      regEstados.guardar("Estado");
       JOptionPane.showMessageDialog(null,"Registro Ha sido Guardado");
       vEstado.dispose();
      }
    
     
}
