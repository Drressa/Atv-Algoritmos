import javax.swing.JOptionPane;

public class EXER16 {

    public static void main(String[] args) {

        /* 16. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias
            de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo
            ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
            que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
            quilos) de queijo, presunto e carne necessários para a compra. */

        //declarar variáveis
        int sanduiche;
        String stSanduiche;
        double kgQueijo, kgPresunto, kgCarneH;


        //ingredientes convertidos em kilograma

        stSanduiche = JOptionPane.showInputDialog(null,"Número de sanduíches:");
        sanduiche = Integer.parseInt(stSanduiche);


        //inicializar as variáveis.

        //Quantidade em kg de queijo:
        kgQueijo = sanduiche * 2 * 0.05;
        //Quantidade em kg de preseunto:
        kgPresunto = sanduiche * 0.05;
        //Quantidade em kg de carne de hambúrguer:
        kgCarneH = sanduiche * 0.1;

        //Retorna para o usuário as informações pedidas ao final do enunciado.
        JOptionPane.showMessageDialog(null,"Quantidade de hambúrgueres: "+sanduiche+"\n" +
                "Quantidade queijo: "+kgQueijo+"kg"+"\n"+ "Quantidade presunto: "+kgPresunto+"kg"+"\n"+
                "Quantidade carne: "+kgCarneH+"kg");

    }
}
