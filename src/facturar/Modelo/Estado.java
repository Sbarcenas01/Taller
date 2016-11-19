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
public class Estado extends Parametros{
    private boolean compras;
    private boolean aceso;
    public Estado(String determinante) {
        super(determinante);
    }
    public Estado() {}

    public boolean getCompras() {
        return compras;
    }

    public void setCompras(boolean compras) {
        this.compras = compras;
    }

    public boolean getAceso() {
        return aceso;
    }

    public void setAceso(boolean aceso) {
        this.aceso = aceso;
    }

 
    
}
