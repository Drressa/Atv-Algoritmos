import  javax.swing.JOptionPane;

public class CalculadoraSimples {

    public static void main(String[] args) {

        /* Var n1, n2, soma, sub, mul, divisao: real;
        Inicio ler n1; ler n2;
            soma <- n1 + n2;
            sub <- n1 - n2;
            mul <- n1 * n2;
            divisao <- n1/n2

            escreve"O soma é "+soma;
            escreve"A subração é " + sub;
            escreve" A multiplicação é " + mul;
            escreve" A divisão é " + dvisao;
             */

        double n1, n2, soma, sub, mul, divisao;
        String sn1, sn2;

        sn1 = JOptionPane.showInputDialog(null,"Primeiro valor é: ");
        sn2 = JOptionPane.showInputDialog(null,"Segundo valor é: ");

        n1 = Double.parseDouble(sn1);
        n2 = Double.parseDouble(sn2);

        soma=(n1+n2);
        sub=(n1-n2);
        mul=(n1*n2);
        divisao=(n1/n2);

        JOptionPane.showMessageDialog(null,"Soma é "+soma+"\n"+"Subtração é: "+sub+"\n"+"Multiplicação é "+mul+"\nDivisão é "+divisao);



    }
}
