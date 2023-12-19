package Cap5;

import javax.swing.JOptionPane;
public class Questao1 {
    public static void main(String[] args) {
        /*1) A fábrica da Vôlquis produz uma determinada quantidade de automóveis por dia.
        Faça um algoritmo para ler a quantidade produzida diariamente ao longo de um ano, e depois informe:
        /*a) a quantidade produzida no ano td ;
        b) a menor produção diária.
        Considere que o valor -1 indica fim da digitação; observe que há dias em que não há produção.*/

        int quantidadeDiaria;
        int quantidadeProduzidaAno = 0;
        int menorProducaoDiaria = Integer.MAX_VALUE;
        int dia = 1;

        JOptionPane.showMessageDialog(null, "Digite a quantidade produzida diariamente ao longo do ano (-1 para encerrar):");

        while (true) {
            String input = JOptionPane.showInputDialog("Quantidade do dia " + dia + " (ou -1 para encerrar):");

            try {
                quantidadeDiaria = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
                continue;
            }

            // Verificar se o usuário quer encerrar a digitação
            if (quantidadeDiaria == -1) {
                break;
            }

            // Atualizar a quantidade produzida no ano
            quantidadeProduzidaAno += quantidadeDiaria;

            // Verificar se a produção diária é a menor até agora
            if (quantidadeDiaria < menorProducaoDiaria) {
                menorProducaoDiaria = quantidadeDiaria;
            }

            dia++;
        }

        // Exibir os resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "Quantidade produzida no ano: " + quantidadeProduzidaAno + "\n" +
                        "Menor produção diária: " + (menorProducaoDiaria == Integer.MAX_VALUE ? "N/A" : menorProducaoDiaria));
    }
}