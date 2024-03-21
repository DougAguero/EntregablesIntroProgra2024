/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Dell
 */
public class producto {
    private String codigo;
    private String nombre;
    private empleado empleado;
    private int cantidad;
    private double precioBase;
    private tipoProducto tipoProducto;
    private double precioBruto;
    private double gananciaEsperada;

    public producto(String codigo, String nombre, empleado empleado, int cantidad, double precioBase, tipoProducto tipoProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empleado = empleado;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipoProducto = tipoProducto;
        calcularPrecioBruto();
        calcularGananciaEsperada();
    }

    private void calcularPrecioBruto() {
        switch (tipoProducto) {
            case ALIMENTOS:
                precioBruto = precioBase * 0.20 + precioBase;
                break;
            case BEBIDAS:
                precioBruto = precioBase * 0.30 + precioBase;
                break;
            case HIGIENE:
                precioBruto = precioBase * 0.25 + precioBase + 500;
                break;
            case LIMPIEZA:
                precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
                break;
            default:
                System.out.println("Tipo de producto no válido.");
        }
    }

    private void calcularGananciaEsperada() {
        gananciaEsperada = (precioBruto - precioBase) * cantidad;
    }

    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Empleado: " + empleado.getNombre() + ", Cédula: " + empleado.getCedula() +
                ", Cantidad: " + cantidad + ", Precio Base: " + precioBase + ", Tipo de Producto: " + tipoProducto +
                ", Precio Bruto: " + precioBruto + ", Ganancia Esperada: " + gananciaEsperada;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }
}