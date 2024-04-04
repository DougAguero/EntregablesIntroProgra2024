/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear el arreglo de objetos Estudiante
        Estudiante[] estudiantes = new Estudiante[10];
 
        // Llenar el arreglo con datos ficticios
        estudiantes[0] = new Estudiante("Andres", "Matematicas", "Tania", 85);
        estudiantes[1] = new Estudiante("Joshua", "Educacion Fisica", "Shirley", 98);
        estudiantes[2] = new Estudiante("Mason", "Estudios Sociales", "Ariana", 72);
        estudiantes[3] = new Estudiante("Axel", "Quimica", "Irving", 59);
        estudiantes[4] = new Estudiante("Ariela", "Espaniol", "Irene", 100);
        estudiantes[5] = new Estudiante("William", "Arte", "Silvia", 34);
        estudiantes[6] = new Estudiante("Samuel", "Musica", "Marisol", 78);
        estudiantes[7] = new Estudiante("Cynthia", "Biologia", "Victoria", 88);
        estudiantes[8] = new Estudiante("Anthony", "Informatica", "Homero", 70);
        estudiantes[9] = new Estudiante("Fred", "Ingles", "Hilda", 69);
        
 
        // Listado general de estudiantes
        System.out.println("Listado general de estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getGrado());
        }
 
        // Nombre del estudiante con la nota mayor
        Estudiante estudianteConNotaMayor = estudiantes[0];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getGrado() > estudianteConNotaMayor.getGrado()) {
                estudianteConNotaMayor = estudiante;
            }
        }
        System.out.println(" ");
        
        System.out.println("Estudiante con la nota mayor: " + estudianteConNotaMayor.getNombre());
 
        // Nombre del estudiante con la nota menor
        Estudiante estudianteConNotaMenor = estudiantes[0];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getGrado() < estudianteConNotaMenor.getGrado()) {
                estudianteConNotaMenor = estudiante;
            }
        }
        System.out.println(" ");
        
        System.out.println("Estudiante con la nota menor: " + estudianteConNotaMenor.getNombre());
        
        System.out.println(" ");
 
        // Promedio de calificaciones
        double sumaCalificaciones = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaCalificaciones += estudiante.getGrado();
        }
        double promedio = sumaCalificaciones / estudiantes.length;
        System.out.println("Promedio de calificaciones: " + promedio);
        
        System.out.println(" ");
 
        // Calificaciones por encima del promedio
        System.out.println("Calificaciones por encima del promedio:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getGrado() > promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getGrado());
            }
        }
        
        System.out.println(" ");
 
        // Calificaciones por debajo del promedio
        System.out.println("Calificaciones por debajo del promedio:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getGrado() < promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getGrado());
            }
        }
        System.out.println(" ");
    }
}