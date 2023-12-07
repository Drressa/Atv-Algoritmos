

import javax.swing.JOptionPane;

public class EXER29 {
    public static void main(String[] args) {

        /*
            29. Ler os coeficientes 'a' e 'b' de uma reta y=ax+b e exibir as coordenadas em que o ponto
            toca o eixo x. Assuma que é diferente de 0.
         */

        // Declaração de variáveis
        double a, b, x;
        String stA, stB;


        // Entrada de dados
        stA = JOptionPane.showInputDialog(null, "Coeficiente 'a': ");
        a = Double.parseDouble(stA);
        stB = JOptionPane.showInputDialog(null, "Coeficiente 'b': ");
        b = Double.parseDouble(stB);

        // Cálculo da coordenada x
        x = -b / a;

        // Saída de dados
        JOptionPane.showMessageDialog(null, "O ponto em que a reta toca o eixo x é: (" + x + ", " + b + ")");

    }
}
