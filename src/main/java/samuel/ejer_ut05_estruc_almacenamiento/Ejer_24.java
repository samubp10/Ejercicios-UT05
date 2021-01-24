/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ejer_ut05_estruc_almacenamiento;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author samuel
 */
public class Ejer_24 {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        Random random = new Random();
        int enteroAleatorio01;
        int enteroAleatorio02;
        int enteroAleatorio03 = random.nextInt(15 - 5 + 1) + 5;

        enteroAleatorio02 = random.nextInt(20 - 10 + 1) + 10;
        for (int i = 0; i <= enteroAleatorio03; i++) {
            enteroAleatorio01 = random.nextInt(100 - 50 + 1) + 50;
            lista1.add(enteroAleatorio01);
        }
        for (int i = 0; i <= enteroAleatorio02; i++) {
            enteroAleatorio01 = random.nextInt(100 - 50 + 1) + 50;
            lista2.add(enteroAleatorio01);
        }
//        for (int i = 0; i <= 4; i++) {
//            enteroAleatorio01 = random.nextInt(2 - 1 + 1) + 1;
//            lista1.add(enteroAleatorio01);
//        }
//        for (int i = 0; i <= 40; i++) {
//            enteroAleatorio01 = random.nextInt(2 - 1 + 1) + 1;
//            lista2.add(enteroAleatorio01);
//        }

        System.out.println("Lista 1: ");
        for (Integer tmp1 : lista1) {
            System.out.println(tmp1);

        }
        System.out.println("Lista 2: ");
        for (Integer tmp2 : lista2) {
            System.out.println(tmp2);

        }
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int tmp : lista1) {
            lista3.add(tmp);
        }
        for (int i = 0; i < lista3.size(); i++) {
            if (lista3.size() == 0) {
                break;
            }
            for (int n = 0; n < lista2.size(); n++) {
                if (lista3.size() == 0) {
                    break;
                }

                if (lista3.get(i) == lista2.get(n)) {
                    lista3.remove(lista3.get(i));
                    if (i != 0) {
                        i--;
                    }
                }
            }

        }

        System.out.println("Lista 3: ");
        for (Integer tmp3 : lista3) {
            System.out.println(tmp3);

        }
        ArrayList<Integer> lista4 = new ArrayList<>();

        for (Integer tmp4 : lista1) {
            if (tmp4 % 2 == 0) {
                lista4.add(tmp4);
            }
        }
        for (Integer tmp5 : lista2) {
            if (tmp5 % 2 != 0) {
                lista4.add(tmp5);
            }
        }
        System.out.println("Lista 4: ");
        lista4.forEach(System.out::println);
    }
}
