/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

/**
 *
 */
import java.util.Scanner;

public class EJERCICIO5 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scan.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                suma += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }
}   

