/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

/**
 *

 */
import java.util.Scanner;

public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el stock actual del producto: ");
        int stockActual = scan.nextInt();

        System.out.print("Ingresa la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();

        System.out.print("Ingresa la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}

