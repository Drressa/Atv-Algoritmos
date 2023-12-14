import javax.swing.JOptionPane;

public class EXER01 {

    public static void main(String[] args) {
        /* 1. Escreva um programa para ler 3 valores e escrever o maior deles. Considere que
            o usuário não informará valores iguais */
        
        // Solicita ao usuário para inserir os três valores
        String input1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        double valor1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo valor:");
        double valor2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Digite o terceiro valor:");
        double valor3 = Double.parseDouble(input3);

        // Determina o maior valor
        double maiorValor = Math.max(Math.max(valor1, valor2), valor3);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maiorValor);
    }
}
