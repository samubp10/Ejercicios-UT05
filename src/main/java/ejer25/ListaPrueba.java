/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer25;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author samuel
 */
public class ListaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion();
        lista.grabarCancion(new Cancion("Motorola", 12));
        lista.grabarCancion(new Cancion("Un barquito", 124));
        lista.grabarCancion(new Cancion("Elefante", 123));
        lista.cambiarCancion(0, new Cancion("Hola", 1233));
        System.out.println("Número de canciones" + lista.numeroCanciones());
        System.out.println("¿Está vacia?" + lista.estaVacia());
        Cancion escuchar = lista.escucharCancion(1);
        System.out.println("Escuchando..." + escuchar);
        lista.eliminaCancion(0);
        lista.imprimirLista(lista);
        lista.grabarCancion(new Cancion("lucid dreams", 10));
        lista.imprimirLista(lista);
        Cancion buscar = new Cancion("lucid dreams", 10);
        System.out.println(lista.buscarCancion(buscar));

    }

}
