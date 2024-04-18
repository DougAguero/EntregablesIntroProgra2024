/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoologico;

import javax.swing.JOptionPane;
 
public class Zoologico {
    private Animal[] animales;
    private Habitat[] habitats;
    private Visitante[] visitantes;
    private int cantidadAnimales;
    private int cantidadHabitats;
    private int cantidadVisitantes;
    private static final int TAM_MAX_ANIMALES = 100;
    private static final int TAM_MAX_HABITATS = 100;
    private static final int TAM_MAX_VISITANTES = 1000;
    private Eventos eventos;
    private GestionAlimentacion gestionAlimentacion;
    private MapaZoologico mapaZoologico;
 
    public Zoologico() {
        animales = new Animal[TAM_MAX_ANIMALES];
        habitats = new Habitat[TAM_MAX_HABITATS];
        visitantes = new Visitante[TAM_MAX_VISITANTES];
        cantidadAnimales = 0;
        cantidadHabitats = 0;
        cantidadVisitantes = 0;
        eventos = new Eventos();
        gestionAlimentacion = new GestionAlimentacion();
        mapaZoologico = new MapaZoologico();
        cargarAnimalesPrecargados();
        cargarHabitatsPrecargados();
    }
    
    private void cargarAnimalesPrecargados() {
        agregarAnimal("León", "Felino", 5);
        agregarAnimal("Tigre", "Felino", 6);
        agregarAnimal("Elefante", "Proboscidea", 10);
        agregarAnimal("Jirafa", "Artiodactilo", 8);
        agregarAnimal("Mono", "Primate", 4);
    }
    
    private void cargarHabitatsPrecargados() {
        agregarHabitat("Savannah", "Pradera", 10);
        agregarHabitat("Selva", "Tropical", 15);
        agregarHabitat("Acuario", "Agua Dulce", 20);
        agregarHabitat("Aviario", "Bosque", 30);
        agregarHabitat("Desierto", "Desierto", 12);
    }
    
    public void agregarAnimal(String nombre, String especie, int edad) {
        if (cantidadAnimales < animales.length) {
            Animal nuevoAnimal = new Animal(nombre, especie, edad);
            animales[cantidadAnimales] = nuevoAnimal;
            cantidadAnimales++;
            JOptionPane.showMessageDialog(null, "Animal agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más animales. Capacidad máxima alcanzada.");
        }
    }
    
    public void agregarHabitat(String nombre, String tipoAmbiente, int capacidad) {
        if (cantidadHabitats < habitats.length) {
            Habitat nuevoHabitat = new Habitat(nombre, tipoAmbiente, capacidad);
            habitats[cantidadHabitats] = nuevoHabitat;
            cantidadHabitats++;
            JOptionPane.showMessageDialog(null, "Hábitat agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más hábitats. Capacidad máxima alcanzada.");
        }
    }
    
    public void agregarVisitante(String nombre, int edad) {
        if (cantidadVisitantes < visitantes.length) {
            visitantes[cantidadVisitantes] = new Visitante(nombre, edad);
            cantidadVisitantes++;
            JOptionPane.showMessageDialog(null, "Visitante agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más visitantes. Capacidad máxima alcanzada.");
        }
    }
    
    public void agregarEvento(String evento) {
        eventos.agregarEvento(evento);
    }
 
    public void mostrarAnimales() {
        String mensaje = "Lista de Animales:\n";
        for (int i = 0; i < cantidadAnimales; i++) {
            mensaje += animales[i].getNombre() + " - " + animales[i].getEspecie() + " - Edad: " + animales[i].getEdad() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
 
    public void mostrarHabitats() {
        String mensaje = "Lista de Hábitats:\n";
        for (int i = 0; i < cantidadHabitats; i++) {
            mensaje += habitats[i].getNombre() + " - " + habitats[i].getTipoAmbiente() + " - Capacidad: " + habitats[i].getCapacidad() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
 
    public int getTotalVisitantes() {
        return cantidadVisitantes;
    }
 
    public void mostrarEventos() {
        eventos.mostrarEventos();
    }
 
    public void mostrarMapaZoologico() {
        mapaZoologico.mostrarMapa();
    }
 
    public void agregarRegistroAlimentacion(Animal animal, String horario, String alimento) {
        gestionAlimentacion.registrarAlimentacion(animal, horario, alimento);
    }
 
    public void mostrarHorarioAlimentacion() {
        gestionAlimentacion.mostrarHorarioAlimentacion();
    }
 
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Agregar animal\n" +
                    "2. Agregar hábitat\n" +
                    "3. Agregar visitante\n" +
                    "4. Agregar evento\n" +
                    "5. Mostrar animales\n" +
                    "6. Mostrar hábitats\n" +
                    "7. Mostrar estadísticas de visitantes\n" +
                    "8. Mostrar eventos\n" +
                    "9. Mostrar mapa del zoológico\n" +
                    "10. Agregar registro de alimentación\n" +
                    "11. Mostrar horario de alimentación\n" +
                    "12. Salir"));
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
                    String especie = JOptionPane.showInputDialog("Ingrese la especie del animal:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal:"));
                    zoo.agregarAnimal(nombre, especie, edad);
                    break;
                case 2:
                    String nombreHabitat = JOptionPane.showInputDialog("Ingrese el nombre del hábitat:");
                    String tipoAmbiente = JOptionPane.showInputDialog("Ingrese el tipo de ambiente del hábitat:");
                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del hábitat:"));
                    zoo.agregarHabitat(nombreHabitat, tipoAmbiente, capacidad);
                    break;
                case 3:
                    String nombreVisitante = JOptionPane.showInputDialog("Ingrese el nombre del visitante:");
                    int edadVisitante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del visitante:"));
                    zoo.agregarVisitante(nombreVisitante, edadVisitante);
                    break;
                case 4:
                    String evento = JOptionPane.showInputDialog("Ingrese el nombre del evento:");
                    zoo.agregarEvento(evento);
                    break;
                case 5:
                    zoo.mostrarAnimales();
                    break;
                case 6:
                    zoo.mostrarHabitats();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Total visitantes: " + zoo.getTotalVisitantes());
                    break;
                case 8:
                    zoo.mostrarEventos();
                    break;
                case 9:
                    zoo.mostrarMapaZoologico();
                    break;
                case 10:
                    String nombreAnimal = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
                    Animal animalRegistro = null;
                    for (int i = 0; i < zoo.cantidadAnimales; i++) {
                        if (zoo.animales[i].getNombre().equalsIgnoreCase(nombreAnimal)) {
                            animalRegistro = zoo.animales[i];
                            break;
                        }
                    }
                    if (animalRegistro != null) {
                        String horarioAlimentacion = JOptionPane.showInputDialog("Ingrese el horario de alimentación:");
                        String alimento = JOptionPane.showInputDialog("Ingrese el alimento:");
                        zoo.agregarRegistroAlimentacion(animalRegistro, horarioAlimentacion, alimento);
                    } else {
                        JOptionPane.showMessageDialog(null, "Animal no encontrado.");
                    }
                    break;
                case 11:
                    zoo.mostrarHorarioAlimentacion();
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 12);
    }
}