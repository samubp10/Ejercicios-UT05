/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejer20 reserva = new Ejer20();
        Scanner escaner = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("¿Qué desea hacer?\n 1-Mostrar los asientos\n 2-Reservar\n 3-Cancelar reserva\n 4-Salir");
            eleccion = escaner.nextInt();
            int fila;
            int columna;
            switch (eleccion) {
                case 1:
                    reserva.MostrarAsientos();
                    break;
                case 2:
                    System.out.println("Indique la fila donde se encuentra el asiento que quiere reservar");
                    fila = escaner.nextInt();
                    System.out.println("Indique la columna donde se encuentra el asiento que quiere reservar");
                    columna = escaner.nextInt();
                    reserva.ReservarAsiento(fila, columna);
                    break;
                case 3:
                    System.out.println("Indique la fila donde se encuentra el asiento que quiere cancelar");
                    fila = escaner.nextInt();
                    System.out.println("Indique la columna donde se encuentra el asiento que quiere cancelar");
                    columna = escaner.nextInt();
                    reserva.CancelarReserva(fila, columna);
                    break;
                case 4:
                    break;
            }
        } while (eleccion != 4);
    }

}
