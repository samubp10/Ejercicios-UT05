package samuel.ejer_ut05_estruc_almacenamiento;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Samuel
 */
public class Ejer03 {

    public static void main(String[] args) {
        double[] numeros = new double[20];
        Arrays.fill(numeros, 7.5);
        double[] copia = Arrays.copyOf(numeros, numeros.length);
    }
}
