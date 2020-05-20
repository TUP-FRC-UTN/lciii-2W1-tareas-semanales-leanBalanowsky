package ejercicioparcial;

class Ofertas {
    private int numProducto, vigencia, stock;
    private String nomProducto;
    private double preReg, precOferta;

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public double getPreReg() {
        return preReg;
    }

    public void setPreReg(double preReg) {
        this.preReg = preReg;
    }

    public double getPrecOferta() {
        return precOferta;
    }

    public void setPrecOferta(double precOferta) {
        this.precOferta = precOferta;
    }

    public Ofertas(int numProducto, int vigencia, int stock, String nomProducto, double preReg, double precOferta) {
        this.numProducto = numProducto;
        this.vigencia = vigencia;
        this.stock = stock;
        this.nomProducto = nomProducto;
        this.preReg = preReg;
        this.precOferta = precOferta;
    }

    @Override
    public String toString() {
        return "Ofertas{" + "numProducto=" + numProducto + ", vigencia=" + vigencia + ", stock=" + stock + ", nomProducto=" + nomProducto + ", preReg=" + preReg + ", precOferta=" + precOferta + '}';
    }
    
    
}
