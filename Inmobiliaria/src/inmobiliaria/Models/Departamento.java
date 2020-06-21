
package inmobiliaria.Models;


public class Departamento extends Propiedades {
    private double expensas;

    public Departamento(String direccion, int cantHabitaciones, double precioBase, boolean usoComercial, int cantidadInquilinos, double expensas) {
        super(direccion, cantHabitaciones, precioBase, usoComercial, cantidadInquilinos);
        this.expensas = expensas;
    }

    public double getExpensas() {
        return expensas;
    }

    public void setExpensas(double expensas) {
        this.expensas = expensas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public void setUsoComercial(boolean usoComercial) {
        this.usoComercial = usoComercial;
    }

    public int getCantidadInquilinos() {
        return cantidadInquilinos;
    }

    public void setCantidadInquilinos(int cantidadInquilinos) {
        this.cantidadInquilinos = cantidadInquilinos;
    }
    
    @Override
    public double calcularAlquiler() {
        double alquilerFinal = 0;
        
        if(usoComercial == true) {
            alquilerFinal = precioBase + expensas + 500;
        }
        else{
            alquilerFinal = precioBase + expensas;
        }
        return alquilerFinal;
    }
    @Override
    public String toString() {
        return "Departamento " + super.toString() + ", Expensas:" + expensas + ", Alquiler total: " + calcularAlquiler();
    }
    
}
