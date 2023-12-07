

import javax.swing.JOptionPane;

public class EXER28 {
    public static void main(String[] args) {

        /*
            Ler o valor de um cheque e escrever o quanto vai ser recolhido de CPMF. Considere que
            o imposto recolhe um taxa de 0,38%
         */


        //declarar variáveis
        double cheque, CPMF, chequeDesc;
        String stCheque;

        //entrada de dados
        stCheque = JOptionPane.showInputDialog(null, "Iforme o valor do CHEQUE:");
        cheque = Double.parseDouble(stCheque);

        //cálculo valor de desconto do CPMF
        CPMF = cheque * 0.0038;
        chequeDesc = cheque - CPMF;

        //saída de dados
        JOptionPane.showMessageDialog(null, "Valor cheque: R$" + cheque + "\n" +
                "CPMF: R$" + CPMF + "\n" + "Valor atualizado: R$" + chequeDesc);

    }
}
