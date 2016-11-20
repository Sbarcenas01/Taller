/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Modelo;

/**
 *
 * @author SBarc
 */
public class EstClientes extends Parametros{
    private String Acceso;

    public EstClientes(int id, String Determinante) {
        super(id, Determinante);
        
    }

    public EstClientes() {
       }
    
   public String getAcceso() {
        return Acceso;
    }

    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }

}
