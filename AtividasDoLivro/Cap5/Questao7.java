package Cap5;

import javax.swing.JOptionPane;

public class Questao7 {

    public static void main(String[] args) {
        /*7) Mostre o que será impresso pelo algoritimo abaixo:*/

        // Inicializar variáveis
        int i = 1;

        // Loop while
        while (i < 20) {
            // Incrementar i
            i += 2;

            // Mostrar mensagem
            JOptionPane.showMessageDialog(null, "Passei por aqui!");

            // Chamar função quad(1)
            quad(1);

            // Mostrar número 13
            JOptionPane.showMessageDialog(null, 13);

            // Mostrar mensagem
            JOptionPane.showMessageDialog(null, "Ufa, cheguei aqui!");
        }
    }

    public static void quad(int x) {
        // Calcular e mostrar o quadrado de x
        JOptionPane.showMessageDialog(null, x * x);
    }
}
