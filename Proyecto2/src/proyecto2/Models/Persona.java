
package proyecto2.Models;


public class Persona {
    private String nombre, apellido;
    private EstadoCivil estadoCivil;

    public Persona(String nombre, String apellido, EstadoCivil e) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil.getDescripcion();
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String estadoCivilCual()
    {
        return estadoCivil.getDescripcion();
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + '}';
    }

    
    
    
}
