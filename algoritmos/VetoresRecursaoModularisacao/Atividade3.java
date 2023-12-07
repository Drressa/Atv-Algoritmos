import  javax.swing.JOptionPane;

public class Atividade3 {

  public static void main(String[] args) {
        // Declara o vetor
        int[] valores = new int[10];

        // Lê os valores do usuário
        for (int i = 0; i < valores.length; i++) {
            String valor = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor: ");
            valores[i] = Integer.parseInt(valor);
        }

        // Solicita o valor de referência
        String valorRef = JOptionPane.showInputDialog("Digite o valor de referência: ");
        int refe = Integer.parseInt(valorRef);

        // Conta quantas vezes o valor de referência aparece no vetor
        int conta = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == refe) {
                conta++;
            }
        }

        // Armazena todos os números divisiveis pelo valor de referência em um vetor
        int[] divisiveis = new int[conta];
        int j = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % refe == 0) {
                divisiveis[j++] = valores[i];
            }
        }

        // Mostra o resultado
        JOptionPane.showMessageDialog(null, "O valor de referência aparece " + conta + " vezes no vetor.");
        JOptionPane.showMessageDialog(null, "Os números divisiveis pelo valor de referência são: " + Arrays.toString(divisiveis));
    }
}