
package inmobiliaria.Models;


public class TipoPropiedad {
    private String descripcion;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  descripcion;
    }

    public TipoPropiedad(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
