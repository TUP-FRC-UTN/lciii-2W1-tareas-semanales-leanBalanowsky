
package practicacliente;

import java.util.Scanner;

public class PracticaCliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Creamos un cliente comun: ");
        int num = 01;
        String nombre = "Juan";
        String telefono = "3517063041";
        System.out.println("Num de cliente: " + num);
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        
        Cliente c = new Cliente(num, nombre, telefono);
        System.out.println(c.toString());
        System.out.println("-----------------------------");
        System.out.println("Creamos un cliente Preferencial: ");
        int numP = 02;
        String nombreP = "Carlos";
        String telefonoP = "3518047256";
        double saldo = 2000.50;
        double saldoMaximo = 10000; 
        String domicilio = "candelaria 338";
        System.out.println("Num de cliente Preferencial: " + numP);
        System.out.println("Nombre: " + nombreP);
        System.out.println("Telefono: " + telefonoP);
        System.out.println("saldo: " + saldo);
        System.out.println("saldo maximo: " + saldoMaximo);
        System.out.println("Domicilio: " + domicilio);
        
        ClientePreferencial cp = new ClientePreferencial(numP, nombreP, telefonoP, saldo, saldoMaximo, domicilio);
        System.out.println(cp.toString());
        System.out.println("-----------------------------");
    }
    
}
