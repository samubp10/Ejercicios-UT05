/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ejer_ut05_estruc_almacenamiento;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Ejer13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero = 0;
        int contador = 2;
        for (int i = 1; i < contador; i++) {
            do {
                System.out.println("Escribe un número entre el 1 y el 20");
                numero = teclado.nextInt();
            } while (numero < 1 && numero > 20);
            contador++;
            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }
        int asterisco = 0;
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == i) {
                asterisco++;
            }
            
            System.out.print(i+": ");
            for(int z= i;i<asterisco;i++){
                System.out.println("*");
            }
        }

    }
}
