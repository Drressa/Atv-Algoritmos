import javax.swing.JOptionPane;
public class Questao4 {
    public static void main(String[] args) {
           
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));

            if (valor % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O quadrado do valor é: " + Math.pow(valor, 2));
            } else {
                JOptionPane.showMessageDialog(null, "O cubo do valor é: " + Math.pow(valor, 3));
            }
        }
    }

}
