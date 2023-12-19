import javax.swing.JOptionPane;
public class Questao6 {
    public static void main(String[] args) {
        

            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                JOptionPane.showMessageDialog(null, ano + " é um ano bissexto.");
            } else {
                JOptionPane.showMessageDialog(null, ano + " não é um ano bissexto.");
            }
    }
}