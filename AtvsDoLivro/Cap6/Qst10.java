package Cap6;

import javax.swing.JOptionPane;

public class Questao10 {
    public static void main(String[] args) {
        /*10) Faça um algoritmo para ler os valores gastos em cheque por uma pessoa durante um mês, e depois imprimir a lista com todos os valores, o maior e o menor valor.
        No início do algoritmo o usuário deve informar quantos cheques foram usados no mês; estabeleça um número máximo de cheques

         */
        // Número máximo de cheques
        int maxCheques = 10;

        // Variáveis para armazenar os valores dos cheques
        double[] valoresCheques = new double[maxCheques];

        // Solicitar o número de cheques usados no mês
        int numeroCheques;
        do {
            String input = JOptionPane.showInputDialog("Informe o número de cheques usados no mês (até " + maxCheques + " cheques):");
            numeroCheques = Integer.parseInt(input);
        } while (numeroCheques <= 0 || numeroCheques > maxCheques);

        // Ler os valores dos cheques
        for (int i = 0; i < numeroCheques; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor do cheque " + (i + 1) + ":");
            valoresCheques[i] = Double.parseDouble(input);
        }

        // Encontrar o maior e o menor valor
        double maiorValor = valoresCheques[0];
        double menorValor = valoresCheques[0];

        for (int i = 1; i < numeroCheques; i++) {
            if (valoresCheques[i] > maiorValor) {
                maiorValor = valoresCheques[i];
            }
            if (valoresCheques[i] < menorValor) {
                menorValor = valoresCheques[i];
            }
        }

        // Construir a lista de valores
        StringBuilder listaValores = new StringBuilder("Valores dos cheques:\n");
        for (int i = 0; i < numeroCheques; i++) {
            listaValores.append("Cheque ").append(i + 1).append(": ").append(valoresCheques[i]).append("\n");
        }

        // Exibir a lista de valores, o maior e o menor valor usando JOptionPane
        JOptionPane.showMessageDialog(null, listaValores.toString() + "Maior valor: "
                + maiorValor + "\n" + "Menor valor: " + menorValor);
    }
}