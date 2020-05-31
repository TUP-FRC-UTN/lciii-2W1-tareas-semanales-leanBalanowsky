
package practicacliente;


public class Cliente {
    protected int numCliente;
    protected String nombre;
    protected String telefono;

    public Cliente() {
    }

    public Cliente(int numCliente, String nombre, String telefono) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numCliente=" + numCliente + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
}
