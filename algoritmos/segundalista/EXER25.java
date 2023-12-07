

import javax.swing.JOptionPane;

public class EXER25 {
    public static void main(String[] args) {

        /*
            25. Calcule volume de uma caixa d'água cilíndrica. Considere pi como: 3.14.
         */

        // Declaração de variáveis
        double raio, altura, volume;
        String stRaio, stAltura;

        // Entrada de dados
        stRaio = JOptionPane.showInputDialog(null, "Informe o raio da caixa d'água: ");
        raio = Double.parseDouble(stRaio);
        stAltura = JOptionPane.showInputDialog(null, "Informe a altura da caixa d'água: ");
        altura = Double.parseDouble(stAltura);

        // Cálculo do volume
        volume = 3.14 * Math.pow(raio, 2) * altura;

        // Saída de dados
        JOptionPane.showMessageDialog(null, "O volume da caixa d'água é de " + volume + " litros");


    }
}
