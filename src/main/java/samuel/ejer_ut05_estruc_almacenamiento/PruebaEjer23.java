/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ejer_ut05_estruc_almacenamiento;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class PruebaEjer23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la cántidad de números que le gustaría que "
                + "tuviera su lista");
        int numero = escaner.nextInt();
        Ejer23 indice1 = new Ejer23(numero);
        indice1.ImprimirLista();
//        indice1.ImprimirSumaPares();
//        indice1.ImprimirImpares();
//        indice1.NumeroMayor();
//        indice1.NumeroMenor();
//        indice1.Tamano();
//        indice1.BorradoPosicion();
        indice1.BorradoValor();
//        indice1.Modificar();
    }

}
