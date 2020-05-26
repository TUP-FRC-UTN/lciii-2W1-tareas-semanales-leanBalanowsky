
package ejercicioveterinaria;

public class Veterinaria {
    private Cliente[] cliente;

    public Veterinaria(int cantidad) 
    {
        cliente = new Cliente[cantidad];
    }
    
    public void agregarCliente(Cliente c)
    {
        for (int i = 0; i < cliente.length; i++) 
        {
            if (cliente[i] == null) 
            {
                cliente[i] = c;
                break;
            }
        }
    }
    public int cantidadClientes()
    {
        int contador = 0;
        for (int i = 0; i < cliente.length; i++) 
        {
            if(cliente[i] != null)
            {
                contador++;
            }
        }
        return contador;
    }
    public double promedioEdad()
    {
        int contador = 0;
        double acuEdad = 0;
        
        for (int i = 0; i < cliente.length; i++) 
        {
            if(cliente[i] != null)
            {
                contador++;
                acuEdad += cliente[i].getEdadMascota();
            }
        }
        
        double promEdad = acuEdad / contador;
        
        return promEdad;
        
    }
    
    public int clientesAntiguedad5()
    {
        int contador = 0;
        
        for (int i = 0; i < cliente.length; i++) 
        {
            if (cliente[i] != null && cliente[i].getAntiguedad() >= 5) {
                contador++;
            }
        }
        return contador;
        
    }
    
    
}
