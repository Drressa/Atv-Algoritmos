import javax.swing.*;

public class Exercico4 {

    public static void main(String[] args) {

        // Solicitar ao usuário o valor de n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n:"));

        // Calcular a soma dos n primeiros inteiros ímpares
        int resultado = somaImparesRecursivo(n);

        // Exibir o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A soma dos " + n + " primeiros inteiros ímpares é: " + resultado);
    }

    public static int somaImparesRecursivo(int n) {

        // Caso base: se n for 1, a soma é 1
        if (n == 1) {
            return 1;
        } else {
            // Chamada recursiva: (2 * n - 1) + soma(n - 1)
            return (2 * n - 1) + somaImparesRecursivo(n - 1);
        }
    }
}
