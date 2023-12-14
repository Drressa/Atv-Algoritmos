import javax.swing.JOptionPane;
public class Questao9 {
    public static void main(String[] args) {
        /*9)Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendovendida respectivamente por 10, 12 e 15 reais.
        Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda,
        e a máquina informe quanto será o valor arrecadado.*/

        int qtdPequenas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas pequenas:"));
            int qtdMedias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas médias:"));
            int qtdGrandes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas grandes:"));

            double valorArrecadado = calcularValorArrecadado(qtdPequenas, qtdMedias, qtdGrandes);

            JOptionPane.showMessageDialog(null, "O valor arrecadado é R$" + valorArrecadado);

        private static double calcularValorArrecadado(int qtdPequenas, int qtdMedias, int qtdGrandes) {
            return qtdPequenas * 10 + qtdMedias * 12 + qtdGrandes * 15;
        }
    }
}
