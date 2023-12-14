package Cap5;

import javax.swing.JOptionPane;
public class Questao3{
    public static void main(String[] args) {
         /*3) Em matemática, uma série é uma sequencia de números que possui uma lei de formação.
            Faça um algoritmo paa calcular a soma da série abaixo, onde N é fornecido pelo usuário: 1/2 + 1/4 + 1/6 + ... 1/2N*/

            // Obter o valor de N do usuário usando JOptionPane
            String input = JOptionPane.showInputDialog("Digite o valor de N:");
            int n = Integer.parseInt(input);

            double soma = 0;

            // Calcular a soma da série
            for (int i = 1; i <= n; i++) {
                soma += 1.0 / (2 * i);
            }

            // Exibir o resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, "A soma da série para N = " + n + " é: " + soma);
    }
}