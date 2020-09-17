/*

 */
package proyecto.veterinaria;


public class Gato extends Paciente {
    
    private String especie, pelaje;
    
    public Gato()
    {
        super();
        especie = pelaje = "";
        
    
    
    
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    
    
    
    
    
} // fin de clase 
