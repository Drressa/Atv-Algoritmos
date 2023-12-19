package Cap6;

import javax.swing.*;
public class Questao2 {
    public static void main(String[] args) {
        /*2) Modifique o algoritmo anterior de forma que também informe o menor volume*/

        // Declara uma lista para armazenar os registros
        int[] registros = new int[30];

        // Lê os registros do usuário
        for (int i = 0; i < registros.length; i++) {
            int quantidadeDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
                registros[i] = quantidadeDeCarros;
        }
        // Calcula o maior e o menor volume de carros
        int maiorVolume = 0;
        int diaDoMaiorVolume = 0;
        int menorVolume = Integer.MAX_VALUE;
        int diaDoMenorVolume = 0;
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorVolume) {
                maiorVolume = registros[i];
                diaDoMaiorVolume = i + 1;
            } else if (registros[i] < menorVolume) {
                menorVolume = registros[i];
                diaDoMenorVolume = i + 1;
            }
        }
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram no mês de setembro foi de " + maiorVolume + " no dia "
                + diaDoMaiorVolume + "\nO menor volume de carros que passaram no mês de setembro foi de " + menorVolume + " no dia " + diaDoMenorVolume);
    }
}


