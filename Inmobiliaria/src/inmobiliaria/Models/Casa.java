/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria.Models;

/**
 *
 * @author aelde
 */
public class Casa extends Propiedades{
    private boolean garaje;

    public Casa(String direccion, int cantHabitaciones, double precioBase, boolean usoComercial, int cantidadInquilinos, boolean garaje) {
        super(direccion, cantHabitaciones, precioBase, usoComercial, cantidadInquilinos);
        this.garaje = garaje;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
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
        double precioAlquiler = 0;
        
        if (garaje == true) {
            precioAlquiler = precioBase + 1000;
        }
        else{
            precioAlquiler = precioBase;
        }
        return precioAlquiler;
    }
    public String resultadoGaraje(){
        if (garaje == true) {
            return "con garaje";
        }
        else{
            return "sin garaje";
        }
    }

    @Override
    public String toString() {
        return "Casa " + super.toString() + ", " + resultadoGaraje() + ", Alquiler total: " + calcularAlquiler();
    }
    
    
}
