//
package ejercicioparcial;

class Folleto {
    private String fecha;
    private Ofertas[] oferta;

    public Folleto(String fecha, int cantidad) {
        this.fecha = fecha;
        this.oferta = new Ofertas[cantidad];
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public Ofertas[] getOferta() {
        return oferta;
    }

    @Override
    public String toString() {
        return "Folleto{" + "fecha=" + fecha + ", oferta=" + oferta + '}';
    }
    public void agregarOfertas(Ofertas o){
        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] == null) {
                oferta[i]= o;
                break;
            }
        }
    }
    public int cantidadMay5()
    {
        int cant = 0;
        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null && oferta[i].getVigencia() > 5) {
                cant++;
            }
            
        }
        return cant;
    }
    public int cantidadProducto()
    {
        int sum = 0;
        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null) {
                
                sum += oferta[i].getStock();
            }
            
        }
        return sum;
    }
    public int ofertasMen20()
    {
        int cont = 0;
        for (int i = 0; i < oferta.length; i++) {
            if (oferta[i] != null && (oferta[i].getPreReg() - oferta[i].getPrecOferta()) > 20) 
            {
                cont++;
            }
            
        }
        return cont;
    }
    public double totalRecaudacion(int cod)
    {
        double recTotal = 0;
        double recUnit = 0;
        for (int i = 0; i < oferta.length; i++) 
        {
            if (oferta[i] != null && oferta[i].getNumProducto() == cod) 
            {
               recUnit = oferta[i].getPrecOferta()*oferta[i].getStock();
               recTotal += recUnit;
            }
        }
        return recTotal;
    }
    public double[] recaudacionTotal()
    {
        double[] recUnit = new double[oferta.length];
        int indice = 0;
        for (int i = 0; i < oferta.length; i++) 
        {
           if(oferta[i] != null){
               recUnit[indice] = oferta[i].getPrecOferta()*oferta[i].getStock();
               indice++;
           } 
        }
        return recUnit;
        
    }
    
    
    
    
    
}
