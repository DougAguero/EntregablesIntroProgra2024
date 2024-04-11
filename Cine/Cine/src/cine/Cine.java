/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

import javax.swing.JOptionPane;

public class Cine {
    // Números de Filas y Columnas, más asientos libres y ocupados
    private static final int filas = 5;
    private static final int columnas = 6;
    private static final String asientoLibre = "L";
    private static final String asientoOcupado = "O";
 
    private static String[][] cine = new String[filas][columnas];
    private static String peliProyectada = "";

    public static void main(String[] args) {
        inicializarCine();
 
        // Interfaz
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú:\n" +
                    "1. Película para Proyectar.\n" +
                    "2. Asignar asiento.\n" +
                    "3. Plano del Cine.\n" +
                    "4. Salir.\n" +
                    "Seleccione una opción: "
            ));
 
            switch (opcion) {
                case 1:
                    modificarPelicula();
                    break;
                case 2:
                    asignarAsiento();
                    break;
                case 3:
                    plano();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo... Adiós! :D");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
 
    private static void inicializarCine() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                cine[i][j] = asientoLibre;
            }
        }
    }
    
    // Cuál película?
    private static void modificarPelicula() {
        String nuevaPelicula = JOptionPane.showInputDialog("Nombre de la Película: ");
        if (nuevaPelicula != null) {
            peliProyectada = nuevaPelicula;
            JOptionPane.showMessageDialog(null, "Película modificada correctamente.");
        }
    }
    
    // Cuál asiento?
    private static void asignarAsiento() {
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila del asiento: "));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna del asiento: "));
 
        if (fila < 1 || fila > filas || columna < 1 || columna > columnas) {
            JOptionPane.showMessageDialog(null, "Asiento fuera de rango. Por favor, seleccione un asiento válido.");
            return;
        }
 
        if (cine[fila - 1][columna - 1].equals(asientoOcupado)) {
            JOptionPane.showMessageDialog(null, "Este asiento ya está ocupado. Por favor, seleccione otro asiento.");
            return;
        }
 
        cine[fila - 1][columna - 1] = asientoOcupado;
        JOptionPane.showMessageDialog(null, "Asiento asignado correctamente.");
    }
        
    // Mostrando el Cine
    private static void plano() {
        StringBuilder message = new StringBuilder("Asientos:\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                message.append(cine[i][j]).append(" ");
            }
            message.append("\n");
        }
        message.append("Película en proyección: ").append(peliProyectada);
        message.append("\n");
        message.append("Asientos Libres = L");
        message.append("\n");
        message.append("Asientos Ocupados = O");
        JOptionPane.showMessageDialog(null, message.toString());
    }
}