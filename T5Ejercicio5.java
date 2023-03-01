/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author 34625
 */
public class T5Ejercicio5 {

    /*Programa que lea 8 numeros por teclado y que los almacene en un array.
    Rota los elementos de este arry, es decir, el elemento de la posicion 0 pasa a la posicion 1,
    el de la 1 para a la 2, etc. El numero que se encuentra en la ultima posicion debe pasar a la posicion 0.
    Finalmente se mostrara el contenido del array*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[8];
        int i;
        System.out.println("Ingrese un total de 8 numeros");
        for (i = 0; i < 8; i++) {
            numero[i] = sc.nextInt();
        }
        System.out.println("Array original");
        // salto de linea
        for (i = 0; i < 8; i++) {
            System.out.printf(" | " + i + " | "); // importante printf para poner los datos en la misma linea
        }
        System.out.println(" "); // para poder dividir una tabla de otra
        for (i = 0; i < 8; i++) {
            System.out.printf(" | " + numero[i] + " | ");
        }
        //rotar la posicion
        int aux = numero[7];
        for (i = 7; i > 0; i--) {
            numero[i] = numero[i - 1]; //para que el array avance a la derecha
        }
        numero[0] = aux;
        System.out.println("  ");
//array recorrido
        System.out.println("Nuevo array");
        for (i = 0; i < 8; i++) {
            System.out.printf(" | " + i);
        }
        System.out.println(" ");
        for (i = 0; i < 8; i++) {
            System.out.printf(" | " + numero[i]);
        }
        System.out.println(" ");
    }
}
