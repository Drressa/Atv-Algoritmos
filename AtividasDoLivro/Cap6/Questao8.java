package Cap6;

import javax.swing.JOptionPane;

public class Questao8 {
    public static void main(String[] args) {
        /*8) Um aluno possui 4 notas em cada uma das 5 disciplinas que cursa num colégio.
        Faça um algoritmo para ler as notas do aluno, e indicar qual foi a mais alta.*/


        // Número de disciplinas e notas por disciplina
        int numDisciplinas = 5;
        int numNotasPorDisciplina = 4;

        // Variável para armazenar a nota mais alta
        double notaMaisAlta = Double.MIN_VALUE;

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
                }
            }
        }
        // Exibir a nota mais alta usando JOptionPane
        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notaMaisAlta);
    }
}