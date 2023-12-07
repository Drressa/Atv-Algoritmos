
import javax.swing.JOptionPane;

public class EXER21 {
    public static void main(String[] args) {

        /*
           21. A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350ml,
           garrafa de 600ml e garrafa de 2 litros. Se um comerciantes compra uma de terminada quantidade
           de cada formato, faça um algoritmo calcular quantos litros de refrigerante ele comprou.
         */

        //declarar variáveis
        int produto,qtdProduto;
        String stProduto, stQtdProduto;
        double volLata, volGarrafa1, volGarrafa2;

        //captar dados dos usuário
        stProduto = JOptionPane.showInputDialog(null,"Selecione o produto desejado:"+"\n"+
                "1 - lata (350 ml)"+"\n"+"2 - garrafa (600 ml)"+"\n"+"3 - garrafa (2L)");
        //converter String em número
        produto = Integer.parseInt(stProduto);


        //estrutura de decisão

        switch (produto)
        {
            case 1: // digitou 1 (lata)

                //usuário informa qtd de latas desejada
                stQtdProduto = JOptionPane.showInputDialog(null,"Informe a quantidade de latas desejada:");
                qtdProduto = Integer.parseInt(stQtdProduto);

                //calculo volume da lata (350 ml = 0,35L)
                volLata = qtdProduto * 0.35;
                JOptionPane.showMessageDialog(null,"Comprou: "+qtdProduto+" latas,"+"\n" +volLata+"L de refrigerante.");
                break;

            case 2: //digitou 2 (garrafa 600 ml)

                //usuário informa qtd de garrafas (600 ml) desejada
                stQtdProduto = JOptionPane.showInputDialog(null,"Informe a quantidade de garrafas (600 ml) desejada:");
                qtdProduto = Integer.parseInt(stQtdProduto);

                //calculo volume da garrafa (600 ml = 0,6L)
                volGarrafa1 = qtdProduto * 0.6;
                JOptionPane.showMessageDialog(null,"Comprou: "+qtdProduto+" garrafas (600 ml),"+"\n"
                        +volGarrafa1+"L de refrigerante.");
                break;

            case 3: //digitou 3 (garrafa 2L)

                //usuário informa qtd de garrafas (2L) desejada
                stQtdProduto = JOptionPane.showInputDialog(null,"Informe a quantidade de garrafas (2L) desejada:");
                qtdProduto = Integer.parseInt(stQtdProduto);

                //calculo volume da garrafa (2L)
                volGarrafa1 = qtdProduto * 2.0;
                JOptionPane.showMessageDialog(null,"Comprou: "+qtdProduto+" garrafas (2L),"+"\n"
                        +volGarrafa1+"L de refrigerante.");
                break;

            default: // digitou valor inexistente das alternativas (produto <= 0 && produto > 3)

                JOptionPane.showMessageDialog(null,"Opção inexistente");
                break;

        }


    }
}
