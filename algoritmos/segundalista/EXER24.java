

import javax.swing.JOptionPane;

public class EXER24 {
    public static void main(String[] args) {

        /*
            24. Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de sudo de maracujá. Faça
            um algoritmo para calcular quantos litros de água  e de suco são necessário  para se fazer  X litros
            de refresco (informados pelo usuário).
         */

        //declarar variáveis
        int refresco, aguaMineral, sucoMaracuja;
        String stRefresco;

        //entrada de dados
        stRefresco = JOptionPane.showInputDialog(null, "Quantos litros de refresco deseja fazer?");
        refresco = Integer.parseInt(stRefresco);

        //cálculo quantidade de água
        aguaMineral = ((8 * refresco) / 10);
        //cálculo quantidade de suco
        sucoMaracuja = ((2 * refresco) / 10);

        //saída de dados
        JOptionPane.showMessageDialog(null, "Para fazer" + refresco + " litros de refresco, você precisará de:" + "\n" +
                "- " + aguaMineral + " litros de água mineral" + "\n" + "- " + sucoMaracuja + " litros de suco de maracujá");


    }
}
