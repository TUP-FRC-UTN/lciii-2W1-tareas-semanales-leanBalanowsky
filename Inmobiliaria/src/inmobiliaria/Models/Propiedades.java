
package inmobiliaria.Models;


public abstract class Propiedades {
    protected String direccion;
    protected int cantHabitaciones;
    protected double precioBase;
    protected boolean usoComercial;
    protected int cantidadInquilinos;

    public Propiedades(String direccion, int cantHabitaciones, double precioBase, boolean usoComercial, int cantidadInquilinos) {
        this.direccion = direccion;
        this.cantHabitaciones = cantHabitaciones;
        this.precioBase = precioBase;
        this.usoComercial = usoComercial;
        this.cantidadInquilinos = cantidadInquilinos;
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
    public String esComercial(){
        if (usoComercial == true) {
            return "si";
        }
        else{
            return "no";
        }
    }
    @Override
    public String toString() {
        return "direccion " + direccion + ", " + cantHabitaciones + " Habitaciones, " + "precio base: " + precioBase + ", uso comercial: " + esComercial() + ", cantidad inquilinos: " + cantidadInquilinos;
    }
    
    public abstract double calcularAlquiler();
}
