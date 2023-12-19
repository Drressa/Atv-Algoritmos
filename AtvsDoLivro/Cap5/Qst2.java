package Cap5;

import javax.swing.JOptionPane;
public class Questao2 {

    public static void main(String[] args) {
        /*2) Faça um algoritmo para exibir os números 1, 4, 9, 16, 25, 36, ... , 10000.*/

        int limite = 100;
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i * i <= limite; i++) {
            int quadrado = i * i;
            resultado.append(quadrado);

            // Adicionar uma vírgula e um espaço se não for o último número
            if (i * i < limite) {
                resultado.append(", ");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
