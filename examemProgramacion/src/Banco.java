
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Procesamiento Señal
 */
public class Banco {

    static ArrayList<Cuenta> cuenta = new ArrayList<>();

    public static void añadir(Cuenta c) {
        cuenta.add(c);

    }

    public static void grabarCuenta() {
        try {
            PrintWriter guardar = new PrintWriter(new FileWriter("cuentas.csv", true));
            for (Cuenta cuenta : cuenta) {
                if (cuenta instanceof CuentaAhorro) {
                    CuentaAhorro cu = (CuentaAhorro) cuenta;
                    String linea = "Cliente: "+ cu.getCliente() + " Tipo de Cuenta: " + cu.getTipocliente() + " Balance: " + cu.getBalance() + " Tasa Interes: " + cu.getTasaInteres();
                    guardar.println(linea);

                }
                if (cuenta instanceof CuentaHipoteca) {
                    CuentaHipoteca cu = (CuentaHipoteca) cuenta;
                    String linea = "Cliente: "+ cu.getCliente() + " Tipo de Cuenta: " + cu.getTipocliente() + " Balance: " + cu.getBalance() + " Tasa Interes: " + cu.getTasaInteres();
                    guardar.println(linea);

                }
                if (cuenta instanceof CuentaPrestamo) {
                    CuentaPrestamo cu = (CuentaPrestamo) cuenta;
                    String linea = "Cliente: "+ cu.getCliente() + " Tipo de Cuenta: " + cu.getTipocliente() + " Balance: " + cu.getBalance() + " Tasa Interes: " + cu.getTasaInteres();
                    guardar.println(linea);

                }
            }
            guardar.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
