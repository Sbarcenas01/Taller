
package facturar.Modelo;



public class Parametros {
    
    private int id;
    private String Determinante;
    private String Acceso;
   
    public Parametros() {
  
    }

    public Parametros(int id, String Determinante, String Acceso) {
        this.id = id;
        this.Determinante = Determinante;
        this.Acceso = Acceso;
    }

 
      



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeterminante() {
        return Determinante;
    }

    public void setDeterminante(String Determinante) {
        this.Determinante = Determinante;
    }

    public String getAcceso() {
        return Acceso;
    }

    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }

 
    
   
}

