/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Dell
 */
public class Estudiante {
    private String nombre;
    private String curso;
    private String profe;
    private double grado;
 
    public Estudiante(String nombre, String curso, String profe, double grado) {
        this.nombre = nombre;
        this.curso = curso;
        this.profe = profe;
        this.grado = grado;
    }
 
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getCurso() {
        return curso;
    }
 
    public void setCurso(String curso) {
        this.curso = curso;
    }
 
    public String getProfe() {
        return profe;
    }
 
    public void setProfe(String profe) {
        this.profe = profe;
    }
 
    public double getGrado() {
        return grado;
    }
 
    public void setGrado(double grado) {
        this.grado = grado;
    }
}