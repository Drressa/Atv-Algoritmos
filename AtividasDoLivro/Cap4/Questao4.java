import javax.swing.JOptionPane;
public class Questao4 {
    public static void main(String[] args) {
            /*4) Uma máquina virtual recebe um valor e exibe o seu quadrado quando ele é par, e o seu cubo quando ele é impar.
            Faça o algoritmo para esta máquina.*/
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));

            if (valor % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O quadrado do valor é: " + Math.pow(valor, 2));
            } else {
                JOptionPane.showMessageDialog(null, "O cubo do valor é: " + Math.pow(valor, 3));
            }
        }
    }

}
