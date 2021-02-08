/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20;

/**
 *
 * @author samuel
 */
public class Ejer20 {

    //False el asiento no está ocupado, true el asiento ya está ocupado
    
    boolean[][] asientos = new boolean[25][4];

    public Ejer20() {
    }
    
    public void MostrarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.println(asientos[i][j]);
            }
        }
    }

    public boolean[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }
    

}
