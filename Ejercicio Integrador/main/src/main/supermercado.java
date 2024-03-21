/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class supermercado {
    private String nombre;
    private String codigo;
    private ArrayList<producto> inventario;
 
    public supermercado(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        inventario = new ArrayList<>();
    }
 
    public void agregarProducto(producto producto) {
        inventario.add(producto);
    }
 
    public double calcularGananciaTotal() {
        double gananciaTotal = 0;
        for (producto producto : inventario) {
            gananciaTotal += producto.getGananciaEsperada();
        }
        return gananciaTotal;
    }
 
    public void mostrarInventario() {
        for (producto producto : inventario) {
            System.out.println(producto);
        }
    }
}