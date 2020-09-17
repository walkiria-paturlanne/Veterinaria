/*
 En esta clase, vamos a poner todos los atributos y metodos
de la clase paciente
 */
package proyecto.veterinaria;

/**
 *
 * @author Walkiria
 */
public class Paciente {
    
    private String humano, telefono, direccion, ciudad, nombrePaciente,
            raza, colorCabello,sexo;
    private float peso;
    private int fechanacimiento;
    
    
    public Paciente()
    {
        humano = telefono = direccion = ciudad = nombrePaciente = raza =
                colorCabello = sexo = "";
        
        peso = 0.0f;
        
        fechanacimiento = 0;
    
    
    }

    public String getHumano() {
        return humano;
    }

    public void setHumano(String humano) {
        this.humano = humano;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(int fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    //Ahora vamos por los métodos especificos!
    //Calcular la edad del animal
    
    public int calcularEdad()
    {
         int edad;
         int añoActual = 2020;
         
         edad = añoActual - fechanacimiento;
    
         return edad;
    }
    
    
} //Fin de la clase
