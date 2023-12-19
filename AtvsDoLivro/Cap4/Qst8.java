import javax.swing.JOptionPane;
public class Questao8 {
    public static void main(String[] args) {
            

            double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x:"));
            double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y:"));

            double parabola = x * x - 3 * x + 1;

            if (y > parabola) {
                JOptionPane.showMessageDialog(null, "O ponto está acima da parábola.");
            } else if (y < parabola) {
                JOptionPane.showMessageDialog(null, "O ponto está abaixo da parábola.");
            } else {
                JOptionPane.showMessageDialog(null, "O ponto pertence à parábola.");
            }
    }
}