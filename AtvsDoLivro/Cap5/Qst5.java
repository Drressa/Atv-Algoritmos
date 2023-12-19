package Cap5;

import javax.swing.*;
public class Questao5 {
    public static void main(String[] args) {
            /*5) Faça um algoritmo para ler um número e imprimir o número elevado á quinta potência.*/

            // Obter o número do usuário usando JOptionPane
            String input = JOptionPane.showInputDialog("Digite um número:");
            double numero = Double.parseDouble(input);

            // Calcular o número elevado à quinta potência
            double resultado = Math.pow(numero, 5);

            // Exibir o resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, "O número elevado à quinta potência é: " + resultado);
    }
}