/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

 
 
import java.util.Scanner;

public class EJERCICIO2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scan.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);
    }
}

    

