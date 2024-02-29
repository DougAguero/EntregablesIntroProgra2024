/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;

public class Examen1 {

    private String nombreCliente;
    private int cedulaCliente;
    private int numeroFactura;
    private double montoFactura;
    private int mesFactura;
    private int anioFactura;
    private int estadoFactura;
    private double montoTotalDeuda = 0;

    public Examen1(String nombreCliente, int cedulaCliente, int numeroFactura, double montoFactura, int mesFactura, int anioFactura, int estadoFactura) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.numeroFactura = numeroFactura;
        this.montoFactura = montoFactura;
        this.mesFactura = mesFactura;
        this.anioFactura = anioFactura;
        this.estadoFactura = estadoFactura;
        if (estadoFactura == 2) {
            this.montoTotalDeuda += montoFactura;
        }
    }

    public double getMontoTotalDeuda() {
        return montoTotalDeuda;
    }

    public static void main(String[] args) {
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas a registrar:"));

        double montoTotalDeuda = 0;

        for (int i = 0; i < cantidadFacturas; i++) {
            String nombreCliente = JOptionPane.showInputDialog("Nombre del Cliente:");
            int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Cedula del Cliente"));
            int numeroFactura = Integer.parseInt(JOptionPane.showInputDialog("Numero de Factura:"));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Monto de la Factura:"));
            int mesFactura = Integer.parseInt(JOptionPane.showInputDialog("Mes de la Factura:"));
            int anioFactura = Integer.parseInt(JOptionPane.showInputDialog("Anio de la Factura:"));
            int estadoFactura = Integer.parseInt(JOptionPane.showInputDialog("Estado de la Factura (1 para pagada, 2 para no pagada):"));

            Examen1 factura = new Examen1(nombreCliente, cedulaCliente, numeroFactura, montoFactura, mesFactura, anioFactura, estadoFactura);
            montoTotalDeuda += factura.getMontoTotalDeuda();

        double interes = montoTotalDeuda * 0.15;
        double totalConInteres = montoTotalDeuda + interes;
        double cuotaMensual = totalConInteres / 4;

        System.out.println("Monto Total de Deuda del Cliente: " + montoTotalDeuda + ", Fecha de Pago: " + mesFactura + anioFactura + ", Interes: " + interes + ", Total con Interes: " + totalConInteres + ", Cuota Mensual: " + cuotaMensual);
        }
    }
}