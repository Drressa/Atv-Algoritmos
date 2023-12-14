import javax.swing.JOptionPane;
public class Questao3 {
    public static void main(String[] args) {
        /*3)A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a  cada dia. Cada pãozinho custa R$0,12 e a broa custa R$1,50.
        Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado).
        Você foi contratado para fazer os cálculos para o dono. Com base neestes fatos, faça um algoritmo para ler as quantidades de pães e de broas,
        e depois calcular os dados solicitados.*/

        int quantidadePaes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pães franceses:"));
        int quantidadeBroas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de broas:"));

        double valorTotal = calcularValorTotal(quantidadePaes, quantidadeBroas);
        double valorPoupanca = calcularValorPoupanca(valorTotal);

        JOptionPane.showMessageDialog(null, "A arrecadação total é de R$" + valorTotal +  "\nO valor a ser guardado na poupança é de R$" + valorPoupanca);
        }
        private static double calcularValorTotal(int quantidadePaes, int quantidadeBroas) {
            double valorPaes = quantidadePaes * 0.12;
            double valorBroas = quantidadeBroas * 1.50;

            return valorPaes + valorBroas;
        }
        private static double calcularValorPoupanca(double valorTotal) {
            return valorTotal * 0.10;
        }
    }
}