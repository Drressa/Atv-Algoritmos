import javax.swing.JOptionPane;

public class EXER26 {

    public static void main(String[] args) {
        /* 26. Os três primeiros colocados em um jogo têm direito  a um prêmio de R$500.000,00. O prêmio deve ser
            dividido proporcionalmente entre os três, de acordo com o total de pontos obtidos de cada um. Faça um
            algoritmo para ler o nome  e quantos pontos cada um participante obteve, e exibir quanto caberá de prêmio
            para cada um.*/

        //declarar variáveis
        double pontosPrimeiro, pontosSegundo, pontosTerceiro;
        String primeiroColocado, segundoColocado, terceiroColocado, stPontosPrimeiro, stPontosSegundo, stPontosTerceiro;
        double premio1, premio2, premio3;


        //entrada de dados
        primeiroColocado = JOptionPane.showInputDialog(null, "Nome do primeiro colocado:");
        
        stPontosPrimeiro = JOptionPane.showInputDialog(null, "Informe a quantidade de pontos do" + " primeiro colocado:");
        
        segundoColocado = JOptionPane.showInputDialog(null, "Nome do segundo colocado:");
        
        stPontosSegundo = JOptionPane.showInputDialog(null, "Informe a quantidade de pontos do" + " segundo colocado:");
        
        terceiroColocado = JOptionPane.showInputDialog(null, "Nome do terceiro colocado:");
        
        stPontosTerceiro = JOptionPane.showInputDialog(null, "Informe a quantidade de pontos do" + " terceiro colocado:");

        //conversão de String para Int
        pontosPrimeiro = Double.parseDouble(stPontosPrimeiro);
        
        pontosSegundo = Double.parseDouble(stPontosSegundo);
        
        pontosTerceiro = Double.parseDouble(stPontosTerceiro);

        //calculo do prêmio
        premio1 = (pontosPrimeiro / (pontosPrimeiro + pontosSegundo + pontosTerceiro) * 500000);
        
        premio2 = (pontosSegundo / (pontosPrimeiro + pontosSegundo + pontosTerceiro) * 500000);
        
        premio3 = (pontosTerceiro / (pontosPrimeiro + pontosSegundo + pontosTerceiro) * 500000);

        // Saída de dados
        JOptionPane.showMessageDialog(null, "1º lugar: " + primeiroColocado + " - R$" + premio1 + "\n" +
                "2º lugar: " + segundoColocado + " - R$" + premio2 + "\n" + "3º lugar: " + terceiroColocado + " - R$" + premio3);

    }
}
