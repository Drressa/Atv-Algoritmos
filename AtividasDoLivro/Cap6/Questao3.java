package Cap6;

import javax.swing.*;
public class Questao3 {
    public static void main(String[] args) {

    /*3) Escreva um algoritmo que leia uma série de 20 saldos de clientes de um banco e armazene em uma
    estrutura do tipo vetor. Imprimir depois aqueles saldos com centavos*/

        // Declara um vetor para armazenar os saldos
        double[] saldos = new double[20];

        // Lê os saldos do usuário
        for (int i = 0; i < saldos.length; i++) {
            saldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do cliente " + (i + 1)));
        }

        // Imprime os saldos com centavos
        for (double saldo : saldos) {
            JOptionPane.showMessageDialog(null, "Saldo: " + String.format("%.2f", saldo));
        }
    }
}