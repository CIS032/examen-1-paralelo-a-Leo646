
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
                    CuentaAhorro cu = new CuentaAhorro();
                    int nu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numerode cuenta"));
                    String ci = JOptionPane.showInputDialog("Ingrese cliente");
                    String ti = JOptionPane.showInputDialog("Ingrese tipo de cuenta");
                    int mo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese movimiento"));
                    int saldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese saldo"));
                    String fecha = JOptionPane.showInputDialog("Ingrese fecha");
                    Banco.añadir(cu);
                case 2:
                    CuentaPrestamo cp = new CuentaPrestamo();
                    int nup = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numerode cuenta"));
                    String cip = JOptionPane.showInputDialog("Ingrese cliente");
                    String tip = JOptionPane.showInputDialog("Ingrese tipo de cuenta");
                    int mop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese movimiento"));
                    int saldop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese saldo"));
                    String fechap = JOptionPane.showInputDialog("Ingrese fecha");
                    Banco.añadir(cp);
                    break;
                case 3:
                    CuentaHipoteca ch = new CuentaHipoteca();
                    int nuh = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numerode cuenta"));
                    String cih = JOptionPane.showInputDialog("Ingrese cliente");
                    String tih = JOptionPane.showInputDialog("Ingrese tipo de cuenta");
                    int moh = Integer.parseInt(JOptionPane.showInputDialog("Ingrese movimiento"));
                    int saldoh = Integer.parseInt(JOptionPane.showInputDialog("Ingrese saldo"));
                    String fechah = JOptionPane.showInputDialog("Ingrese fecha");
                    Banco.añadir(ch);
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
