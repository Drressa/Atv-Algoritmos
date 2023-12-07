

import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
            Crie um algoritmo que mostre a  diferença entre 2 números inteiros negativos;
         */

        int num1, num2, diferenca;
        String stNum1, stNum2;

        stNum1 = JOptionPane.showInputDialog(null,"Insira o primeiro núemro:");
        stNum2 = JOptionPane.showInputDialog(null,"Insira o segundo número:");

        num1 = Integer.parseInt(stNum1);
        num2 = Integer.parseInt(stNum2);
        diferenca = (num1-num2);

        JOptionPane.showMessageDialog(null,"A diferença entre "+num1+" e "+num2+" é: "+diferenca);

    }
}
