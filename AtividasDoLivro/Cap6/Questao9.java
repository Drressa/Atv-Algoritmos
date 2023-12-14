package Cap6;

import javax.swing.JOptionPane;

public class Questao9 {
    public static void main(String[] args) {
        /*9) Modifique o algoritmo anterior para informar também o número da disciplina em que o aluno tirou a nota mais alta*/

        // Número de disciplinas e notas por disciplina
        int numDisciplinas = 5;
        int numNotasPorDisciplina = 4;

        // Variáveis para armazenar a nota mais alta e o número da disciplina
        double notaMaisAlta = Double.MIN_VALUE;
        int disciplinaNotaMaisAlta = 0;

        // Loop externo para iterar sobre as disciplinas
        for (int i = 1; i <= numDisciplinas; i++) {
            // Loop interno para iterar sobre as notas da disciplina atual
            for (int j = 1; j <= numNotasPorDisciplina; j++) {
                // Solicitar a nota ao usuário usando JOptionPane
                String input = JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":");

                // Converter a entrada para double
                double nota = Double.parseDouble(input);

                // Verificar se a nota é a mais alta
                if (nota > notaMaisAlta) {
                    notaMaisAlta = nota;
                    disciplinaNotaMaisAlta = i;
                }
            }
        }
        // Exibir a nota mais alta e o número da disciplina usando JOptionPane
        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notaMaisAlta + " na disciplina " + disciplinaNotaMaisAlta);
    }
}