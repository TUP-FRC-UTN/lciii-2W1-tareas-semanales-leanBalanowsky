
package programaequipo;


class Jugador 
{
    private String nombre;
    private int posicion, nroCamiseta, cantPartidos, estFisisco;

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public int getCantPartidos() {
        return cantPartidos;
    }

    public int getEstFisisco() {
        return estFisisco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public void setCantPartidos(int cantPartidos) {
        this.cantPartidos = cantPartidos;
    }

    public void setEstFisisco(int estFisisco) {
        this.estFisisco = estFisisco;
    }

    public Jugador() {
    }

    public Jugador(String nombre, int posicion, int nroCamiseta, int cantPartidos, int estFisisco) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.cantPartidos = cantPartidos;
        this.estFisisco = estFisisco;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", nroCamiseta=" + nroCamiseta + ", cantPartidos=" + cantPartidos + ", estFisisco=" + estFisisco + '}';
    }
    
    
}
