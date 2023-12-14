import javax.swing.JOptionPane;
public class Questao4 {
    public static void main(String[] args) {
            /*4)Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui.
            Considere sempre anos completos, e que um ano possui 365 dias.
            Ex: uma pessoa com 19 anos possui 6935 dias de vida*/

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        int diasDeVida = calcularDiasDeVida(idade);

        JOptionPane.showMessageDialog(null, nome + " possui " + diasDeVida + " dias de vida.");

        private static int calcularDiasDeVida(int idade) {
        return idade * 365; // Cada ano possui 365 dias
         }
    }
}