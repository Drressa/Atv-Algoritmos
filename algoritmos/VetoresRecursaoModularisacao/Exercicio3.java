import javax.swing.*;

public class Exercicio3 {

    public static void main(String[] args) {
        // Solicitar ao usuário o tamanho do array
        int tamanhoDoArray = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array:"));

        // Solicitar ao usuário os valores do array
        double[] arrayDeReais = new double[tamanhoDoArray];
        for (int i = 0; i < tamanhoDoArray; i++) {
            arrayDeReais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " do array:"));
        }

        // Calcular a soma recursiva
        double resultado = somaArrayRecursivo(arrayDeReais, tamanhoDoArray);

        // Exibindo o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A soma do array é: " + resultado);
    }

    public static double somaArrayRecursivo(double[] v, int tamanho) {
        // Caso base: se o tamanho for 0, a soma é 0
        if (tamanho == 0) {
            return 0;
        } else {
            // Chamada recursiva: soma do último elemento com a soma do restante do array
            return v[tamanho - 1] + somaArrayRecursivo(v, tamanho - 1);
        }
    }
    }
