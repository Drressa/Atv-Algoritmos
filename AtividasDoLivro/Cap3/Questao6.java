import javax.swing.JOptionPane;
public class Questao6 {
    public static void main(String[] args) {
        /*6)O restaurante a quelo Bem-Bão cobra R$12,00 por cada quilo de refeição.
        Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
        Assuma que a balança já desconte o peso do prato. */

        double pesoPrato = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do prato (em quilos):"));

            double valorPagar = calcularValorPagar(pesoPrato);

            JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + valorPagar);

        private static double calcularValorPagar(double pesoPrato) {
            return pesoPrato * 12.00;
        }
    }

}