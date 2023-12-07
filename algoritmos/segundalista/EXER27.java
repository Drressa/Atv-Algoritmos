

import javax.swing.JOptionPane;

public class EXER27 {
    public static void main(String[] args) {

        /*Um plano de fidelidade acumula 1 ponto para cada R$5.00 gastos em compras nas
        lojas afiliadas. Faça um algoritmo para ler o valor de 4 compras feitas por um cliente,
        e exibir quantos pontos ele acumulou no total. Considere que o cliente pode acumular  pontos
        fracionário.
         */

        //declarar variável
        double compra1, compra2, compra3, compra4, pontos;
        String stCompra1, stCompra2, stCompra3, stCompra4;


        //entrada de dados

        JOptionPane.showMessageDialog(null, "Para cada R$5.00 em compras ganhe 1 ponto!");
        stCompra1 = JOptionPane.showInputDialog(null, "Valor 1ª compra:");
        compra1 = Double.parseDouble(stCompra1);
        stCompra2 = JOptionPane.showInputDialog("Valor 2ª compra:");
        compra2 = Double.parseDouble(stCompra2);
        stCompra3 = JOptionPane.showInputDialog(null, "Valor 3ª compra: ");
        compra3 = Double.parseDouble(stCompra3);
        stCompra4 = JOptionPane.showInputDialog(null, "Valor 4ª compra: ");
        compra4 = Double.parseDouble(stCompra4);

        //cálculo acúmulo de pontos
        pontos = ((compra1 / 5.00) + (compra2 / 5.00) + (compra3 / 5.00) + (compra4 / 5.00));

        //saída de dados
        JOptionPane.showMessageDialog(null, "Você acumulou " + pontos + " pontos");

    }
}

