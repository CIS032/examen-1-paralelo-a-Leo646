
/**
 *
 * @author Procesamiento Señal
 */
public class CuentaHipoteca extends Cuenta {

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
