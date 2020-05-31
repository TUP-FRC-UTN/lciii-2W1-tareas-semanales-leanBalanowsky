
package practicafiguras;


abstract public class Figura {
    protected String nombre;
    protected double superficie;
    protected double perimetro;

    public Figura(String nombre) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }
    
    public abstract void calcularPerimetro();
    public abstract void calcularSuperficie();
    
}
