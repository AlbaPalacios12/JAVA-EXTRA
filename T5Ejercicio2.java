/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 34625
 */
public class T5Ejercicio2 {

    /*Programa que pida 6 numeros enteros y que luego muestre esos numeros junto con la palabra
    "par" o "impar" segun proceda */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[6];
        System.out.println("Ingrese un total de 6 numeros");
        for (int i = 0; i < 6; i++) {
            numero[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) { //atributo especial a cada uno de los elementos del array : 1º for y 2º if
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i] + " es par");
            } else {
                System.out.println(numero[i] + " es impar");
            }
        }
    }
}