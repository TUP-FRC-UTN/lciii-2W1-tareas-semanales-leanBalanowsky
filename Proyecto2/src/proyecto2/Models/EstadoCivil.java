
package proyecto2.Models;



public class EstadoCivil {
    private String descripcion;

    public EstadoCivil(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
