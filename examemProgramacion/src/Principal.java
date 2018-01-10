
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Procesamiento Señal
 */
public class Principal {

    public static void main(String[] args) {
                int opciones;
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "1--> Registro Cuenta ahorro\n"
                    + "2--> Registro Cuenta prestamo\n"
                    + "3--> Registro Cuenta hipoteca\n"
                    + "4--> Salir", "OPCIONES", JOptionPane.INFORMATION_MESSAGE));
            switch (opciones) {
                case 1:
                    String ci = JOptionPane.showInputDialog("Ingrese cliente");
                    String ti = JOptionPane.showInputDialog("Ingrese tipo de cuenta");
                    int nu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta"));
                    int saldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese balance"));
                    int tasint = Integer.parseInt(JOptionPane.showInputDialog("Ingrese interes"));

                    String fecha = JOptionPane.showInputDialog("Ingrese fecha");
                    CuentaAhorro cA = new CuentaAhorro(ci, ti, tasint, tasint);
                    Banco.añadir(cA);
                case 2:
                    String cip = JOptionPane.showInputDialog("Ingrese cliente");
                    String tip = JOptionPane.showInputDialog("Ingrese tipo de cuenta");
                    int nup = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta"));
                    int saldop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese balance"));
                    int tasintp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese interes"));

                    String fechap = JOptionPane.showInputDialog("Ingrese fecha");
                    CuentaPrestamo cP = new CuentaPrestamo(cip, tip, tasintp, tasintp);
                    Banco.añadir(cP);
                    break;
                case 3:
                    String cih = JOptionPane.showInputDialog("Ingrese cliente");
                    String tih = JOptionPane.showInputDialog("Ingrese tipo de cuenta");
                    int nuh = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de cuenta"));
                    int saldoh = Integer.parseInt(JOptionPane.showInputDialog("Ingrese balance"));
                    int tasinth = Integer.parseInt(JOptionPane.showInputDialog("Ingrese interes"));

                    String fechah = JOptionPane.showInputDialog("Ingrese fecha");
                    CuentaHipoteca cH = new CuentaHipoteca(cih, tih, tasinth, tasinth);
                    Banco.añadir(cH);
                    break;
                case 4:
                    Banco.grabarCuenta();
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }
        } while (opciones != 4);


    }

}
