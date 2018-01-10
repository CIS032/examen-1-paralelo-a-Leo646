
/**
 *
 * @author Procesamiento Señal
 */
public class CuentaHipoteca extends Cuenta {

    public CuentaHipoteca(String cliente) {
        super(cliente);
    }

    public CuentaHipoteca(String cliente, String Tipocliente, double balance, double tasaInteres) {
        super(cliente, Tipocliente, balance, tasaInteres);
    }

    @Override
    public double calcularInteres(int Meses) {
        return getTasaInteres() * Meses;
    }

    @Override
    public void depositar(double monto) {
        this.setBalance(this.getBalance() + monto);
    }

    @Override
    public void retirar(double monto) {
        this.setBalance(this.getBalance() - monto);
    }

}
