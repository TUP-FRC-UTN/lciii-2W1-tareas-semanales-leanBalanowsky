
package tareacliente;


class Cliente {
    int numero; 
    String nombre, telefono;

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNúmero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTeléfono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente: \n" + "numero: " + numero + ", nombre: " + nombre + ", telefono=" + telefono;
    }

    public Cliente(int numero, String nombre, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    
}
