import javax.swing.JOptionPane;
public class Questao5 {
    public static void main(String[] args) {
        /*5)Um motorista deseja colocar no seu tanque X reais de gasolina.
        Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque*/

        double precoLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro da gasolina:"));
        double valorPagamento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento:"));

        double litrosAbastecidos = calcularLitrosAbastecidos(precoLitro, valorPagamento);

        JOptionPane.showMessageDialog(null, "Você conseguiu abastecer " + litrosAbastecidos + " litros de gasolina.");

        private static double calcularLitrosAbastecidos(double precoLitro, double valorPagamento) {
            return valorPagamento / precoLitro;
        }
    }
}

