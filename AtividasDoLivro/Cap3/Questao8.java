import javax.swing.JOptionPane;
public class Questao8 {
    public static void main(String[] args) {
        /*8)Faça um algoritmo para ler três notas de um aluno em uma disciplina e
        impriir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3)*/

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

            double media = calcularMediaPonderada(nota1, nota2, nota3);

            JOptionPane.showMessageDialog(null, "A média ponderada é: " + media);

        private static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
            return (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;
        }
    }

}
