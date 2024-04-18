/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import javax.swing.JOptionPane;

public class Eventos {
    private String[] eventos;
    private int cantidadEventos;

    public Eventos() {
        eventos = new String[10]; // Tamaño inicial del arreglo
        cantidadEventos = 0;
    }

    public void agregarEvento(String evento) {
        if (cantidadEventos < eventos.length) {
            eventos[cantidadEventos] = evento;
            cantidadEventos++;
            JOptionPane.showMessageDialog(null, "Evento agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más eventos. Capacidad máxima alcanzada.");
        }
    }

    public boolean isEmpty() {
        return cantidadEventos == 0;
    }

    public void mostrarEventos() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay eventos programados.");
        } else {
            String mensaje = "Eventos programados:\n";
            for (int i = 0; i < cantidadEventos; i++) {
                mensaje += eventos[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}