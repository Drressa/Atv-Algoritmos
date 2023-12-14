import javax.swing.JOptionPane;
public class Questao2 {
    public static void main(String[] args) {
        /*2)Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras*/

        int quantidadeCavalos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos:"));

        int quantidadeFerraduras = calcularQuantidadeFerraduras(quantidadeCavalos);

        JOptionPane.showMessageDialog(null, "São necessárias " + quantidadeFerraduras + " ferraduras.");

        private static int calcularQuantidadeFerraduras(int quantidadeCavalos) {
            return quantidadeCavalos * 4; // Cada cavalo tem 4 ferraduras
        }
    }
}