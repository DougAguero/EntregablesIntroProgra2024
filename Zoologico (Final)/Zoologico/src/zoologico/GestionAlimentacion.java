package zoologico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;
 
public class GestionAlimentacion {
    private RegistroAlimentacion[] registros;
    private int cantidadRegistros;
    private static final int CAPACIDAD_MAXIMA = 100; // Capacidad máxima de registros
    
 
    public GestionAlimentacion() {
        registros = new RegistroAlimentacion[CAPACIDAD_MAXIMA];
        cantidadRegistros = 0;
    }
 
    public void registrarAlimentacion(Animal animal, String horario, String alimento) {
        if (cantidadRegistros < CAPACIDAD_MAXIMA) {
            RegistroAlimentacion registro = new RegistroAlimentacion(animal, horario, alimento);
            registros[cantidadRegistros] = registro;
            cantidadRegistros++;
            JOptionPane.showMessageDialog(null, registro.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más registros. Capacidad máxima alcanzada.");
        }
    }
 
    public void mostrarHorarioAlimentacion() {
        if (cantidadRegistros == 0) {
            JOptionPane.showMessageDialog(null, "No hay registros de alimentación.");
            return;
        }
 
        String mensaje = "Horario de Alimentación:\n";
        for (int i = 0; i < cantidadRegistros; i++) {
            mensaje += registros[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}