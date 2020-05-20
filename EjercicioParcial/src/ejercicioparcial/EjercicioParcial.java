

package ejercicioparcial;
import java.util.Scanner;
public class EjercicioParcial {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese fecha de folleto");
        String fecha = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de ofertas del folleto");
        int cantidad = sc.nextInt();
        
        Folleto f = new Folleto(fecha, cantidad);
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Ingrese num producto: ");
            int numProd = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del producto: ");
            String nom = sc.nextLine();
            System.out.println("Ingrese el precio regular: ");
            double preReg = sc.nextDouble();
            System.out.println("Ingrese el precio de la oferta: ");
            double preOfer = sc.nextDouble();
            System.out.println("Cuanto dura la oferta?");
            int vigencia = sc.nextInt();
            System.out.println("Ingrese el stock: ");
            int stock = sc.nextInt();            
            
            Ofertas o = new Ofertas(numProd, vigencia, stock, nom, preReg, preOfer);
            f.agregarOfertas(o);
            System.out.println("----------------------------------------");
            
        }
        System.out.println("Ofertas con mas de 5 dias de vigencia: ");
        System.out.println(f.cantidadMay5());
        System.out.println("Total de stock: ");
        System.out.println(f.cantidadProducto());
        System.out.println("Productos con descuentos superior a 20: ");
        System.out.println(f.ofertasMen20());
        System.out.println("Total recaudado por el producto con numero igual a:");
        int cod = sc.nextInt();
        System.out.println(f.totalRecaudacion(cod));
        System.out.println("recaudacion total por producto");
        
        double[] rec = new double[(f.recaudacionTotal().length)];
        for (int i = 0; i < rec.length; i++) {
            rec[i] = f.recaudacionTotal()[i];
        }
        for (int i = 0; i < rec.length; i++) {
            System.out.println(rec[i]);
        }
       
        
        
        
    }
    
}
