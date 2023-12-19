import javax.swing.JOptionPane;
public class Questao9 {
    public static void main(String[] args) {
       

        int qtdPequenas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de camisetas pequenas:"));
            int qtdMedias = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de camisetas médias:"));
            int qtdGrandes = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de camisetas grandes:"));

            double valorArrecadado = calcularValorArrecadado(qtdPequenas, qtdMedias, qtdGrandes);

            JOptionPane.showMessageDialog(null, "O valor arrecadado é R$" + valorArrecadado);

        private static double calcularValorArrecadado(int qtdPequenas, int qtdMedias, int qtdGrandes) {
            return qtdPequenas * 10 + qtdMedias * 12 + qtdGrandes * 15;
        }
    }
}
