/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Samuel
 */
public class ListaReproduccion {

    private ArrayList<Cancion> canciones;

    public ListaReproduccion() {
        this.canciones = new ArrayList<>();
    }

    public int numeroCanciones() {

        return canciones.size();
    }

    public boolean estaVacia() {

        return canciones.isEmpty();
    }

    public Cancion escucharCancion(int posi) {
        if (posi >= 0 && posi < canciones.size()) {
            return canciones.get(posi);
        }
        return canciones.get(canciones.size() - 1);

    }

    public void cambiarCancion(int num, Cancion cancion) {
        if (num >= 0 && num < canciones.size()) {
            canciones.set(num, cancion);
        }

    }

    public void grabarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void eliminaCancion(int posicionBorrar) {
        canciones.remove(posicionBorrar);
    }

    public void eliminaCancion(Cancion cancionBorrar) {
        canciones.remove(cancionBorrar);
    }

    public void imprimirLista(ListaReproduccion tmp) {
        for (int i = 0; i < tmp.numeroCanciones(); i++) {
            System.out.println(tmp.canciones.get(i).getNombre());
        }

    }

    public int buscarCancion(Cancion c) {

        return canciones.indexOf(c);
    }

    public void ordenarTitulo() {
        Comparator<Cancion> criterio = (c1, c2) -> c1.getNombre().compareTo(c2.getNombre());
        Collections.sort(canciones, criterio);
    }

}
