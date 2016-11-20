
package facturar.Modelo;



public abstract class Parametros {
    
    private int id;
    private String Determinante;
    
   

    public Parametros(int id, String Determinante) {
        this.id = id;
        this.Determinante = Determinante;
       
    }
    
    public  Parametros(){}

 
      



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

    
 
    
   
}

