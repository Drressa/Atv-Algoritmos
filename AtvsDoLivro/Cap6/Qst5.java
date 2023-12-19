package Cap6;

import javax.swing.*;
public class Questao5 {
    public static void main(String[] args) {
        /*5)Criar a matriz:
        1 1 1 1 1 1
        1 2 2 2 2 1
        1 2 3 3 2 1
        1 2 3 3 2 1
        1 2 2 2 2 1
        1 1 1 1 1 1
        Generalize o problema para uma matriz NxN*/

        // Declara a matriz
        int[][] matriz = new int[6][6];

        // Preenche a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        // Imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                JOptionPane.showMessageDialog(null, "matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}