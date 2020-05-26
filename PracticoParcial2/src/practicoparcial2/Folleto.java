
package practicoparcial2;


public class Folleto 
{
    private String fecha;
    private Oferta[] oferta;

    public Folleto(String fecha, int cantidad) 
    {
        this.fecha = fecha;
        this.oferta = new Oferta[cantidad];
    }
    
    public void agregarOfertas(Oferta o)
    {
        for (int i = 0; i < oferta.length; i++) 
        {
            if (oferta[i] == null) 
            {
                oferta[i] = o;
                break;
            }
        }
    }
    public int articulosMas5Dias()
    {
        int cont = 0;
        for (int i = 0; i < oferta.length; i++) 
        {
            if (oferta[i] != null && oferta[i].getVigencia() > 5) 
            {
                cont++;
            }
        }
        return cont;
    }
    public int stockTotal()
    {
        int stockTotal = 0;
        for (int i = 0; i < oferta.length; i++) 
        {
            if (oferta[i] != null) 
            {
                stockTotal += oferta[i].getStock();
            }
        }
        return stockTotal;
    }
    public int descuentosMay20()
    {
        int cont = 0;
        for (int i = 0; i < oferta.length; i++) 
        {
            if(oferta[i] != null && (oferta[i].getPreReg() - oferta[i].getPreOfer()) > 20)
            {
                cont++;
            }
        }
        return cont;
    }
    public double totalRecaudacion(int codigo)
    {
        double totalInd = 0;
        for (int i = 0; i < oferta.length; i++) 
        {
            if (oferta[i] != null && oferta[i].getNumProducto() == codigo)
            {
                totalInd = oferta[i].getPreOfer() * oferta[i].getStock();
            }
        }
        return totalInd;
    }
}
