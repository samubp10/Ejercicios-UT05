/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ejer_ut05_estruc_almacenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Ejer23 {

    private ArrayList<Integer> numeros;
    Random random = new Random();
    int enteroAleatorio = random.nextInt();

    public Ejer23(int capacidad) {
        numeros = new ArrayList<>(capacidad);
        int contador = 0;
        do {
            enteroAleatorio = random.nextInt(100 - 10 + 1) + 10;
            numeros.add(enteroAleatorio);
            contador++;
        } while (contador < capacidad);
    }

    public void ImprimirLista() {
        for(int i = 0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("\n----------------------------------------------------------");

    }

    public void ImprimirSumaPares() {
        int contador = 0;
        for (int par : numeros) {
            if (par % 2 == 0) {
                contador += par;
            }
        }
        System.out.println("La suma de los números pares es: "+contador+"\n----------------------------------------------------------");
    }

    public void ImprimirImpares() {
        int contador = 0;
        for (int par : numeros) {
            if (par % 2 != 0) {
                contador++;
            }
        }
        System.out.println("La cantidad de números impares son:"+contador+"\n----------------------------------------------------------");
    }
    
    public int NumeroMayor() {
        int mayor = Collections.max(numeros);
        return mayor;
    }
    public int NumeroMenor() {
        int menor = Collections.min(numeros);
        return menor;
    }
    public int Tamano() {
        int tamano = numeros.size();
        return tamano;
    }
    
    public void BorradoPosicion() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzca la posición de la que quiere eliminar el valor");
        int numero = escaner.nextInt();
        numeros.remove(numero);  
        System.out.println(numeros);
    }
    
    public void BorradoValor() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzca el valor que quiera eliminar");
        int numero = escaner.nextInt();
         for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i)==numero){
            numeros.remove(i); 
            i--;
            }
        }
        System.out.println(numeros);
    }    
    
    public void Modificar() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzca la posición del valor que quiere cambiar");
        int numero = escaner.nextInt();
        System.out.println("Indique el número por el que quiere cambiar el número "+numeros.get(numero));
        int cambiar = escaner.nextInt();
        numeros.set(numero-1, cambiar);
        System.out.println(numeros);
    } 
    
}
