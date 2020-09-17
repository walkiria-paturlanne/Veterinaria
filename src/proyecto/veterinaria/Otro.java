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
public class Otro  extends Paciente {
    
    private String especie, pelaje, descripcion;
    
    public Otro()
    {
      super();
      especie = pelaje = descripcion = "";
    
    
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
} //Fin de clase
