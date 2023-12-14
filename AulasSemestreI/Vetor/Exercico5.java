import javax.swing.JOptionPane;

public class Exercico5 {

    public static void main(String[] args) {

        // Solicitar ao usuário o valor de n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n:"));

        // Calcular a soma dos n primeiros inteiros pares
        int resultado = somaParesRecursivo(n);

        // Exibir o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A soma dos " + n + " primeiros inteiros pares é: " + resultado);
    }

    public static int somaParesRecursivo(int n) {

        // Caso base: se n for 1, a soma é 2
        if (n == 1) {
            return 2;
        }
        else
        {
            // Chamada recursiva: (2 * n) + soma(n - 1)
            return (2 * n) + somaParesRecursivo(n - 1);
        }
    }
}
