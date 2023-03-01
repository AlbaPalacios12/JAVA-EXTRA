/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author 34625
 */
public class T5Ejercicio4 {
//invertir el array

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 8 numeros por teclado para completar la tabla");
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("A continuacion, la tabla aparecera en orden inverso");
        for (int i = 7; i >= 0; i--) { // un valor menor que la longitud de mi tabla. Va de atras hacia delante
            System.out.println(array[i]);
        }
    }
}
