import javax.swing.JOptionPane;
public class Questao3 {
    public static void main(String[] args) {
        /*3) Os ingressos no cinema Belas Artes custam X reais. Na terça-feira há um desconto de 50%, e em qualquer dia, menores de 14 anos também têm um desconto de 50%.
        Faça um algoritmo que, sendo lidos o dia da semana, a idade do espectador e o preço base do ingresso, imprima o valor a pagar.
     Considere que dia 1 é domingo, 2 é segunda-feira, etc. Ex: ingresso na terça-feira para um espectador de 11 anos, com preço-base de R$12,00 - o valor a pagar é de R$30,00.*/
            int diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana (1 a 7):"));
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do espectador:"));
            double precoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço base do ingresso:"));

            double precoFinal = calcularPrecoFinal(diaSemana, idade, precoBase);

            JOptionPane.showMessageDialog(null, "O valor a pagar é de R$" + precoFinal);
        }
        private static double calcularPrecoFinal(int diaSemana, int idade, double precoBase) {
            double descontoDia = (diaSemana == 3) ? 0.5 : 0;
            double descontoIdade = (idade < 14) ? 0.5 : 0;

            return precoBase * (1 - descontoDia) * (1 - descontoIdade);
    }
}