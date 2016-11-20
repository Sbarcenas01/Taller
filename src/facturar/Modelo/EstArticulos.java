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
public class EstArticulos extends Parametros{
    
    private String disponibilidad;
    
    public EstArticulos(int id, String Determinante) {
        super(id, Determinante);
    }

    public EstArticulos() {
        }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
