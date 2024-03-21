/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Dell
 */
public class empleado {
    private String nombre;
    private String cedula;
 
    public empleado(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public String getCedula() {
        return cedula;
    }
}