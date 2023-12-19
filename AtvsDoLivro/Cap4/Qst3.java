import javax.swing.JOptionPane;
public class Questao3 {
    public static void main(String[] args) {
      
            int diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana (1 a 7):"));
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do espectador:"));
            double precoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço base do ingresso:"));

            double precoFinal = calcularPrecoFinal(diaSemana, idade, precoBase);

            JOptionPane.showMessageDialog(null, "O valor a pagar é de R$" + precoFinal);
        }
        private static double calcularPrecoFinal(int diaSemana, int idade, double precoBase) {
            double descontoDia = (diaSemana == 3) ? 0.5 : 0;
            double descontoIdade = (idade < 14) ? 0.5 : 0;

            return precoBase * (1 - descontoDia) * (1 - descontoIdade);
    }
}