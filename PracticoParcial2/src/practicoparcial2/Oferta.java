
package practicoparcial2;

public class Oferta {
    private int numProducto;
    private String nomProducto;
    private double preReg, preOfer;
    private int vigencia;
    private int stock;

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
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

    public double getPreOfer() {
        return preOfer;
    }

    public void setPreOfer(double preOfer) {
        this.preOfer = preOfer;
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

    public Oferta(int numProducto, String nomProducto, double preReg, double preOfer, int vigencia, int stock) {
        this.numProducto = numProducto;
        this.nomProducto = nomProducto;
        this.preReg = preReg;
        this.preOfer = preOfer;
        this.vigencia = vigencia;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Oferta{" + "numProducto=" + numProducto + ", nomProducto=" + nomProducto + ", preReg=" + preReg + ", preOfer=" + preOfer + ", vigencia=" + vigencia + ", Stock=" + stock + '}';
    }
    
    
}
