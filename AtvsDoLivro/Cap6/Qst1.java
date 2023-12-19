package Cap6;

import javax.swing.*;
public class Questao1 {
    public static void main(String[] args) {
        /*1) O gichê de pédagio de uma rodovia possui um equipamento que registra diariamente a quantidade de carros qua ali passaram.
        Faça um algoritmo para ler cada registro do mês de setembro e informar qual o maior volume de carros que passaram e em qual dia ele ocorreu*/

        // Declara uma lista para armazenar os registros
        int[] registros = new int[30];

        // Lê os registros do usuário
        for(int i = 0; i < registros.length; i++) {
            int quantidadeDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
            registros[i] = quantidadeDeCarros;
        }
        // Calcula o maior volume de carros
        int maiorVolume = 0;
        int diaDoMaiorVolume = 0;
            for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorVolume) {
                maiorVolume = registros[i];
             diaDoMaiorVolume = i + 1;
            }
        }
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram no mês de setembro foi de " + maiorVolume + " no dia " + diaDoMaiorVolume);
    }
}

