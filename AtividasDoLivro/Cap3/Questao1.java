import javax.swing.JOptionPane;
public class Questao1 {
    public static void main(String[] args) {
        /*1)A imobiliária Imóbilis vende apenas terrenos retangulares.
        Faça um algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno*/

        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terreno:"));
            double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno:"));

            double area = calcularAreaTerreno(comprimento, largura);

            JOptionPane.showMessageDialog(null, "A área do terreno é: " + area + " metros quadrados.");
        }

        private static double calcularAreaTerreno(double comprimento, double largura) {
            return comprimento * largura;
        }
    }


}