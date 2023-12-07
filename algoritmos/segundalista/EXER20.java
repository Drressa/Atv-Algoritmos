
import javax.swing.JOptionPane;

public class EXER20 {
    public static void main(String[] args) {

        /*
            20. Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos.
            Faça um algoritmo para calcular quantos novelos de lã ela gasta por blusa.

            Complemento: Blusa/suéter gasta 5 novelos de 40 gramas. A lã Mollet sai por R$ 9,26 o pacote com
            5 novelos. Desconsidere consumo de energia elétrica e afins.
         */

        //declarar variáveis
        int numBlusas, qtdNovelos;
        String sTNumBlusas;
        double custoProducao;

        //captar dados do usuário
        sTNumBlusas = JOptionPane.showInputDialog(null,"Número de blusas/suéteres:");
        //Converter String em Int
        numBlusas = Integer.parseInt(sTNumBlusas);

        //calcula o núemro de novelos gasto por blusa
        qtdNovelos = numBlusas * 5;
        //calcula o custo em cada blusa
        custoProducao = ((qtdNovelos/5) * 9.26);

        //retorna ao usuário o dado requerido
        JOptionPane.showMessageDialog(null,"Quantidade de blusas/suéteres: "+numBlusas+
                "\n"+"Quantidade de novelos: "+qtdNovelos+"\n"+"Custo de produção: R$"+custoProducao);



    }
}
