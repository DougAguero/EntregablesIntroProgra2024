/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;
 
public class MapaZoologico {
    private Animal[][] matrizAnimales;
    private int filas;
    private int columnas;
    private static final int MAX_FILAS = 5; // Número máximo de filas en la matriz
    private static final int MAX_COLUMNAS = 5; // Número máximo de columnas en la matriz
 
    public MapaZoologico() {
        filas = 0;
        columnas = 0;
        matrizAnimales = new Animal[MAX_FILAS][MAX_COLUMNAS];
    }
 
    public void agregarAnimal(Animal animal, int fila, int columna) {
        if (fila >= 0 && fila < MAX_FILAS && columna >= 0 && columna < MAX_COLUMNAS) {
            matrizAnimales[fila][columna] = animal;
            if (fila >= filas) filas = fila + 1;
            if (columna >= columnas) columnas = columna + 1;
            JOptionPane.showMessageDialog(null, "Animal agregado correctamente en la posición (" + fila + ", " + columna + ").");
        } else {
            JOptionPane.showMessageDialog(null, "La posición especificada está fuera del rango del mapa.");
        }
    }
 
    public void mostrarMapa() {
        String mapa = "Mapa de los Animales en el Zoológico:\n";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizAnimales[i][j] != null) {
                    mapa += matrizAnimales[i][j].getNombre() + "\t";
                } else {
                    mapa += "Vacío\t";
                }
            }
            mapa += "\n";
        }
        JOptionPane.showMessageDialog(null, mapa);
    }
}