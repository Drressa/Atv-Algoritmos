package Cap6;

import javax.swing.*;
public class Questao7 {
    public static void main(String[] args) {
        /*7) Faça um algoritmo para ler dois preços de 15 produtos de uma cesta básica (anotados no inicio e no fim de uma semana),
        e imprimir uma listagem com o preço médio de cada produto.*/

        // Declara um vetor para armazenar os preços dos produtos no início da semana
        double[] precosIniciais = new double[15];

        // Declara um vetor para armazenar os preços dos produtos no fim da semana
        double[] precosFinais = new double[15];

        // Lê os preços dos produtos no início da semana
        for (int i = 0; i < precosIniciais.length; i++) {
            precosIniciais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no início da semana:"));
        }

        // Lê os preços dos produtos no fim da semana
        for (int i = 0; i < precosFinais.length; i++) {
            precosFinais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no fim da semana:"));
        }

        // Calcula a variação de preço de cada produto
        double[] variacoes = new double[15];
        for (int i = 0; i < variacoes.length; i++) {
            variacoes[i] = precosFinais[i] - precosIniciais[i];
        }

        // Calcula o preço médio de cada produto
        double[] precosMedios = new double[15];
        for (int i = 0; i < precosMedios.length; i++) {
            precosMedios[i] = (precosIniciais[i] + precosFinais[i]) / 2;
        }

        // Imprime a listagem com o preço médio de cada produto
        for (int i = 0; i < precosMedios.length; i++) {
            JOptionPane.showMessageDialog(null, "Preço médio do produto " + (i + 1) + ": " + String.format("%.2f", precosMedios[i]));
        }
    }
}