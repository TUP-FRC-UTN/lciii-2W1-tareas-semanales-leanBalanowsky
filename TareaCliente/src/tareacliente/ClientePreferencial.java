
package tareacliente;


class ClientePreferencial extends Cliente{
    float saldo, limite;
    String domicilio;

    public ClientePreferencial(int numero, String nombre, String telefono, float saldo, float limite, String domicilio ) {
        super(numero, nombre, telefono);
        this.saldo = saldo;
        this.limite = limite;
        this.domicilio = domicilio;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente:"+ super.toString() + "saldo=" + saldo + ", limite=" + limite + ", domicilio=" + domicilio;
    }
    
    
    
}
