/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

/**
 *
 */
    import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();

        if (edad < 12) {
            System.out.println("Sos un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Sos un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Sos un Adulto.");
        } else {
            System.out.println("Sos un Adulto mayor.");
        }
    }
}

    
