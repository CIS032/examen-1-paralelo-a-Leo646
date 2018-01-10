/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Procesamiento Señal
 */
public abstract class Cuenta {

    private int meses;
    private String cliente;
    private String Tipocliente;
    private double balance;//saldo
    private double tasaInteres;

    public Cuenta() {
    }

    public Cuenta(String cliente) {
        this.cliente = cliente;
    }

    public Cuenta(String cliente, String Tipocliente, double balance, double tasaInteres) {
        this.cliente = cliente;
        this.Tipocliente = Tipocliente;
        this.balance = balance;
        this.tasaInteres = tasaInteres;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipocliente() {
        return Tipocliente;
    }

    public void setTipocliente(String Tipocliente) {
        this.Tipocliente = Tipocliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public abstract double calcularInteres(int Meses);

    public abstract void depositar(double monto);

    public abstract void retirar(double monto);

}
