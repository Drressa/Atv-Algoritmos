package Cap5;

import javax.swing.JOptionPane;
public class Questao10 {
public static void main(String[] args) {
    /*10)) Escreva um algoritmo que ê 5 valores para uma variável A,
    e informa quantos destes valores são negativos, escrevendo está informação.*/

            int quantidadeNegativos = 0;

            for (int i = 0; i < 5; i++) {
                // Obter valor do usuário usando JOptionPane
                String input = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + ":");
                double valor = Double.parseDouble(input);

                // Verificar se o valor é negativo
                if (valor < 0) {
                    quantidadeNegativos++;
                }
            }

            // Exibir a quantidade de valores negativos usando JOptionPane
            JOptionPane.showMessageDialog(null, "Quantidade de valores negativos: " + quantidadeNegativos);
        }
    }
}
