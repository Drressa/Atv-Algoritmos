import javax.swing.JOptionPane;
public class Questao10 {
    public static void main(String[] args) {
        /*10) Construa um algoritmo para calcular a distância entre dois pontos de plano carteseabi.
        Cada ponto é um par ordenado (x,y)*/

            double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do primeiro ponto:"));
            double y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do primeiro ponto:"));

            double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do segundo ponto:"));
            double y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do segundo ponto:"));

            double distancia = calcularDistanciaEntrePontos(x1, y1, x2, y2);

            JOptionPane.showMessageDialog(null, "A distância entre os pontos é: " + distancia);

        private static double calcularDistanciaEntrePontos(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        }
    }

}
