
package practicafiguras;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() + "radio=" + radio + '}';
    }
    
    
    @Override
    public void calcularPerimetro() {
        perimetro = 2*Math.PI*radio;
    }

    @Override
    public void calcularSuperficie() {
        superficie = Math.PI*radio*radio;
    }
    
    
}
