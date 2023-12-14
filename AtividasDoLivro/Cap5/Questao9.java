package Cap5;

import javax.swing.JOptionPane;
public class Questao9 {
    public static void main(String[] args) {
        /*9) Faça um algoritmo para calcular a soma da série a seguir (o usuário deve informar a quantidade de termos da série):
        1/11+1 + 2/22+1 + 3/33+1 + ...*/

        // Inicializar variáveis
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da série:"));
        double soma = 0;

        // Loop for
        for (int i = 1; i <= n; i++) {
            // Calcular o termo da série
            double termo = (i * i) / (i + 1);

            // Adicionar o termo à soma
            soma += termo;
        }

        // Mostrar a soma
        JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
    }
}
