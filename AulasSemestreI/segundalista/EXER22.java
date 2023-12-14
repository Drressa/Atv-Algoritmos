import javax.swing.JOptionPane;

public class EXER22 {

    public static void main(String[] args) {

       /* 22. Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu poupar.
            Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado,
            em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real. Não
            havendo moeda de um tipo, a quantidade respectiva é zero.*/

        //declarar variáveis
        int qtdReais, qtdCinquentaCents, qtdVinteCincoCents, qtdDezCents, qtdCincoCent, qtdUmCent;
        String stQtdReais, stQtdCinquentaCents, stQtdVinteCincoCents, stQtdDezCents, stQtdCincoCent, stQtdUmCent;

        double valorTotal;

        //entrada de dados
        stQtdReais = JOptionPane.showInputDialog(null,"Quantidade de moedas de 1 real:");
        qtdReais = Integer.parseInt(stQtdReais);
        stQtdCinquentaCents = JOptionPane.showInputDialog(null,"Quantidade de moedas de 50 centavos:");
        qtdCinquentaCents = Integer.parseInt(stQtdCinquentaCents);
        stQtdVinteCincoCents= JOptionPane.showInputDialog(null,"Quantidade de moedas de 25 centavos:");
        qtdVinteCincoCents = Integer.parseInt(stQtdVinteCincoCents);
        stQtdDezCents = JOptionPane.showInputDialog(null,"Quantidade de moedas de 10 centavos:");
        qtdDezCents = Integer.parseInt(stQtdDezCents);
        stQtdCincoCent = JOptionPane.showInputDialog(null,"Quantidade de moedas de 5 centavos");
        qtdCincoCent = Integer.parseInt(stQtdCincoCent);
        stQtdUmCent = JOptionPane.showInputDialog(null,"Quantidade de moedas de 1 centavo");
        qtdUmCent = Integer.parseInt(stQtdUmCent);

        //cálculo valor total
        valorTotal = (qtdReais * 1.0) + (qtdCinquentaCents * 0.5) + (qtdVinteCincoCents * 0.25) + (qtdDezCents + 0.1) + (qtdCincoCent * 0.05) + (qtdUmCent * 0.01);

        //Saída de dados
        JOptionPane.showMessageDialog(null,"O valor poupado foi de: R$"+valorTotal);


    }
}
