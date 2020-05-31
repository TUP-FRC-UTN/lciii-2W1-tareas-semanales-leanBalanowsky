
package practicafiguras;



public class Geometria {
    Figura[] figura;

    public Geometria(int tam) 
    {
        figura = new Figura[tam];
    }
    
    public void agregarFigura(Figura f)
    {
        for (int i = 0; i < figura.length; i++) 
        {
            if (figura[i] == null) 
            {
                figura[i] = f;
                break;
            }
        }
    }
    public double totalSuperficie()
    {
        double acu = 0;
        for (int i = 0; i < figura.length; i++) 
        {
            if (figura[i] != null) 
            {
                acu += figura[i].getSuperficie();
            }
        }
        return acu;
    }
    public String nombreMayorPerimetro(int opcion){
         Triangulo mayor = new Triangulo(0, 0, 0, " ");
         mayor = figura[0];
        
        for (int i = 0; i < figura.length; i++) 
        {
            if (figura[i] != null && figura[i].getPerimetro() > mayor.getPerimetro() ) 
            {
                mayor = figura[i];
            }
        }
        return mayor.getNombre();
    }
    
    
}
