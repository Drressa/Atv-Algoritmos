import javax.swing.JOptionPane;

public class Atividade1 {

    public static void main(String[] args) {
        // Declara um vetor de 10 inteiros
        int[] valores = new int[10];
        int[] vall = new int [10];
        int[] x = new int[0];

        // Lê 10 valores do usuário
        java.lang.Object JOptionPane;
        for (int i = 0; i < valores.length; i++) {
            String valor = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor: ");
            valores[i] = Integer.parseInt(valor);
        }

        // Inverte os valores no vetor
        for (int i = 9; i > 0; i--) {
            vall[i] = valores[x];
            x++;
            valores = valores[i] + "\n";
        }

        // Imprime os valores na ordem inversa
        for (int i = valores.length - 1; i >= 0; i--) {
            JOptionPane.showMessageDialog(null, valores[i]);
        }
    }
}