
package ejercicioveterinaria;


public class Cliente {
    private int numCliente, antiguedad, edadMascota;
    private String nomCliente, nomMascota;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    public Cliente(int numCliente, int antiguedad, int edadMascota, String nomCliente, String nomMascota) {
        this.numCliente = numCliente;
        this.antiguedad = antiguedad;
        this.edadMascota = edadMascota;
        this.nomCliente = nomCliente;
        this.nomMascota = nomMascota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numCliente=" + numCliente + ", antiguedad=" + antiguedad + ", edadMascota=" + edadMascota + ", nomCliente=" + nomCliente + ", nomMascota=" + nomMascota + '}';
    }
    
    
    
}
