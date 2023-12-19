package Cap5;

import javax.swing.*;
public class Questao4 {
    public static void main(String[] args) {
        /*4) Faça um algoritmo para gerar o valor da constante Pi(3,145..).
        Este valor pode ser obtido pela soma da seguinte série (estabeleça um fim; quanto maior, mais preciso)
        pi=4-4/3+4/5-4/7+4/9-4/11*/
            // Obter o número de iterações do usuário usando JOptionPane
            String input = JOptionPane.showInputDialog("Digite o número de iterações para calcular Pi:");
            int iteracoes = Integer.parseInt(input);

            // Calcular o valor aproximado de Pi
            double piAproximado = calculaPi(iteracoes);

            // Exibir o resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, "Valor aproximado de Pi: " + piAproximado);
        }

        // Método para calcular o valor de Pi usando a série fornecida
        private static double calculaPi(int iteracoes) {
            double pi = 0.0;

            for (int i = 0; i < iteracoes; i++) {
                double termo = 4.0 / (2 * i + 1);

                // Alternar sinal a cada termo
                if (i % 2 == 0) {
                    pi += termo;
                } else {
                    pi -= termo;
                }
            }

            return pi;
    }
}
