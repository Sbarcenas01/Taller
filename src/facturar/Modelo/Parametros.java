
package facturar.Modelo;

/**
 *
 * @author SBarc
 */
public abstract class Parametros {
    
    protected int id;
    protected String determinante;

    public Parametros(String determinante) {
        this.determinante = determinante;
    }
    
    public Parametros(){}

    public String getDeterminante() {
        return determinante;
    }

    public void setDeterminante(String determinante) {
        this.determinante = determinante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    
}
