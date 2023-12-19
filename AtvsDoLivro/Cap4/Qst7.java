import javax.swing.JOptionPane;
public class Questao7 {
    public static void main(String[] args) {
    

        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
            double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 6) {
                JOptionPane.showMessageDialog(null, nomeAluno + " foi aprovado com média " + media);
            } else {
                JOptionPane.showMessageDialog(null, nomeAluno + " foi reprovado com média " + media);
            }
    }
}