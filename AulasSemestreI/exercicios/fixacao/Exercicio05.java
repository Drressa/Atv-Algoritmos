import  javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {
        /* Ler um valor em reais e exibir o equivalente em dólares.
        Considere o dólar em 5,00; */

        double n1, dolar, convertRealDolar;
        String sn1;

        sn1 = JOptionPane.showInputDialog(null,"Insira o valor é reais:");
        n1 = Double.parseDouble(sn1);
        dolar = 5.00;
        convertRealDolar = (n1*dolar);
        JOptionPane.showMessageDialog(null,n1+" equivalente a "+convertRealDolar+" dólares");

    }
}
