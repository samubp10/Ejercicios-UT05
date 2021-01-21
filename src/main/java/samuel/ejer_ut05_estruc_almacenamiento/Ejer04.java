/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ejer_ut05_estruc_almacenamiento;
import javax.swing.JOptionPane;
/**
 *
 * @author samuel
 */
public class Ejer04 {

    public static void main(String[] args) {
        int i;
        int[] entero = new int[6];
        entero[0] = 1;
        entero[1] = 2;
        entero[2] = 3;
        entero[3] = 4;
        entero[4] = 5;
        entero[5] = 6;
        String  numero = JOptionPane.showInputDialog("Introduzca un número");
        int numeroIntroducido = Integer.parseInt(numero);
        
        for(i=0;i<entero.length;i++){
            if(entero[i]==numeroIntroducido){
              JOptionPane.showMessageDialog(null, "Su número es el " +entero[i] + " y se encuenta en la posición " + i);  
              break;
            }
        }
        
    }

}
