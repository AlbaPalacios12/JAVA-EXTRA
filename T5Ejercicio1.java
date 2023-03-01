/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 34625
 */
public class T5Ejercicio1 {

    /*leer 5 numeros y mostrarlos en el mismo orden introducido*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[5];
        for (int i = 0; i < 5; i++) { //funciona como un contador que va a ir pasando por todos los numeros
            System.out.println("Introduzca un numero ");
            tabla[i] = sc.nextInt();//aqui introducimos el valor del contador
        }
        System.out.println("Resultado de la tabla compuesta por un total de 5 numeros");
        for (int i = 0; i < 5; i++) {//contador para la formacion del array
            System.out.println(tabla[i]);

        }
    }
}