/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.veterinaria;

/**
 *
 * @author Walkiria
 */
public class Perro extends Paciente {
    
    private String especie, pelaje ;
    
    public Perro()
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
