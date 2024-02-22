/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Quiz2 {

    public static void main(String[] args) {
        // ¿Cuantos cursos?
        int numeroCursos = Integer.parseInt(JOptionPane.showInputDialog("Numero de Cursos que da el Profesor: "));
        double totalAPagar = 0;
        double totalPagarHacienda = 0;
        double totalFinal = 0;
        
        // Costo total de cada curso y calculacion
        for (int i = 1; i <= numeroCursos; i++) {
            // Costo del curso
            double costoCurso = Double.parseDouble(JOptionPane.showInputDialog("Costo del Curso #" + i + ": "));
            
            double pagoHacienda = costoCurso * 0.02; // 2%
            totalPagarHacienda += pagoHacienda;
            totalAPagar += costoCurso; 
            totalFinal += costoCurso + pagoHacienda; // Sumando todo junto
            
            // Total por un curso
            JOptionPane.showMessageDialog(null, "Pago a Hacienda (2%): " + pagoHacienda);
        }
        // Total Final
        JOptionPane.showMessageDialog(null, "El Profesor deberá pagar a Hacienda el monto de: " + totalAPagar + ".\n" +
                "Incluido el 2% de monto aplicado a Hacienda: " + totalPagarHacienda + ".\n" +
                "Por un total final de: " + totalFinal);
        }
}