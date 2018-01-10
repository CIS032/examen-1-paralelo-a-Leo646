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

    public CuentaPrestamo(String cliente) {
        super(cliente);
    }

    public CuentaPrestamo(String cliente, String Tipocliente, double balance, double tasaInteres) {
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
