
package ejercicioveterinaria;

import java.util.Scanner;

public class EjercicioVeterinaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de clientes: ");
        int cantidad = sc.nextInt();
        
        Veterinaria v = new Veterinaria(cantidad);
        
        for (int i = 0; i < cantidad; i++) 
        {
            System.out.println("♥------------------------------------♥");
            System.out.println("Ingrese el numero de cliente: ");
            int numCliente = sc.nextInt();
            
            System.out.println("Ingrese el nombre del cliente: ");
            sc.nextLine();
            String nomCliente = sc.nextLine();
            
            System.out.println("Ingrese la antiguedad: ");
            int antiguedad = sc.nextInt();
            
            System.out.println("Ingrese nombre de la mascota: ");
            sc.nextLine();
            String nomMascota = sc.nextLine();
            
            System.out.println("Edad de la mascota: ");
            int edad = sc.nextInt();
            
            Cliente c = new Cliente(numCliente, antiguedad, edad, nomCliente, nomMascota);
            v.agregarCliente(c);
            
        }
        
        
        System.out.println("------------------------------------");
        System.out.println("La cantidad de clientes es: ");
        System.out.println(v.cantidadClientes());
        System.out.println("------------------------------------");
        System.out.println("Promedio de edad de las mascotas: ");
        System.out.println(v.promedioEdad());
        System.out.println("------------------------------------");
        System.out.println("Clientes con antiguedad mayor a five");
        System.out.println(v.clientesAntiguedad5());
    }
    
}
