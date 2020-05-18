
package tareacaños;


class Material 
{
    private int codigo;
    private String descripcion;
    private float valorUnitario;

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Material(int codigo, String descripcion, float valorUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Material{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", valorUnitario=" + valorUnitario + '}';
    }
    
    

}
