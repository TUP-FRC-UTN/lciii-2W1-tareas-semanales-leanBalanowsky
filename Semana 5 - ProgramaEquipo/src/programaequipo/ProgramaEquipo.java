
package programaequipo;

import java.util.Scanner;
public class ProgramaEquipo 
{


    public static void main(String[] args) 
    {
        Jugador[] jug;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de jugadores");
        int cant = sc.nextInt();
        
        jug = new Jugador[cant];
        
        for (int i = 0; i < cant; i++) 
        {
            System.out.println("Ingrese el nombre del jugador" + i);
            sc.nextLine();
            String nom = sc.nextLine();
            
            System.out.println("Ingrese la posicion del jugador" + i);
            int pos = sc.nextInt();
            
            System.out.println("Ingrese el numero de camiseta del jugador" + i);
            int nroC = sc.nextInt();
            
            System.out.println("Ingrese la cantidad de partidos jugados del jugador" + i);
            int cantP = sc.nextInt();
            
            System.out.println("Ingrese porcentaje de estado fisico del jugador" + i);
            int porF = sc.nextInt();
            
            jug[i] = new Jugador(nom, pos, nroC, cantP, porF);
        }
        
        int cantMenos10 = 0;
        
        for (int i = 0; i < cant; i++) 
        {
          if(jug[i].getCantPartidos()<10)
              cantMenos10++;
        }
        System.out.println("Cnatidad de jugadores que jugaron menos de 10 partidos: " + cantMenos10);
        
        Jugador jugadorMasJugado = jug[0];
        
        for (int i = 0; i < jug.length; i++) {
            if(jugadorMasJugado.getCantPartidos() < jug[i].getCantPartidos())
                jugadorMasJugado = jug[i];
        }
        
        int sumEstF = 0;
        for (int i = 0; i < jug.length; i++) {
            sumEstF += jug[i].getEstFisisco();
        }
        System.out.println("El Promedio de estado fisico es: " + (sumEstF / jug.length));
        
        System.out.println("Ingrese numero de camiseta: ");
        int numCam = sc.nextInt();
        Jugador jCamiseta = jug[0];
        for (int i = 0; i < jug.length; i++) 
        {
            if(jug[i].getNroCamiseta() == numCam)
                jCamiseta = jug[i];
            break;
        }
        System.out.println("El estado fisico de ese jugador es: " + jCamiseta.getEstFisisco());
        
        int cantArq = 0, cantDef = 0 , cantMed = 0 , cantDel = 0;
        int sumArq = 0, sumDef = 0, sumMed = 0, sumDel = 0;
         
        for (int i = 0; i < jug.length; i++) 
        {
            if (jug[i].getPosicion() == 1) 
            {
                sumArq += jug[i].getCantPartidos();
                cantArq++ ;
                
            }
            else if(jug[i].getPosicion() == 2)
            {
                sumDef += jug[i].getCantPartidos();
                cantDef++;
                
            }
            else if(jug[i].getPosicion() == 3)
            {
                sumMed += jug[i].getCantPartidos();
                cantMed++;
                
            }
            else if(jug[i].getPosicion() == 4)
            {
                sumDel += jug[i].getCantPartidos();
                cantDel++;
                
            }
        }
        System.out.println("El promedio de partidos que jugaron los arqueros es: " + (sumArq/cantArq));
        System.out.println("El promedio de partidos que jugaron los defensores es: " + (sumDef/cantDef));
        System.out.println("El promedio de partidos que jugaron los mediocampistas es: " + (sumMed/cantMed));
        System.out.println("El promedio de partidos que jugaron los delanteros es: " + (sumDel/cantDel));
    }
    
}
