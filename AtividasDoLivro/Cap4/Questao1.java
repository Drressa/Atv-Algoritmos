import javax.swing.JOptionPane;
public class Questao1 {

    public static void main(String[] args) {
        /* 1) A partir do saldo bancário inicial, um cliente teve débitos e créditos ao longo do mês.
        Faça um algoritmo para ler o saldo inicial, o total de débitos e o total de créditos,e depois
        escrever o saldo final do cliente através da mensagem "Saldo positivo em R$xx" ou Saldo negativo em R$xx" ou "Saudo zero".*/

            // Lê o saldo inicial do cliente
            double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));

            // Lê o total de débitos
            double debitos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de débitos:"));

            // Lê o total de créditos
            double creditos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de créditos:"));

            // Calcula o saldo final
            double saldoFinal = saldoInicial - debitos + creditos;

            // Exibe o resultado com base no saldo final
            if (saldoFinal > 0) {
                JOptionPane.showMessageDialog(null, "Saldo positivo em R$" + saldoFinal);
            } else if (saldoFinal < 0) {
                JOptionPane.showMessageDialog(null, "Saldo negativo em R$" + saldoFinal);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo zero.");
            }
    }
}
