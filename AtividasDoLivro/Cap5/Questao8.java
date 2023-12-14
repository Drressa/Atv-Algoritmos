package Cap5;

import javax.swing.JOptionPane;
public class Questao8 {
    public static void main(String[] args) {
        /*8) Mostre o que será impresso pelo algoritimo abaixo:*/

        // Inicializar variáveis
        int x = 30;
        int y = 0;

        // Loop while
        while (x < 10) {
            // Incrementar x e y
            x++;
            y--;

            // Mostrar x e y
            JOptionPane.showMessageDialog(null, x + " " + y);
        }
    }
}
