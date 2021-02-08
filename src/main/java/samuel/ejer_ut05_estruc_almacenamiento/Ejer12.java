/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.ejer_ut05_estruc_almacenamiento;

/**
 *
 * @author samuel
 */
public class Ejer12 {
        public static void main(String[] args) {
            char[][] caracteres = new char[2][3];
            caracteres[0][0]='a';
            caracteres[0][1]='b';
            caracteres[0][2]='c';
            caracteres[1][0]='d';
            caracteres[1][1]='e';
            for(int i = 0;i<caracteres.length;i++){
                for(int j=0;j<caracteres[i].length;j++){
                    System.out.println(caracteres[i][j]);
                }
            }
            
        }
            
}
