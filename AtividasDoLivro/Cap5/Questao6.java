package Cap5;

import javax.swing.*;
public class Questao6 {
    public static void main(String[] args) {
        /*6)Modifique o algoritmo anterior para imprimir o valor de um número X elado a uma potencia Y*/

            // Obter a base (X) do usuário usando JOptionPane
            String inputBase = JOptionPane.showInputDialog("Digite a base (X):");
            double base = Double.parseDouble(inputBase);

            // Obter o expoente (Y) do usuário usando JOptionPane
            String inputExpoente = JOptionPane.showInputDialog("Digite o expoente (Y):");
            int expoente = Integer.parseInt(inputExpoente);

            // Calcular a potência de X elevado a Y
            double resultado = Math.pow(base, expoente);

            // Exibir o resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é: " + resultado);
        }
    }

}

