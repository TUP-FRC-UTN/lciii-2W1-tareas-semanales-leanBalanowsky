
package practicafiguras;

import java.util.Scanner;

public class PracticaFiguras {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Cuantas figuras quiere ingresar?: ");
        int tam = sc.nextInt();
        
        Geometria g = new Geometria(tam);
        
        for (int i = 0; i < tam; i++) 
        {
            System.out.println("Que vas a cargar?");
            System.out.println("1 - Triangulo");
            System.out.println("2 - Circulo");
            int opcion = sc.nextInt();
            if (opcion == 1) 
            {
                System.out.println("Ingrese Nombre del triangulo:");
                sc.nextLine();
                String nom = sc.nextLine();
                System.out.println("Ingrese el valor del lado 1: ");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2: ");
                double lado2 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 3: ");
                double lado3 = sc.nextDouble();
                
                Triangulo t = new Triangulo(lado1, lado2, lado3, nom);
                g.agregarFigura(t);
                t.calcularPerimetro();
                t.calcularSuperficie();
                System.out.println("El perimetro es: " + t.getPerimetro());
                System.out.println("La superficie es: " + t.getSuperficie());
            }
            else if (opcion == 2)
            {
                System.out.println("Ingrese Nombre del Circulo:");
                sc.nextLine();
                String nomC = sc.nextLine();
                System.out.println("Ingrese el valor del radio: ");
                double radio = sc.nextDouble();
                
                Circulo c = new Circulo(radio, nomC);
                g.agregarFigura(c);
                c.calcularPerimetro();
                c.calcularSuperficie();
                System.out.println("El perimetro es: " + c.getPerimetro());
                System.out.println("La superficie es: " + c.getSuperficie());
            }
            else {
                System.out.println("La opcion agregada es incorrecta...");
                System.out.println("Cuantas figuras quiere agregar? ");
                tam = sc.nextInt();
            }
        }
        System.out.println("El total de las superficies es: " + g.totalSuperficie());
        System.out.println("El  triangulo con mayor perimetro es: ");
    }
    
}
