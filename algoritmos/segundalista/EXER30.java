

import javax.swing.JOptionPane;

public class EXER30 {
    public static void main(String[] args) {

        /*
            30. Uma empresa registra uma pontuação para cada funcionário, de acordo com a tabela:
            Participação em um projeto de grande porte: 10 pontos;
            Participação em um projeto de médio porte: 5 pontos;
            Participação em um projeto de pequeno porte: 2 pontos;
            Tempo de empresa: 2 pontos por ano;
            Faça um algoritmo que leia a quantidade  de projetos em que um funcionáiro atuou,
            bem como seu tempo de casa, e imprima o total de pontos acumulados.
         */

        // Declaração de variáveis
        int projetoGrande, projetoMedio, projetoPequeno, totalPontos, tempoEmpresa;
        String stProjetoGrande, stProjetoMedio, stProjetoPequeno, stTempoEmpresa;

        // Entrada de dados
        stProjetoGrande = JOptionPane.showInputDialog("Digite a quantidade de projetos de grande porte: ");
        projetoGrande = Integer.parseInt(stProjetoGrande);

        stProjetoMedio = JOptionPane.showInputDialog("Digite a quantidade de projetos de médio porte: ");
        projetoMedio = Integer.parseInt(stProjetoGrande);

        stProjetoPequeno = JOptionPane.showInputDialog("Digite a quantidade de projetos de pequeno porte:");
        projetoPequeno = Integer.parseInt(stProjetoPequeno);

        stTempoEmpresa = JOptionPane.showInputDialog(null, "Digite o tempo de empresa em anos:");
        tempoEmpresa = Integer.parseInt(stTempoEmpresa);

        // Cálculo dos pontos

        totalPontos = (projetoGrande * 10) + (projetoMedio * 5) + (projetoPequeno * 2) + (tempoEmpresa * 2);

        // Saída de dados
        JOptionPane.showMessageDialog(null, "A pontuação total do funcionário é: " + totalPontos);


    }
}
