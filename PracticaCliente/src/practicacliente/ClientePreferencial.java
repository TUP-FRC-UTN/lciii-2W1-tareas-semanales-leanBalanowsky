
package practicacliente;


public class ClientePreferencial extends Cliente
{
    protected double saldo;
    protected double saldoMaximo;
    protected String domicilio;

    public ClientePreferencial() {
    }

    public ClientePreferencial(int numCliente, String nombre, String telefono, double saldo, double saldoMaximo, String domicilio ) 
    {
        super(numCliente, nombre, telefono);
        this.saldo = saldo;
        this.saldoMaximo = saldoMaximo;
        this.domicilio = domicilio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoMaximo() {
        return saldoMaximo;
    }

    public void setSaldoMaximo(double saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "ClientePreferencial{" + super.toString() + "saldo=" + saldo + ", saldoMaximo=" + saldoMaximo + ", domicilio=" + domicilio + '}';
    }

    
    
}
