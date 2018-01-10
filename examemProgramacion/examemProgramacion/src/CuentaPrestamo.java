/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Procesamiento Señal
 */
public class CuentaPrestamo extends Cuenta {

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
