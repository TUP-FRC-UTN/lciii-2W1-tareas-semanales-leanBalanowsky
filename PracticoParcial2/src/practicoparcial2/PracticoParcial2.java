
package practicoparcial2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class PracticoParcial2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese fecha del folleto: ");
        String fecha = sc.nextLine();
        
        System.out.print("Cantidad de ofertas: ");
        int cantidad = sc.nextInt();
        
        Folleto f = new Folleto(fecha, cantidad);
        for (int i = 0; i < cantidad; i++) 
        {
            System.out.println("♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
            System.out.print("Ingrese el numero del producto: ");
            int num = sc.nextInt();
            
            System.out.print("Ingrese el nombre del producto: ");
            sc.nextLine();
            String nomProducto = sc.nextLine();
            
            System.out.print("Ingrese el precio regular: ");
            double preReg = sc.nextDouble();
            
            System.out.print("Ingrese el precio con oferta: ");
            double preOfer = sc.nextDouble();
            
            System.out.print("Ingrese la vigencia: ");
            int vigencia = sc.nextInt();
            
            System.out.print("Ingrese el stock: ");
            int stock = sc.nextInt();
            
            Oferta o = new Oferta(num, nomProducto, preReg, preOfer, vigencia, stock);
            f.agregarOfertas(o);
            
        }
        System.out.println("♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
        System.out.print("Cantidad de articulos ofertados mas de 5 dias: ");
        System.out.println(f.articulosMas5Dias());
        System.out.println("♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
        System.out.print("Stock Total: ");
        System.out.println(f.stockTotal());
        System.out.println("♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
        System.out.print("Productos con un descuento mayor a $20: ");
        System.out.println(f.descuentosMay20());
        System.out.println("♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
        System.out.print("Total recaudado del codigo: ");
        int cod = sc.nextInt();
        System.out.println(f.totalRecaudacion(cod));
        
        
    }
    
    
    
}
