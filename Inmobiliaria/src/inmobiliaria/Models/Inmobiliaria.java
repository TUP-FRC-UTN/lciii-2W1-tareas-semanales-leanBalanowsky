
package inmobiliaria.Models;

import java.util.ArrayList;

public class Inmobiliaria {
    private ArrayList<Propiedades> propiedades;

    public ArrayList<Propiedades> getPropiedades() {
        return propiedades;
    }

    public Inmobiliaria() {
        this.propiedades = new ArrayList<>();
    }
    
    public void cargarLista(Propiedades p)
    {
        propiedades.add(p);
    }

    @Override
    public String toString() {
        return "Inmobiliaria{" + "propiedades=" + propiedades + '}';
    }
    public double montoPromedio()
    {
        double promedio = 0;
        for (Propiedades propiedade : propiedades) {
            if (propiedade.getCantidadInquilinos() == 2) {
                promedio += propiedade.calcularAlquiler();
            }
        }
        return promedio;
    }
    public int cantidadCasas(){
        int cont = 0;
        
        for (Propiedades p : propiedades) {
            if (p instanceof Casa) {
                if (p.getCantHabitaciones() == 3 && ((Casa) p).isGaraje() == true) {
                    cont++;
                }
            }
        }
        return cont;
    }
    
    
    
}
