/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del supermercado:");
        String nombreSupermercado = scanner.nextLine();
        System.out.println("Ingrese el codigo del supermercado:");
        String codigoSupermercado = scanner.nextLine();
        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("Ingrese la cedula del empleado:");
        String cedulaEmpleado = scanner.nextLine();

        supermercado supermercado = new supermercado(nombreSupermercado, codigoSupermercado);
        empleado empleado = new empleado(nombreEmpleado, cedulaEmpleado);

        while (true) {
            System.out.println("Ingrese el codigo del producto:");
            String codigoProducto = scanner.nextLine();
            System.out.println("Ingrese el nombre del producto:");
            String nombreProducto = scanner.nextLine();
            System.out.println("Ingrese la cantidad de productos:");
            int cantidadProductos = scanner.nextInt();
            System.out.println("Ingrese el precio base del producto:");
            double precioBaseProducto = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            tipoProducto tipoProducto = null;
            boolean tipoValido = false;

            while (!tipoValido) {
                System.out.println("Ingrese el tipo de producto (Alimentos, Bebidas, Higiene, Limpieza):");
                String tipoProductoStr = scanner.nextLine().toUpperCase();

                for (tipoProducto tipo : tipoProducto.values()) {
                    if (tipo.name().equals(tipoProductoStr)) {
                        tipoProducto = tipo;
                        tipoValido = true;
                        break;
                    }
                }

                if (!tipoValido) {
                    System.out.println("Tipo de producto invalido. Por favor, ingrese un tipo valido.");
                }
            }

            producto producto = new producto(codigoProducto, nombreProducto, empleado, cantidadProductos, precioBaseProducto, tipoProducto);
            supermercado.agregarProducto(producto);

            System.out.println("Desea agregar otro producto? (s/n)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Productos agregados:");
        supermercado.mostrarInventario();
        System.out.println("Ganancia total esperada: $" + supermercado.calcularGananciaTotal());

        scanner.close();
    }
}