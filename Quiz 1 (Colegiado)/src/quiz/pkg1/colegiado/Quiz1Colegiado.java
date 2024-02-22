/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg1.colegiado;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Quiz1Colegiado {
    // Atributos
    private String nombre;
    private String autor;
    private int anioDeCreacion;
    private int tiempoDuracion;
    private int id;
    
    public Quiz1Colegiado(String nombre, String autor, int tiempoDuracion, int anioDeCreacion, int id) {
        this.nombre = nombre;
        this.autor = autor;
        this.tiempoDuracion = tiempoDuracion;
        this.anioDeCreacion = anioDeCreacion;
        this.id = id;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioDeCreacion() {
        return anioDeCreacion;
    }

    public void setAnioDeCreacion(int anioDeCreacion) {
        this.anioDeCreacion = anioDeCreacion;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
      
    // Conversion de Segundos a Minutos y Segundos
    public String duracionEnMinutos() {
        int duracionMinutos = tiempoDuracion / 60;
        int duracionSegundos = tiempoDuracion % 60;
        return duracionMinutos + "m " + duracionSegundos + "s ";
    }
    
    public static void main(String[] args) {
        // Numero Cancions que se quiere ingresar
        int numeroCanciones = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas canciones quiere agregar?"));
        
        // Arreglo de Almacenamiento
        Quiz1Colegiado[] canciones = new Quiz1Colegiado[numeroCanciones];
        
        for (int i = 0; i < numeroCanciones; i++) {
            // Detalles
            String nombre = JOptionPane.showInputDialog("Nombre de la Cancion " + (i + 1) + ":");
            String autor = JOptionPane.showInputDialog("Autor(a) de la Cancion " + (i + 1) + ":");
            int tiempoDuracion = Integer.parseInt(JOptionPane.showInputDialog("Duracion de la Cancion " + (i + 1) + " (en segundos):"));
            int anioDeCreacion = Integer.parseInt(JOptionPane.showInputDialog("Anio de Creacion de la Cancion " + (i + 1) + ":"));
            int id = Integer.parseInt(JOptionPane.showInputDialog("Numero de Identificacion de la Cancion " + (i + 1) + ":"));
            
            // Objeto con detalles
            canciones[i] = new Quiz1Colegiado(nombre, autor, tiempoDuracion, anioDeCreacion, id);
        }
            // Mostrar Info
            for (int i = 0; i < numeroCanciones; i++) {
                canciones[i].mostrarInfo();
            }
        }
        
        public void mostrarInfo() {
            String info = "Nombre de la Cancion: " + nombre + "\n" +
                          "Autor de la Cancion: " + autor + "\n" +
                          "Anio de Creacion de la Cancion: " + anioDeCreacion + "\n" +
                          "Duracion de la Cancion: " + duracionEnMinutos() + "\n" +
                          "Numero de Identificacion de la Cancion: " + id;
            JOptionPane.showMessageDialog(null, info, "Informacion de la Cancion: ", JOptionPane.INFORMATION_MESSAGE);
        }
}