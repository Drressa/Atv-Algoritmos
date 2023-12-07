
import javax.swing.JOptionPane;
public class EXER19 {
    public static void main(String[] args) {

        /*
            19. A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito
            há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento
            que ele deve consumir. Sabendo qeu o anel com chip custa R$4.00 e o anel de alimento custa R$3.50, faça
            um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos.
         */

        //Declarar variáveis
        int  numFrangos;
        String sTNumFrangos;
        double custoMarcacao;


        // Captar dado do usuário
        sTNumFrangos = JOptionPane.showInputDialog(null,"Insira a quantidade de frangos:");
        // Converter String para Int
        numFrangos = Integer.parseInt(sTNumFrangos);

        //calcular o custo para marcar todos os frangos;
        custoMarcacao = numFrangos * (4.00 + 7.00); //ident = 4.00 e foodRing = 2*3.50 = 7.00

        //retornar para o usuário o gasto total da granja;
        JOptionPane.showMessageDialog(null,"Número de frangos: "+numFrangos+"\n"+"O custo total é de: R$"+custoMarcacao);

    }
}

