
﻿
import java.io.FileWriter;
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
            for (Cuenta cuenta1 : cuenta) {
                if (cuenta1 instanceof CuentaAhorro) {
                    CuentaAhorro cu = (CuentaAhorro) cuenta1;
                    String linea = cu.getCliente() + " " + cu.getTipocliente() + " " + cu.getBalance() + " " + cu.getTasaInteres();
                    guardar.println(linea);

                }
                if (cuenta1 instanceof CuentaPrestamo) {
                    CuentaPrestamo cp = (CuentaPrestamo) cuenta1;
                    String linea = cp.getCliente() + " " + cp.getTipocliente() + " " + cp.getBalance() + " " + cp.getTasaInteres();
                    guardar.println(linea);

                }
                if (cuenta1 instanceof CuentaHipoteca) {
                    CuentaHipoteca ch = (CuentaHipoteca) cuenta1;
                    String linea = ch.getCliente() + " " + ch.getTipocliente() + " " + ch.getBalance() + " " + ch.getTasaInteres();
                    guardar.println(linea);

                }
            }
            guardar.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
